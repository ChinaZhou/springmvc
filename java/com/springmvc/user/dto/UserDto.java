package com.springmvc.user.dto;

import java.io.Serializable;

import com.springmvc.comm.dto.BaseDto;

/**
 * UserDto
 * @author cong
 *
 */
public class UserDto extends BaseDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
