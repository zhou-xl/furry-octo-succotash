package com.auto.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.auto.dao.UserMapper;
import com.auto.entity.User;
import com.auto.service.UserService;


@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;
	
	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		userMapper.insert(user);
	}

	@Override
	public List<User> getUserList(User user) {
		return userMapper.getUserList(user);
	}

}
