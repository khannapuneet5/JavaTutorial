package com.msci.ex1.dao;

public interface AccountDao {
	void deposit(int accountNumber,int amount);
	void withdraw(int accountNumber,int amount);
}
