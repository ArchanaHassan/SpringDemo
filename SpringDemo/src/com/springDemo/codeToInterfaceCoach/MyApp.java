package com.springDemo.codeToInterfaceCoach;

public class MyApp {

	public static void main(String[] args) {
		// Create the Object
		
		Coach baseBallCoach=new BaseBallCoach();
		Coach trackCoach=new TrackCoach();	
		//Use the Object
		System.out.println("Call :"+baseBallCoach.getDailyWorkOut());
		System.out.println("Call :"+trackCoach.getDailyWorkOut());
		
 
	}

}
