package com.jtarcio.makiHub.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jtarcio.makiHub.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Guilherme", "guilherme@email.com", "889999-9999", "admin123");
		return ResponseEntity.ok().body(u);
	}
}
