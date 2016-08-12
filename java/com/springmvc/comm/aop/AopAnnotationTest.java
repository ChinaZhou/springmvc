package com.springmvc.comm.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopAnnotationTest {
	
	@Around("execution(* com.springmvc.*.service.*.*(..))")
	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		before();
		Object result = pjp.proceed();
		after();
		return result;
	}
	
	public void before(){
		System.out.println("aop注解测试调用，befores");
	}
	
	public void after(){
		System.out.println("aop注解测试调用，after");
	}

}
