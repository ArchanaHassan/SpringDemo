package com.springDemo.BeanLifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// Load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanLifeCycleApplicationContext.xml");
		
		// Retrieve bean from spring container 
        Coach coach=context.getBean("myCoach",Coach.class);
       System.out.println(coach.getDailyWorkOut());
       
        context.close();
        
        	
	}

}
