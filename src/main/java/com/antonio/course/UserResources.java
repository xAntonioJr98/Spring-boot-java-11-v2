package com.antonio.course;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.antonio.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
	
	@GetMapping
	public ResponseEntity<User> findALL(){
		User u = new User(1, "antonio", "actorresjunior@gmail.com", "11111111", "1234");
		return ResponseEntity.ok().body(u);
	}
}
