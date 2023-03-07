package com.spring.demo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	//Bean provided through Constructor injection
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	
	//@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run 5 km";
	}

	//@Override 
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do It!"+fortuneService.getFortune();
	}

}
