package com.msci.ex2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class PersonDao {
	private JdbcTemplate jdbcTemplate;
		
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int getAge(int id){
		return jdbcTemplate.queryForObject("select age from persons where id=?", Integer.class, id);
	}
	public int create(String firstName,String lastName,int age){
		String query = "insert into persons(first_name, last_name, age) values(?,?,?)";
		return jdbcTemplate.update(query, firstName, lastName, age);
	}
	public boolean remove(int id){
		int numOfRows = jdbcTemplate.update("delete from persons where id=?", id);
		return numOfRows>0 ? true: false;
	}
	public boolean updateAge(int id,int newAge){
		int numOfRows = jdbcTemplate.update("update persons set age=? where id=?", newAge, id);
		return numOfRows>0 ?true : false;
	}
	public Person get(int id){
		String query = "select * from persons where id=?";
		Person person = jdbcTemplate.query(query, new ResultSetExtractor<Person>(){
			public Person extractData(ResultSet rs) throws SQLException, DataAccessException{
				rs.next();
				Person person = new Person(rs.getInt("id"), rs.getString("first_name"), rs.getString("last_name"), rs.getInt("age"));
				return person;
			}
		}, id);
		return person;
	}
	public List<Person> getAll(){
		String query = "select * from persons";
		List<Person> result = jdbcTemplate.query(query, new RowMapper<Person>(){
			public Person mapRow(ResultSet rs, int rowNum) throws SQLException{
				Person person = new Person(rs.getInt("id"), rs.getString("first_name"), rs.getString("last_name"), rs.getInt("age"));
				return person;
			}
		});
		return result;
	}
}
