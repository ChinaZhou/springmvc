package com.springmvc.user.service;

import java.util.List;

import com.springmvc.user.dto.UserDto;

public interface UserService {

	public String addUser(UserDto userDto);
	
	public List<UserDto> getAllUser();
	
	public UserDto getUserById(String id);
	
	public int deleteUserById(String id);
	
	public int updateUser(UserDto user);
}
