package com.springDemo.DI_SettersInjection;

public class TrackCoach implements Coach {
   private FortuneService fortuneService;
   
	public TrackCoach() {
	
                        }
	
	public void setFortuneService(FortuneService theFortuneService) {
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
