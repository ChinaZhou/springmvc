package com.springmvc.user.dao;

import com.springmvc.user.dto.UserDto;

public interface UserDao {

	/**
	 * 添加用户
	 * @param userDto
	 * @return
	 */
	public String addUser(UserDto userDto);
}
