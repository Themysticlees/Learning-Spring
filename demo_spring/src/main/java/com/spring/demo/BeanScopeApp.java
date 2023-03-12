package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

	public static void main(String[] args) {
		
		//load the spring config file (beanScope)
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve the beans from the spring container
		
		Coach mycoach = context.getBean("myCoach",Coach.class);
		
		Coach hisCoach = context.getBean("myCoach",Coach.class);
		
		//Testing if both the beans have the same reference
		
		boolean isSame=(mycoach==hisCoach);
		
		System.out.println("Pointing to the same object : "+isSame);
		System.out.println("Memory location of mycoach : "+mycoach);
		System.out.println("Memory location of hisCoach : "+hisCoach);
		
	}

}
