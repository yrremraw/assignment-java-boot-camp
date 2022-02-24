package com.example.assignment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Assignment1Application {
	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void initialData() {
		User user = new User();
		user.setName("warm");
		userRepository.save(user);

	}

	public static void main(String[] args) {
		SpringApplication.run(Assignment1Application.class, args);
	}
}
