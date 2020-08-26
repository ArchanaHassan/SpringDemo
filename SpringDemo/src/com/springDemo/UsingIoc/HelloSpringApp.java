package com.springDemo.UsingIoc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//Load the spring configuration files
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//Retrieve a bean from a spring container
		Coach theCoach=context.getBean("myCoach",Coach.class);
		//Call method on the bean 
		System.out.println(theCoach.getDailyWorkOut());
		//Close the context
		context.close();
	}

}
