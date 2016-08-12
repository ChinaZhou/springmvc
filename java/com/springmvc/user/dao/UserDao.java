package com.springmvc.user.dao;

import java.util.List;

import com.springmvc.user.dto.UserDto;

public interface UserDao {

	/**
	 * 添加用户
	 * @param userDto
	 * @return
	 */
	public String addUser(UserDto userDto);
	
	/**
	 * 得到所有的用户信息
	 * @param userDto
	 * @return
	 */
	public List<UserDto> getAllUser();
	
	/**
	 * 通过Id得到User信息
	 * @param id
	 * @return
	 */
	public UserDto getUserById(String id);
	
	/**
	 * 通过Id删除User信息
	 * @param id
	 * @return
	 */
	public int deleteUserById(String id);
	
	/**
	 * 更新用户信息
	 * @param id
	 * @return
	 */
	public int updateUser(UserDto user);
}
