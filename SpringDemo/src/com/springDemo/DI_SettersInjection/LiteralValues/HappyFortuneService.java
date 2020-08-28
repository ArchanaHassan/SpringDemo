package com.springDemo.DI_SettersInjection.LiteralValues;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return " I am in HappyFortuneService Class";
	}

}
