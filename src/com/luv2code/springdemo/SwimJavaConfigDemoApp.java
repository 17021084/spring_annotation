package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
	// Read Spring config file
		
		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext (SportConfig.class);
		
		// Get the bean from spring file	
		Coach theCoach = context.getBean("swimCoach",Coach.class);

		// Call a method on the beans
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		
		
		// Close the context
		context.close();

	}

}
