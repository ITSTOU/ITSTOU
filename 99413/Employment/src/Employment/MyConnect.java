package Employment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnect {

	public static Connection getConnection() {
		try {
			Class.forName(com.mysql.jdbc.Driver.class.getName());
			return DriverManager.getConnection(
					"jdbc:mysql://localhost/db_employment", "root", "12345678");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
			
	}

}
