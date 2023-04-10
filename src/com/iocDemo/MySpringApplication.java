package com.iocDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		theCoach.getDetails();
		
		System.out.println(theCoach.getFortune());
		
		context.close();
		
		

	}

}
