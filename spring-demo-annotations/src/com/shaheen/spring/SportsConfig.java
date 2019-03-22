package com.shaheen.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.shaheen.spring")
@PropertySource("classpath:sports.properties")
public class SportsConfig {
	@Bean
	public FortuneService sadFortuneService()
	{
		return new SadFortuneService();
		
	}
    
	
	@Bean
	public Coach swimCoach()
	{
		return new SwimCoach(sadFortuneService());
		
	}
}
