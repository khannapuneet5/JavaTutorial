import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StoredProcedures {

	public static void main(String[] args) {
		String driverClass = "com.mysql.jdbc.Driver";
		try {
			Class.forName(driverClass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/msci", "root", "admin")){
			CallableStatement callableStatement = connection.prepareCall("call SelPersons(?);");
			callableStatement.setString(1, "6");
			ResultSet rs = callableStatement.executeQuery();
			while(rs.next()){
				System.out.println(rs.getInt("id") + ": " + rs.getString("first_name") + " " + rs.getString("last_name") + " (" + rs.getInt("age") + ")");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
