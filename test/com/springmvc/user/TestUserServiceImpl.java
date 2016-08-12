package com.springmvc.user;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springmvc.user.dto.UserDto;
import com.springmvc.user.service.impl.UserServiceImpl;

public class TestUserServiceImpl {

	private BeanFactory factory;

	@Before
	public void setSpringBeanFactory() {
		if (factory == null) {

			factory = new ClassPathXmlApplicationContext(
					"classpath:core/application-context.xml");
		}

	}
	
	@Test
	public void testAddUser(){
		UserServiceImpl userServiceImpl = (UserServiceImpl) factory.getBean("userServiceImpl");
		UserDto userDto = new UserDto();
		userDto.setUserName("test");
		userDto.setPassword("123123");
		String id = userServiceImpl.addUser(userDto);
		System.out.println("id = "+id);
	}
}
