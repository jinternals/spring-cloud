package com.jinternals.config.client.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.jinternals.config.client.context.ClientContext;

@Configuration
@EnableAutoConfiguration
@Import({ ClientContext.class })
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

	}

}
