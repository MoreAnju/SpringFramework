package com.spring.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
		
		public static void main(String args[]) {
	//load spring configuration file 
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	//retrieve beans from spring container
	Coach theCoach = context.getBean("myCoach",Coach.class);// same name as bean id
	
	//call me5thods on beans
	System.out.println(theCoach.getDailyWorkout());
	
	// new method from dependency 
	System.out.println(theCoach.getDailyFortune());
	
	//close context
	context.close();
		}
}