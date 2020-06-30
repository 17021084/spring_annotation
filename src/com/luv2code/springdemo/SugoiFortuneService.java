package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SugoiFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is Sugoii !!!!" ;
	}

}
