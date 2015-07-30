package msci.com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatePerson {
	private String firstName;
	private String lastName;
	private int age;
	Statement statement;
	ResultSet rs;
	Connection connection;
	
	public CreatePerson(String theFirstName, String theLastName, int theAge, Connection theConn){
		this.firstName = theFirstName;
		this.lastName = theLastName;
		this.age = theAge;
		this.connection = theConn;
	}
	
	public void createQuery(){
		String query = "insert into persons(first_name, last_name, age) values('" + firstName + "', '" + lastName + "', " + age + ");"; 
		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			statement.execute(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int getId(){
		String query = "select * from persons where first_name='" + firstName + "' and last_name='" + lastName + "' and age=" + age;
		try {
			rs = statement.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int id=0;
		try {
			while (rs.next()){
				id = rs.getInt("id");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return id;
	}
}
