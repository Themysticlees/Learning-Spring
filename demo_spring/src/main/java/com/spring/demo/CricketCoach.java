package com.spring.demo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//Fields whose values will be injected
	private String emailAddress;
	private String team;
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	//Spring will inject the literal values found in the xml file
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}
	
	//Spring will inject the literal values found in the xml file
	public void setTeam(String team) {
		this.team = team;
	}

	//Spring will inject the dependency through setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter method");
		this.fortuneService = fortuneService;
	}

	//@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run around the field 5 times.";
	}

	//@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
