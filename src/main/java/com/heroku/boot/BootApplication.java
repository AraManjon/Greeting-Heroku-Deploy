package com.heroku.boot;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(GreetingRepository greetingRepository){
		return args -> {
			greetingRepository.save(new Greeting("hello"));
			greetingRepository.save(new Greeting("hi"));
		};
	}
}
