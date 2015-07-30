package msci.com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrievePerson {
	private int id;
	Connection connection;
	Statement statement;
	ResultSet rs;
	public RetrievePerson(int theId, Connection conn){
		this.id = theId;
		this.connection = conn;
	}
	
	public void getResult(){
		String query = "select * from persons where id=" + id;
		try {
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while (rs.next()){
				System.out.println(rs.getString("first_name") + " " + rs.getString("last_name") + " " + rs.getInt("age"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
