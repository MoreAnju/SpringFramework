package com.spring.learning;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private String email;
	private String team;
	
	
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}
	
//will give value from configure file xml	
	public void setEmail(String email) {
		System.out.println("Cricket constructor: inside setEmail constructor");

		this.email = email;
	}
	public void setTeam(String team) {
		System.out.println("Cricket constructor: inside setTeam constructor");

		this.team = team;
	}



	public CricketCoach() {
		System.out.println("Cricket constructor: inside no-arg constructor");
	}
	
	
	
	//setter 
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket insider setter method");
		this.fortuneService = fortuneService;
	}




	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 30 min ";
	}
	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
