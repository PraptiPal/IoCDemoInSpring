package com.iocDemo;

public class TrackCoach implements Coach {

	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		System.out.println("Running is good for health and jogging goes fine too");

	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void init() {
		System.out.println("Inside init method");
	}
	
	public void destroy() {
		System.out.println("method destroyed");
	}

}
