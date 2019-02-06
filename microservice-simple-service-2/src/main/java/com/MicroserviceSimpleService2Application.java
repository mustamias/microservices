package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MicroserviceSimpleService2Application {
	
	@Value("${server.port}")
	public String port;
	
	@GetMapping("/execute")
	public String execute() {
		return "hello from port: " + this.port;
	}
	
	@GetMapping("/")
	public String status() {
		return "Up";
	}


	public static void main(String[] args) {
		SpringApplication.run(MicroserviceSimpleService2Application.class, args);
	}

}

