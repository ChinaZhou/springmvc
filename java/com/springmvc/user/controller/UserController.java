package com.springmvc.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.user.dto.UserDto;
import com.springmvc.user.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/user/login.do")
	public String login(HttpServletRequest request,HttpServletResponse response,UserDto userDto){
	
		String id = userService.addUser(userDto);
		System.out.println("id = "+id);
		request.setAttribute("userDto", userDto);
			
		return "/WEB-INF/admin/main";
	}
}
