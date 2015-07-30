package com.msci.ex1.dao;

import org.springframework.stereotype.Repository;

@Repository("accountDao")
public class AccountDaoImpl extends BaseDaoSupport implements AccountDao {

	@Override
	public void deposit(int accountNumber, int amount) {
		String query = "update accounts set balance=balance+? where account_number=?";
		getJdbcTemplate().update(query, amount, accountNumber);
	}

	@Override
	public void withdraw(int accountNumber, int amount) {
		String query = "update accounts set balance=balance-? where account_number=?";
		getJdbcTemplate().update(query, amount, accountNumber);
	}

}
