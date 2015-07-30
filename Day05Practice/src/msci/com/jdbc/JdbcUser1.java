package msci.com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcUser1 {

	public static void main(String[] args) throws ClassNotFoundException {
		String driverClass = "com.mysql.jdbc.Driver";
		Class.forName(driverClass);
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/msci", "root", "admin")){
			System.out.println("Connected to DB successfully");
			/*String query = "create table countries("
					+ "id int(4) not null auto_increment primary key,"
					+ "name varchar(40),"
					+ "capital varchar(40));";*/
	/*		Scanner sc = new Scanner(System.in);
			System.out.println("Enter country");
			String country = sc.nextLine();
			System.out.println("Enter capital");
			String capital = sc.nextLine();
			String query = "insert into countries(name, capital) values('" + 
					country + "','" +
					capital + "')";*/
			
			String query = "select * from countries;";
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(query);
			while(rs.next()){
				System.out.println(rs.getInt("id") + ": " + rs.getString("name") + ", " +  rs.getString("capital"));
			}
			rs.close();
			//System.out.println("Data saved.");
			statement.close();
			//sc.close();
			
		} catch (SQLException e) {
			System.out.println("Error : " + e.getMessage());
		} 		
	}

}
