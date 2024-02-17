package com.isaac.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isaac.course.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResources {
	@GetMapping
	public ResponseEntity<User> findAll(){
		return ResponseEntity.ok().body(new User(1L, "Isaac Roque", "isaacroque0209@gmail.com", "229881164343", "isaacroque"));
	}
}
