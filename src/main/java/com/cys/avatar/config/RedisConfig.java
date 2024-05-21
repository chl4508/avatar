package com.cys.avatar.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.util.StringUtils;
import org.webjars.NotFoundException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
//@EnableCaching
public class RedisConfig {

	private final ObjectMapper objectMapper;
	@Value("${spring.data.redis.port}")
	private int redisPort;
	@Value("${spring.data.redis.host}")
	private String redisHost;
	@Value("${spring.data.redis.username}")
	private String userName;
	@Value("${spring.data.redis.password}")
	private String password;

	public RedisConfig(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}

	@Bean
	public RedisConnectionFactory redisConnectionFactory() {
		RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration();
		redisStandaloneConfiguration.setHostName(redisHost);
		redisStandaloneConfiguration.setPort(redisPort);
		redisStandaloneConfiguration.setUsername(userName);
		redisStandaloneConfiguration.setPassword(password);

		return new LettuceConnectionFactory(redisStandaloneConfiguration);
	}

	@Bean
	public CacheManager redisCacheManager(RedisConnectionFactory cf) {
		RedisCacheConfiguration redisCacheConfiguration = RedisCacheConfiguration.defaultCacheConfig()
			.serializeKeysWith(RedisSerializationContext.SerializationPair.fromSerializer(new StringRedisSerializer()))
			.serializeValuesWith(
				RedisSerializationContext.SerializationPair.fromSerializer(new GenericJackson2JsonRedisSerializer()))
			//.entryTtl(Duration.ofMinutes(3L))
			;

		return RedisCacheManager
			.RedisCacheManagerBuilder
			.fromConnectionFactory(cf)
			.cacheDefaults(redisCacheConfiguration)
			.build();
	}

	@Bean
	public RedisTemplate<String, Object> redisTemplate() {
		RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
		redisTemplate.setConnectionFactory(redisConnectionFactory());

		// 일반적인 key:value의 경우 시리얼라이저
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		redisTemplate.setValueSerializer(new StringRedisSerializer());

		// Hash를 사용할 경우 시리얼라이저
		redisTemplate.setHashKeySerializer(new StringRedisSerializer());
		redisTemplate.setHashValueSerializer(new StringRedisSerializer());

		// 모든 경우
		redisTemplate.setDefaultSerializer(new StringRedisSerializer());

		//spring boot transactional 인식되게 settings
		redisTemplate.setEnableTransactionSupport(true);

		return redisTemplate;
	}

	public void setData(String key, String value) {
		this.redisTemplate().opsForValue().set(key, value);
	}

	public void setData(String key, String value, Long expiredTime) {
		this.redisTemplate().opsForValue().set(key, value, expiredTime, TimeUnit.SECONDS);
	}

	public boolean existsKey(String key) {
		return Boolean.TRUE.equals(redisTemplate().hasKey(key));
	}

	public <T> Optional<T> getData(String key, Class<T> classType) {
		String jsonData = (String)redisTemplate().opsForValue().get(key);

		try {
			if (StringUtils.hasText(jsonData)) {
				return Optional.ofNullable(objectMapper.readValue(jsonData, classType));
			}
			return Optional.empty();
		} catch (JsonProcessingException e) {
			throw new InternalError();
		}
	}

	public List<String> getKeyList(String pattern) {
		List<String> result = new ArrayList<>();
		String removeWildCardPattern = pattern.replace("*", "");

		Set<String> setList = redisTemplate().keys(pattern);
		if (setList == null || setList.isEmpty()) {
			throw new NotFoundException("Not found");
		}
		setList.forEach(data -> result.add(data.replace(removeWildCardPattern + ":", "")));

		return result;
	}

	public <T> List<T> getDataList(String pattern, Class<T> classType) {
		List<T> result = new ArrayList<>();

		Set<String> setList = redisTemplate().keys(pattern);
		if (setList == null || setList.isEmpty()) {
			throw new NotFoundException("Not found");
		}
		setList.forEach(
			data -> result.add(getData(data, classType).orElseThrow(() -> new NotFoundException("Not found"))));

		return result;
	}

	public boolean deleteData(String key) {
		return Boolean.TRUE.equals(redisTemplate().delete(key));
	}

}
