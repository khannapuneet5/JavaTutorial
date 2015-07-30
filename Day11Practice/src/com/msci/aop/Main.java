package com.msci.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:aop.xml");
		Employee emp1 = context.getBean("employee", Employee.class);
		System.out.println(emp1.getClass().getName());
		emp1.setId(101);
		emp1.work();
		emp1.sleep();
		
		Employee emp2 = context.getBean("employee", Employee.class);
		System.out.println(emp2.getClass().getName());
		emp2.setId(102);
		emp2.work();
		emp2.sleep();
	}
}
