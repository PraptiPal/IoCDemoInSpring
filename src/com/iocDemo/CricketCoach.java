package com.iocDemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;

	
	public CricketCoach(){
		System.out.println("this is no argument constructor");
	}
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("this is inside setter method");
		this.fortuneService = fortuneService;
	}

	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		System.out.println("Hey this is cricket coach class");
	}

	
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	public String getTeam() {
		return team;
	}

	/**
	 * @param team the team to set
	 */
	public void setTeam(String team) {
		this.team = team;
	}

}
