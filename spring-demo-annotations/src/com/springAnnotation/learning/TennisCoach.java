package com.springAnnotation.learning;

import org.springframework.stereotype.Component;

//@Component("theSillyCoach")//excplicit bean id
@Component()
public class TennisCoach implements Coach {
	@Override
	public String getDailyWorkout() {
		
		return "Practice Daily for 30 min";
	}

}
