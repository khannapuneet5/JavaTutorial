package com.msci.dblogin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO {
	private boolean result = false;
	private String username;
	private String password;
	
	public UserDAO(String user, String pass){
		this.username = user;
		this.password = pass;
	}
	
	public boolean checkLogin(){
		try(Connection connection = DBHelper.getConnection()){
			String query = "select pass_word from msci.users where user_name='" + username + "'";
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(query);
			rs.next();
			if (rs.getString("pass_word").equals(password) ){
				result = true;
			}
		}
		catch(SQLException e){
			e.printStackTrace();
			result = false;
		}
		return result;
	}
}
