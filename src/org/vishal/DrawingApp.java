package org.vishal;

import org.vishal.Triangle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Circle circle=(Circle)context.getBean("circle");
		circle.draw();
		System.out.println("hi");
	System.out.println(context.getMessage("greetings", null, "default greeting	", null));
	}

}
