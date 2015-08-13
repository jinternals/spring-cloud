package com.jinternals.config.client.main;

import java.lang.reflect.Field;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.jinternals.config.client.context.ClientContext;

@Configuration
@EnableAutoConfiguration
@Import({ ClientContext.class })
public class Application {

	static {
		try {
			Class<?> cls = Class.forName("javax.crypto.JceSecurity");
			Field field = cls.getDeclaredField("isRestricted");
			field.setAccessible(true);
			field.set(null, java.lang.Boolean.FALSE);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

	}

}
