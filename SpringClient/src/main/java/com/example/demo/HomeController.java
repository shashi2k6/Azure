package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HomeController {
	
	@Value("${app.name:Spring  client app message}")
	private String appname;

	@GetMapping("/")
	public String home() {
		return "Welcome to :"+appname;
	}
}
