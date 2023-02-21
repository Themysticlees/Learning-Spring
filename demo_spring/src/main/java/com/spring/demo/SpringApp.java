package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
	
	public static void main(String[] args) {
		
		//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	//retrieve bean from spring container
    	Coach coach = context.getBean("myCoach",Coach.class);
    	
    	//call methods of the bean
    	System.out.println(coach.getDailyWorkout());
    	System.out.println(coach.getDailyFortune());
    	
    	//close the context
    	context.close();
		
	}

}
