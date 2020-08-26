package com.springDemo.DI_ConstructorInjection;

public class BaseBallCoach implements Coach {

	// define a private field for the Dependency 
	private FortuneService fortuneService;
	
	public BaseBallCoach(FortuneService theFortuneService) {
		
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "BaseBallCoach Implements Coach interface";

	}

	@Override
	public String getDailyFortune() {
		//Use my fortuneService to get a fortune
		return fortuneService.getFortune() ;
	}

}
