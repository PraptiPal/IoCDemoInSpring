package com.iocDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplicationTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = 
		new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		theCoach.getDetails();
		
		System.out.println(theCoach.getFortune());
		
		System.out.println("-------------------");
		
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		context.close();
		

	}

}
