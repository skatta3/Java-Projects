package com.spring.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/*
 * How to get spring application context object reference?
 */
public class ApplicationContextProvider implements ApplicationContextAware{
		 
	    private static ApplicationContext context;
	     
	    public ApplicationContext getApplicationContext() {
	        return context;
	    }
	     
	
	    public void setApplicationContext(ApplicationContext ac) throws BeansException {
	        context = ac;
	    }
	}
