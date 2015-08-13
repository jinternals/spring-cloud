package com.jinternals.config.client.context;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jinternals.config.client.config.DBConfig;

@Configuration
@ComponentScan({ "com.jinternals.config.client.component" })
public class ClientContext {

	@Bean
	@RefreshScope
	DBConfig getTestConfig() {
		return new DBConfig();
	}

}
