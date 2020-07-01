package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  //do phai dung xml
@ComponentScan("com.luv2code.springdemo")  
public class SportConfig {
	//define bean for our sad fortune service
	
	@Bean                // bean id chữ cái đầu viết thường
	public FortuneService sadFortuneService () {
		return new SadFortuneService();
	}
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
