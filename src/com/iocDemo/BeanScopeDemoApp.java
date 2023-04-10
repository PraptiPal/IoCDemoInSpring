package com.iocDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanApplicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		boolean result = theCoach == alphaCoach;
		
		System.out.println("is it pointing to the same object: " +  result);
		
		System.out.println("Memory location for coach: " + theCoach);
		
		System.out.println("Memory location for coach: " + alphaCoach);
		
		context.close();
				
	}

}
