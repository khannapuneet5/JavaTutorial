package msci.com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrintAllPerson {
	Connection connection;
	Statement statement;
	ResultSet rs;
	
	public PrintAllPerson(Connection conn){
		this.connection = conn;
	}
	public int countOfPersons(){
		int count=0;
		String query = "select COUNT(*) as count from persons;";
		try {
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while (rs.next()){
				count = rs.getInt("count");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return count;
	}
	public void getList(){
		String query = "select * from persons;";
		try {
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while (rs.next()){
				System.out.println(rs.getString("first_name") + " " + rs.getString("last_name") + " " + rs.getInt("age"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
