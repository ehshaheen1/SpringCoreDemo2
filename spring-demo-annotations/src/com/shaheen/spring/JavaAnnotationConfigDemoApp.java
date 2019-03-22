package com.shaheen.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaAnnotationConfigDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(SportsConfig.class);
		Coach coach=context.getBean("tennisCoach", Coach.class);
		FortuneService fortuneService=context.getBean("happyFortuneService", FortuneService.class);
		System.out.println("The value : " + fortuneService.workout());
		System.out.println(coach.getWorkOut());
		System.out.println(coach.dailyFortune());
		context.close();

	}

}
