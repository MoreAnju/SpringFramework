package com.springAnnotation.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationApp {

	public static void main(String[] args) {
		// open context file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
			//retrive  bean form container 
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		//call method on bean 
		System.out.println(theCoach.getDailyWorkout());
		//close context file
		context.close();
	}

}
