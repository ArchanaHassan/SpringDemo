package com.springDemo.practice_Ioc_xml;

public class GolfCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return " I am playing daily Golf in Bangalore";
	}

	@Override
	public String getDailyMessage() {
		
		return " hmmm good to hear that you r practicing  golf every day";
	}

}
