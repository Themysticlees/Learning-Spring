package com.spring.demo;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	//Constructor dependency injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins on practive";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
