package com.auto.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.auto.entity.User;
import com.auto.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	private static final String user_show = "user_show";
	
	@Resource
	private UserService userService;
	
	@RequestMapping("/getUserList")
	public ModelAndView getUserList() {
		ModelAndView modelAndView = new ModelAndView(user_show);
		List<User> users = userService.getUserList(null);
		System.out.println(users);
		modelAndView.addObject("userList", users);
		return modelAndView;
	}
}
