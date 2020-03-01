package com.taazsoft.springbootfirebase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taazsoft.springbootfirebase.UserDto;
import com.taazsoft.springbootfirebase.model.User;
import com.taazsoft.springbootfirebase.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping
	public ResponseEntity<String> createUser(@RequestBody UserDto userDto) {
		String response = userService.createUser(userDto);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

	@PutMapping("/{userId}")
	public ResponseEntity<String> updateUser(@RequestBody UserDto userDto, @PathVariable String userId) {
		String response = userService.updateUser(userId, userDto);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

	@GetMapping("/{userId}")
	public ResponseEntity<User> getUser(@PathVariable String userId) {
		User response = userService.getUser(userId);
		return new ResponseEntity<User>(response, HttpStatus.OK);
	}

	@DeleteMapping("/{userId}")
	public ResponseEntity<String> deleteUser(@PathVariable String userId) {
		String response = userService.deleteUser(userId);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<User>> getUser() {
		List<User> response = userService.getAllUser();
		return new ResponseEntity<List<User>>(response, HttpStatus.OK);
	}
}
