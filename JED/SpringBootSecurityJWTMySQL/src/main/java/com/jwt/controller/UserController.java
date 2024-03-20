package com.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.model.User;
import com.jwt.model.UserRequest;
import com.jwt.model.UserResponse;
import com.jwt.service.IUserService;
import com.jwt.util.JwtUtil;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService service;
	
	@Autowired
	private JwtUtil util;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveUser(@RequestBody User user) {
		Integer id = service.saveUser(user);
		
		java.lang.String body = "User '"+id+"' saved";
		return ResponseEntity.ok(body);
	}
	
	//Validate user and generate token (login)
	@PostMapping("/login")
	public ResponseEntity<UserResponse> loginUser(@RequestBody UserRequest request) {
		String token = util.generateToken(request.getUsername());
		return ResponseEntity.ok(new UserResponse(token,"Success!"));
	}
	
}