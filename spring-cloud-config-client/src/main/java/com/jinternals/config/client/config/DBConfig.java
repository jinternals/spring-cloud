package com.jinternals.config.client.config;

import org.springframework.beans.factory.annotation.Value;

public class DBConfig {

	@Value("${db.username}")
	String username;

	@Value("${db.url}")
	String url;

	@Value("${db.password}")
	String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

}
