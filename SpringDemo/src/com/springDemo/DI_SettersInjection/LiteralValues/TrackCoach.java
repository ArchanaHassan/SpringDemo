package com.springDemo.DI_SettersInjection.LiteralValues;

public class TrackCoach implements Coach {
   private FortuneService fortuneService;
   private String email;
   private String team;
   
	public TrackCoach() {
							System.out.println("No arguments constructor");
                        }
	
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("Inside setter methods - setFortuneService");
		fortuneService = theFortuneService;
	}
	

	public String getEmail() {
		
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
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
