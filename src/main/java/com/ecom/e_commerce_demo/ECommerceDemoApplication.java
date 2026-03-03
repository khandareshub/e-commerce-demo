package com.ecom.e_commerce_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ECommerceDemoApplication {

	@GetMapping("/greetings/{name}")
	
	public String greetings(@PathVariable String name)
	{
			return "Hello "+name+" 	Congratulation you have successfully completed the devops course.";
	}
	public static void main(String[] args) {
		SpringApplication.run(ECommerceDemoApplication.class, args);
	}

}
