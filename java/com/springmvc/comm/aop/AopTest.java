package com.springmvc.comm.aop;

public class AopTest {
	
	public void before(){
		System.out.println("aop配置文件测试调用，befores");
	}
	
	public void after(){
		System.out.println("aop配置文件测试调用，after");
	}

}
