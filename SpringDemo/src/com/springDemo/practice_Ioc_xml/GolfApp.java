package com.springDemo.practice_Ioc_xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GolfApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach golfCoach=context.getBean("golfCoach", Coach.class);
		System.out.println("Golf "+golfCoach.getDailyWorkout());
		System.out.println("Message"+golfCoach.getDailyMessage());
		context.close();
	
	}

}
