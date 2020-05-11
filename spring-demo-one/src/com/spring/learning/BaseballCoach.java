package com.spring.learning;

public class BaseballCoach implements Coach {
	
	//private field for dependency
	private FortuneService fortuneservice;
	
	//
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneservice = theFortuneService;
	}
	
	
	@Override
	public String  getDailyWorkout() {
		return "spend 30 min daily for practice";
		
	}

	@Override
	public String getDailyFortune() {
		
		// use my fortune service to get fortune  ..dependecy = helper
		
		return fortuneservice.getFortune();
	}

}
