package com.msci.ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class User {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:conference.xml");
		Conference conf = context.getBean("conference", Conference.class);
		System.out.println("Count of 60 min session : " + conf.getNumOf60Min());
		System.out.println("Count of 50 min session : " + conf.getNumOf50Min());
		System.out.println("Count of 45 min session : " + conf.getNumOf45Min());
	}

}
