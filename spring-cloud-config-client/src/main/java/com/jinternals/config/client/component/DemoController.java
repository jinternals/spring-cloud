package com.jinternals.config.client.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jinternals.config.client.config.DBConfig;

@RestController
public class DemoController {

	public DemoController() {
	}

	@Autowired
	DBConfig dbconfig;

	@RequestMapping("/")
	String hello() {
		return "Hello " + dbconfig.getUsername() + "!" + dbconfig.getUrl();
	}
}
