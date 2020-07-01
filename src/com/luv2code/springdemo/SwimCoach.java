package com.luv2code.springdemo;

public class SwimCoach implements Coach {

	private FortuneService fortuneSevice;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneSevice=fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return " Swim 1000 meters as  warm up";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneSevice.getFortune() ;
	}

}
