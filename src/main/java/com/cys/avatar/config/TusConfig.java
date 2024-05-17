package com.cys.avatar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import me.desair.tus.server.TusFileUploadService;

@Configuration
public class TusConfig {

	String tusStoragePath = "/file/image/";

	Long tusExpirationPeriod = 60000L;


	@Bean
	public TusFileUploadService tusFileUploadService() {
		return new TusFileUploadService().withStoragePath(tusStoragePath)
			.withUploadURI("/tus/image/upload")
			.withUploadExpirationPeriod(tusExpirationPeriod);
	}

}
