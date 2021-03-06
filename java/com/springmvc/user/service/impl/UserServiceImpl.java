package com.springmvc.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.comm.annotation.Tag;
import com.springmvc.user.dao.UserDao;
import com.springmvc.user.dto.UserDto;
import com.springmvc.user.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	@Tag
	@Override
	public String addUser(UserDto userDto) {
		String id = userDao.addUser(userDto);
		return id;
	}

	@Tag
	@Override
	public List<UserDto> getAllUser() {
		return userDao.getAllUser();
	}

	@Override
	public UserDto getUserById(String id) {
		return userDao.getUserById(id);
	}

	@Override
	public int deleteUserById(String id) {
		return userDao.deleteUserById(id);
	}

	@Override
	public int updateUser(UserDto user) {
		return userDao.updateUser(user);
	}

}
