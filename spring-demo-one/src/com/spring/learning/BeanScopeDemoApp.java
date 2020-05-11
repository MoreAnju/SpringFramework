package com.spring.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load configure file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml"); 
		
		// load bean from spring container 
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		
		// check object are same or not
		Boolean res = (theCoach == alphaCoach);
				
		// print the res
		System.out.println(" pointing to the same object " + res);
		// will show true for singleton/ default scope, if we change scope to prototype it will show false
		
	}

}
