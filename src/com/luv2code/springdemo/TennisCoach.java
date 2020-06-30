package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")  // bean id
@Component   // mặc định id nó là tennisCoach  (chữ cái đầu viết thường)
public class TennisCoach implements Coach {
	@Autowired   // ko cần setter nữa - field injection 
//	@Qualifier("happyFortuneService") //  bình thường có 1 bean thì ko cần, nhưng interface FortuneService có nhiêu beans, nên phải dùng cái này để chỉ ra
//	@Qualifier("sugoiFortuneService")
	@Qualifier("randomFortuneService")
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
	
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println(">>  TennisCoach : inside Setter ");
//	
//		this.fortuneService = fortuneService;
//	}
//
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService fortuneService) {
//		System.out.println(">>  TennisCoach : Do Some Crazy STuff");
//	
//		this.fortuneService = fortuneService;
//	}

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
