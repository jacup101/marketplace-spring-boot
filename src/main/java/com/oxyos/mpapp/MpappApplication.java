package com.oxyos.mpapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MpappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MpappApplication.class, args);
	}

	@RequestMapping("/")
	public String mpAppHello() {
		return "Hello, welcome to the MP Web API";
	}

}
