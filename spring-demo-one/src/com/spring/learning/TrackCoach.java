package com.spring.learning;

public class TrackCoach implements Coach {

	// private field for dependency
	private FortuneService fortuneService;
	
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	public TrackCoach() {
		
	}
	@Override
	public String getDailyWorkout() {
		return "run daily 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it " + fortuneService.getFortune();
	}
	
	// adding init method
	public void doMystartupStuff(){
		System.out.println("method inside init method of TheCoach class");
		
	}
	//destroy methode
	public void doMycleanUp() {
		System.out.println("method inside Destroy method of TheCoach class");
	}

}
