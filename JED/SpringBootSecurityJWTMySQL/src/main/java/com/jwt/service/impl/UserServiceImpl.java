package com.jwt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwt.model.User;
import com.jwt.repo.UserRepository;
import com.jwt.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	private UserRepository repo;
	
	@Override
	public Integer saveUser(User user) {
		
		return repo.save(user).getId();
	}
}
