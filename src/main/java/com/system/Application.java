package com.system;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	// Always use UTC-TIME
	@PostConstruct
	void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}