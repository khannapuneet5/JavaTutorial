package com.msci.ex2;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:jdbc.xml");
		PersonDao personDao = context.getBean("personDao", PersonDao.class);
		//personDao.create("M S", "Dhoni", 33);
		System.out.println(personDao.getAge(7));
		System.out.println(personDao.get(7));
		//System.out.println(personDao.getAll());
	}

}
