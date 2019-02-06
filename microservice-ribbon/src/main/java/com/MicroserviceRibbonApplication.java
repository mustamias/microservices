package com;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@RestController
public class MicroserviceRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceRibbonApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/start")
	public String startClient() {
		return this.restTemplate.getForObject("http://localhost:7000/execute", String.class);
	}

}

