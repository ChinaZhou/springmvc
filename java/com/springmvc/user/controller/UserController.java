package com.springmvc.user.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.user.dto.UserDto;
import com.springmvc.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(method=RequestMethod.GET)
	public String list(HttpServletRequest request){
		
		List<UserDto> userDtos = userService.getAllUser();
		request.setAttribute("userList", userDtos);
		return "/WEB-INF/user/list";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="{id}")
	public String detail(HttpServletRequest request, @PathVariable("id")String id){
		System.out.println("id = "+id);
		if (StringUtils.isNotBlank(id)) {
			UserDto userDto = userService.getUserById(id);
			request.setAttribute("user", userDto);
		}
		
		return "/WEB-INF/user/detail";
	}
}
