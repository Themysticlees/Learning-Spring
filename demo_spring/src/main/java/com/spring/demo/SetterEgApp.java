package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterEgApp {
	
	public static void main(String[] args) {
		
		//load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		
		//call methods of the bean
		
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmailAddress());
		
		//close context
		context.close();
	}

}
