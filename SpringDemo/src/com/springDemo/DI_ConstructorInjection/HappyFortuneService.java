package com.springDemo.DI_ConstructorInjection;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return " I am in HappyFortuneService Class";
	}

}
