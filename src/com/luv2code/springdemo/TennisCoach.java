package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")  // bean id
@Component   // mặc định id nó là tennisCoach  (chữ cái đầu viết thường)
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//defauts constructor
	public TennisCoach() {
	System.out.println(">>  TennisCoach : inside default constructor");
	}
	
//	@Autowired 
//	public TennisCoach(   FortuneService fortuneService) {
//		// chắc là có mỗi thằng happyFortuneService là 1 beans implement cái interface nên nó tự nhận luôn 
//		this.fortuneService = fortuneService;
//	}
	
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">>  TennisCoach : inside Setter ");
	
		this.fortuneService = fortuneService;
	}

	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println(">>  TennisCoach : Do Some Crazy STuff");
	
		this.fortuneService = fortuneService;
	}

//	 cứ có thằng @AutoWired là nó aoto chạy hết , theo tuần tự
	
	
	
	@Override
	public String getDailyWorkout() {
		return " practice your backhand volley ";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}