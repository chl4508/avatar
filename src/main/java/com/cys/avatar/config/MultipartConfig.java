package com.cys.avatar.config;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;

import jakarta.servlet.MultipartConfigElement;

@Configuration
public class MultipartConfig {

	@Bean
	public MultipartResolver multipartResolver() {
		return new StandardServletMultipartResolver();
	}

	@Bean
	public MultipartConfigElement multipartConfigElement() {
		MultipartConfigFactory factory = new MultipartConfigFactory();
		long maxUploadSize = 10485760;
		factory.setMaxRequestSize(DataSize.ofBytes(maxUploadSize));
		long maxUploadSizePerFile = 10485760;
		factory.setMaxFileSize(DataSize.ofBytes(maxUploadSizePerFile));

		return factory.createMultipartConfig();
	}
}
