package com.springmvc.comm.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

/**
 * 异常处理类
 * 
 * @author zhouc
 * 
 */
public class CommonExceptionResolver extends SimpleMappingExceptionResolver 
implements HandlerExceptionResolver{
	   
	    static ApplicationContext factory=new ClassPathXmlApplicationContext("/core/application-context.xml");
        @Override  
	    public ModelAndView resolveException(HttpServletRequest request,  
	            HttpServletResponse response, Object handler, Exception ex) {  
        	String viewName = determineViewName(ex, request); 
        	System.out.println(" exception viewName = "+viewName);
        	ex.printStackTrace();
        	return new ModelAndView(viewName);
            
        }
       
  } 


