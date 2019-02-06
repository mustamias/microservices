package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MicroserviceSimpleService3Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceSimpleService3Application.class, args);
	}

	@GetMapping("/execute")
	public String execute() {
		return "Executing ... ";
	}
}

