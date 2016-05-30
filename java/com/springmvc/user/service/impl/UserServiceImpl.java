package com.springmvc.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.user.dao.UserDao;
import com.springmvc.user.dto.UserDto;
import com.springmvc.user.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	@Override
	public String addUser(UserDto userDto) {
		String id = userDao.addUser(userDto);
		return id;
	}

}
