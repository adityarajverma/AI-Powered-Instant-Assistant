package com.instant_assistant;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InstantAssistantApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstantAssistantApplication.class, args);
	}

}
