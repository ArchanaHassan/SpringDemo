package com.springDemo.DI_SettersInjection;

public class TrackCoach implements Coach {
   private FortuneService fortuneService;
   
	public TrackCoach() {
							System.out.println("No arguments constructor");
                        }
	
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("Inside setter methods - setFortuneService");
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		
		return "I am in a trackCoach";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
