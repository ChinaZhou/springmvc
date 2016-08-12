package com.springmvc.user;

import java.util.List;

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
	public void testGetAllUser(){
		UserServiceImpl userServiceImpl = (UserServiceImpl) factory.getBean("userServiceImpl");
		List<UserDto> userList = userServiceImpl.getAllUser();
		System.out.println("userList size = "+userList.size());
	}
}
