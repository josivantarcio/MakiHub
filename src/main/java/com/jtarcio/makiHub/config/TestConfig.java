package com.jtarcio.makiHub.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.jtarcio.makiHub.entities.User;
import com.jtarcio.makiHub.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Josevan", "josevan@email.com", "8899999999", "123456789");
		User u2 = new User(null, "Antonio", "antonio@email.com", "9988888888", "987654321");
		User u3 = new User(null, "Maria", "maria@email.com.br", "9911111111", "232323");

		userRepository.saveAll(Arrays.asList(u1, u2, u3));

	}
}
