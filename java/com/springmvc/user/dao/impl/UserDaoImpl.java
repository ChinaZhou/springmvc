package com.springmvc.user.dao.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springmvc.comm.dao.impl.BaseIbatisDaoImpl;
import com.springmvc.comm.dao.impl.BaseMybatisDaoImpl;
import com.springmvc.user.dao.UserDao;
import com.springmvc.user.dto.UserDto;

@SuppressWarnings("unchecked")
@Service
public class UserDaoImpl extends BaseMybatisDaoImpl implements UserDao{

	@Override
	public String addUser(UserDto userDto) {
		return (String) super.insert("user.addUser", userDto);
	}

	@Override
	public List<UserDto> getAllUser() {
		return (List<UserDto>)super.getList("user.getAllUser");
	}

	@Override
	public UserDto getUserById(String id) {
		return (UserDto) this.getOne("user.getUserById", id);
	}

	@Override
	public int deleteUserById(String id) {
		return (int) this.delete("user.deleteUserById", id);
	}

	@Override
	public int updateUser(UserDto user) {
		return (int) this.update("user.updateUser", user);
	}

}
