package com.springDemo.BeanLifeCycle;

public class TrackCoach implements Coach {
   

	@Override
	public String getDailyWorkOut() {
		
		return "I am in a trackCoach";
	}
	//add an init method
	public void doMyStartUpStuff()
	{
		System.out.println("TrackCoach: inside method doMyStartupstuff");
	}
	//add a destroy method 
	public void doMyCleanUpstuff()
	{
		System.out.println("TrackCoach: inside methoad doMyCleanUpStuff");
	}
}
