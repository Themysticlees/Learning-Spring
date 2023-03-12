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
	
	
	//add the init-method
	public void demoInitMethod() {
		System.out.println("Inside demo Init-Method");
	}
	
	//add the destroy-method
	public void demoDestroyMethod() {
		System.out.println("Inside the demo Destroy-Method");
	}

}
