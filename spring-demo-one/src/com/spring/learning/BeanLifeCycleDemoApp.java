package com.spring.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// load configure file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml"); 
		
		// load bean from spring container 
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// call method
		System.out.println(theCoach.getDailyWorkout());
		
		// close context file
		context.close();
	
	}

}
