package com.iocDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycleApplicationContext2.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		theCoach.getDetails();
		context.close();
				
	}

}
