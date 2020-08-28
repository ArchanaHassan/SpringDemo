package com.springDemo.DI_SettersInjection.LiteralValues.PropertiesFile;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//Load the spring configuration files
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContextDiSetterInjectionPropertiesFile.xml");
		//Retrieve a bean from a spring container
		TrackCoach theCoach=context.getBean("trackCoach",TrackCoach.class);
		//Call method on the bean 
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		//Close the context
		context.close();
	}
}