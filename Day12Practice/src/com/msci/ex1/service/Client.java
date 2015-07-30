package com.msci.ex1.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:transaction.xml");
		AccountService accountService = context.getBean("accountService", AccountService.class);
		accountService.deposit(1, "Saaaaaaaaaaaaaaaaaaaalllllllllllllllllllaaaaaaaaaaaaarrrrrrrrrrrrrrrrryyyyyyyyyyyyyy", 100000);
		accountService.deposit(1, "Deposit", 1000);
		accountService.withdraw(1, "Withdraw", 500);
	}

}
