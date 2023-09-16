package com.speakingclock.speakingclock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "SpeakingClock",
				description = "This is a Java Spring Boot application upon providing time in number format will showup time in words. This application is written in microservice architecture with api implementation.",
				version = "1.0.0"))
public class SpeakingclockApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpeakingclockApplication.class, args);
	}

}
