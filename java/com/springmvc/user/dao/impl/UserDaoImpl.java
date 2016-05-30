package com.springmvc.user.dao.impl;

import org.springframework.stereotype.Service;

import com.springmvc.comm.dao.impl.BaseIbatisDaoImpl;
import com.springmvc.user.dao.UserDao;
import com.springmvc.user.dto.UserDto;

@Service
public class UserDaoImpl extends BaseIbatisDaoImpl implements UserDao{

	@Override
	public String addUser(UserDto userDto) {
		return (String) super.insert("user.addUser", userDto);
	}

}
