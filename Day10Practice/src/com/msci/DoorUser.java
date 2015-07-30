package com.msci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DoorUser {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:springconfig.xml");
		Door door1 = (Door)context.getBean("door1");
		Door door2 = (Door)context.getBean("door2");
		door1.open();
		door1.close();
		door2.open();
		door2.close();
		
	}

}
