package com.springDemo.DI_SettersInjection.LiteralValues.PropertiesFile;

public class TrackCoach  {
   
   private String email;
   private String team;
   
	public TrackCoach() {
							System.out.println("No arguments constructor");
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

	

}
