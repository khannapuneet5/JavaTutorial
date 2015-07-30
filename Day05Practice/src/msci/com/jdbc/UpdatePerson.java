package msci.com.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdatePerson {
	private int id;
	private int newAge;
	Connection connection;
	Statement statement;
	
	public UpdatePerson(int theId, int newAge, Connection conn){
		this.id = theId;
		this.newAge = newAge;
		this.connection = conn;
	}
	
	public void update(){
		String query = "update persons set age=" + newAge + " where id=" + id;
		try {
			statement = connection.createStatement();
			statement.execute(query);
			System.out.println("Person with id#" + id +  " updated.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
