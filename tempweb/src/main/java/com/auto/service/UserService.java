package com.auto.service;

import java.util.List;

import com.auto.entity.User;


public interface UserService {

	public void insert(User user);

	
	public List<User> getUserList(User user);
}
