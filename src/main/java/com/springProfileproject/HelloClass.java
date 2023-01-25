package com.springProfileproject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile(value={"dev","pro","test"})
public class HelloClass {

	@Value("${message}")
	private String welcomeMessage;

	@Profile("pro")
	@GetMapping("/hello")
	public String methodNamePro() {

		return welcomeMessage;

	}
	@Profile("dev")
	@GetMapping("/hello1")
	public String methodNamedev() {

		return welcomeMessage;

	}
	@Profile("test")
	@GetMapping("/hello2")
	public String methodNameTest() {

		return welcomeMessage;

	}

}
