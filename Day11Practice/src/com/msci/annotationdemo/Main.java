package com.msci.annotationdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:beans.xml");
		Person person = context.getBean("person", Person.class);
		System.out.println(person.getName() + ", " + person.getAge() + ", " + person.getCar().getModel());
		System.out.println("Hobbies : " + person.getHobbies());
		
		Car car = context.getBean("car", Car.class);
		System.out.println(car.getModel() + ", " + car.getYearOfMake());
	}

}
