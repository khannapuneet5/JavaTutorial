package com.msci.ex1.service;
import com.msci.ex1.dao.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService {
	@Autowired
	private AccountDao accountDao;
	@Autowired
	private StatementDao statementDao;
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void deposit(int accountNumber,String type, int amount) {
		accountDao.deposit(accountNumber, amount);
		statementDao.addStatement(accountNumber, type, amount);
	}
	public void withdraw(int accountNumber,String type, int amount){
		accountDao.withdraw(accountNumber, amount);
		statementDao.addStatement(accountNumber, type, amount);
	}
}
