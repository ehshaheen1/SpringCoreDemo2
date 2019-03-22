package com.shaheen.spring;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{
    
	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;
	
	private FortuneService fortuneService;
	public SwimCoach(FortuneService theFortuneService)
	{
		fortuneService=theFortuneService;
		
	}
	@Override
	public String getWorkOut() {
		// TODO Auto-generated method stub
		return "Workout for swiming";
	}

	@Override
	public String dailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.workout();
	}
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}
	

}
