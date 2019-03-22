package com.shaheen.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach()
	{
		
		System.out.println("Inside the constructor");
	}
	/*public void ops(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	/*public TennisCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}*/
	@PostConstruct
	public void xoxo()
	{
		
		System.out.println("Init-method");
	}
	@PreDestroy
	public void yoyo()
	{
		
		System.out.println("desctructor");
	}

	@Override
	public String getWorkOut() {
		//System.out.println();
		return "Need to workout";
		
	}
	

	@Override
	public String dailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.workout();
	}

	
}
