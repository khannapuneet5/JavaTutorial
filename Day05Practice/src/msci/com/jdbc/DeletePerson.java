package msci.com.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeletePerson {
	private int id;
	Connection connection;
	Statement statement;
	
	public DeletePerson(int theId, Connection conn){
		this.id = theId;
		this.connection = conn;
	}
	
	public void delete(){
		String query = "delete from persons where id=" + id;
		try {
			statement = connection.createStatement();
			statement.execute(query);
			System.out.println("Person with id#" + id +  " deleted.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
