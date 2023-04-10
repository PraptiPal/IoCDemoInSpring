package com.iocDemo;

public class BaseBall implements Coach{
	
	private FortuneService fortuneService;
	
	public BaseBall(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	public BaseBall() {
		// TODO Auto-generated constructor stub
	}

	public void getDetails() {
		System.out.println("Running is good for health");
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
