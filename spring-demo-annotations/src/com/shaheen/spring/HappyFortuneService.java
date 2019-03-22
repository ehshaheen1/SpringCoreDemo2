package com.shaheen.spring;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String workout() {
		// TODO Auto-generated method stub
		return "Hey Enadul Haque";
	}

}
