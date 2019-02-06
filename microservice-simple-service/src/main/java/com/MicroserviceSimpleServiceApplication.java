package com;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MicroserviceSimpleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceSimpleServiceApplication.class, args);
	}
	@GetMapping("/service")
	public List<String> execute() {
		return Arrays.asList("value1" , "value2");
	}

}

