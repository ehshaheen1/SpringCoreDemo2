package com.shaheen.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoAnnotationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach=context.getBean("tennisCoach", Coach.class);
		System.out.println(coach.getWorkOut());
		System.out.println(coach.dailyFortune());
		context.close();

	}

}
