package com.springmvc.user.service.impl;

public class AopTest {
	
	
	public void before(){
		System.out.println("aop测试调用，befores");
	}
	
	public void after(){
		System.out.println("aop测试调用，after");
	}

}
