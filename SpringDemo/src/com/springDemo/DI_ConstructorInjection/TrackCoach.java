package com.springDemo.DI_ConstructorInjection;

public class TrackCoach implements Coach {
   private FortuneService fortuneService;
   
	public TrackCoach(FortuneService theFortuneService) {
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
