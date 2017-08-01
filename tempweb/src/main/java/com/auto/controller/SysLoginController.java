package com.auto.controller;


import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.auto.entity.User;
import com.auto.service.UserService;


/**
 * 后台用户登录
 * @author zxl
 *
 */
@Controller
@RequestMapping("/admin")
public class SysLoginController {

	//返回页面
	private static final String sys_login = "sys/login";//登录页
	
	private static final String sys_main = "sys/main";//后台主页面
	
	
	private Logger logger = LoggerFactory.getLogger(SysLoginController.class);
	
	
	@Resource
	private UserService userService;
	
	/**
	 * @author zxl
	 * 登录页跳转
	 * @return
	 */
	@RequestMapping("/")
	public String toLogin() {
		return sys_login;
	}
	
	@RequestMapping("")
	public String toLogin2() {
		return sys_login;
	}
	
	/**
	 * 用户登录验证
	 * @param request
	 * @param user
	 * @return
	 */
	@RequestMapping("/login")
	public String login(HttpServletRequest request , User user) {
		try {
			List<User> users = userService.getUserList(user);
			if (users.size() > 0) {
				request.setAttribute("user", users.get(0));
			}else {
				request.setAttribute("error_msg", "用户名或密码错误");
//				return sys_login;
			}
		} catch (Exception e) {
			logger.error("SysLoginController.login===>",e);
		}
		
		return sys_main;
	}
}
