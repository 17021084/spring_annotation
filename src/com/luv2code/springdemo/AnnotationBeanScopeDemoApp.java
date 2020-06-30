package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
	// Read Spring config file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Get the bean from spring file
//		Coach theCoach = context.getBean("thatSillyCoach",Coach.class);		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);

		// Call a method on the beans
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		
		
		// Close the context
		context.close();

	}

}
