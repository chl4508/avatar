package com.cys.avatar.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.v3.core.jackson.ModelResolver;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.OAuthFlow;
import io.swagger.v3.oas.models.security.OAuthFlows;
import io.swagger.v3.oas.models.security.Scopes;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class OpenApiConfig {
	@Value("${springdoc.server-url}")
	private String serverUrl;

	@Bean
	public OpenAPI openAPI(@Value("${springdoc.version}") String appVersion) {
		//log.debug("Server: {}", serverUrl);
		List<Server> servers = new ArrayList<>();
		servers.add(new Server().url(serverUrl));

		Info info = new Info()
			.title("Avatar API")
			.version(appVersion)
			.description("3D 리소스 관리를 위한 서버 API");

		return new OpenAPI()
			.components(new Components()
				// .addSecuritySchemes("Authorization", securityScheme)
				// .addSecuritySchemes("Oauth2.0", oauth2)
			)
			// .security(Arrays.asList(securityRequirementList))
			.info(info)
			.servers(servers);
	}

	@Bean
	public ModelResolver modelResolver(ObjectMapper objectMapper) {
		return new ModelResolver(objectMapper);
	}
}