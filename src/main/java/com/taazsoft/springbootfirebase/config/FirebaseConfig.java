package com.taazsoft.springbootfirebase.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.github.fabiomaffioletti.firebase.EnableFirebaseRepositories;

@Configuration
@EnableFirebaseRepositories
public class FirebaseConfig {
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
