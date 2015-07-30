package com.msci.ex1.dao;

import org.springframework.stereotype.Repository;

@Repository("statementDao")
public class StatementDaoImpl extends BaseDaoSupport implements StatementDao {

	@Override
	public void addStatement(int accountNumber, String type, int amount) {
		String query = "insert into statements(account_number, amount, type) values(?,?,?);";
		getJdbcTemplate().update(query, accountNumber, amount, type);
	}

}
