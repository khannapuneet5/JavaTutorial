package msci.com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.util.Scanner;

public class PersonTable {
	public static void main(String[] args) throws ClassNotFoundException {
		String driverClass = "com.mysql.jdbc.Driver";
		Class.forName(driverClass);
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/msci", "root", "admin")){
			String input = "";
			Scanner sc = new Scanner(System.in);
			while (!"q".equals(input)){
				System.out.println("****Enter 'c' to Create, 'r' to Retrieve, 'u' to Update, 'd' to Delete, 'p' to PrintAll and 'q' to quit.****");
				input = sc.next();
				if ("c".equals(input)){
					System.out.println("First name->");
					String first_name = sc.next();
					System.out.println("Last name->");
					String last_name = sc.next();
					System.out.println("Age->");
					int age = sc.nextInt();
					CreatePerson cp = new CreatePerson(first_name, last_name, age, connection);
					cp.createQuery();
					System.out.println("Person with id#" + cp.getId() + " created");
				}
				else if ("r".equals(input)){
					System.out.println("Id number ->");
					int idNum = sc.nextInt();
					RetrievePerson rp = new RetrievePerson(idNum, connection);
					rp.getResult();
				}
				else if ("u".equals(input)){
					System.out.println("Id number->");
					int idNum = sc.nextInt();
					System.out.println("New Age ->");
					int newAge = sc.nextInt();
					UpdatePerson up = new UpdatePerson(idNum, newAge, connection);
					up.update();
				}
				else if ("d".equals(input)){
					System.out.println("Id number->");
					int idNum = sc.nextInt();
					DeletePerson dp = new DeletePerson(idNum, connection);
					dp.delete();
				}
				else if ("p".equals(input)){
					PrintAllPerson pap = new PrintAllPerson(connection);
					System.out.println("Total number of persons: " + pap.countOfPersons());
					System.out.println("List of all persons:");
					pap.getList();
				}
			}
			sc.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error : " + e.getMessage());
		}
	}
	
	
}
