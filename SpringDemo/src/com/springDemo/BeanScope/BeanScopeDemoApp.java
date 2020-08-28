package com.springDemo.BeanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// Load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
		
		// Retrieve bean from spring container 
        Coach coach=context.getBean("myCoach",Coach.class);
        Coach alphaCoach=context.getBean("myCoach",Coach.class);
        // Check if they are same
        boolean result = (coach==alphaCoach);
        // print out the result
        
        System.out.println(result);
        System.out.println(coach);
        System.out.println(alphaCoach);
        context.close();
        
        	
	}

}
