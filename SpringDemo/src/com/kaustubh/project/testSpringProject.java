package com.kaustubh.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpringProject {
	
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
		Restaurant rest = (Restaurant)context.getBean("restaurantBean");
		rest.makeTea();
	}

}
