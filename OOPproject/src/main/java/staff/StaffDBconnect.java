package staff;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class StaffDBconnect {
	
	private static  String url= "jdbc:mysql://localhost:3306/oopproject?autoReconnect=true&useSSL=false";
	private static String User = "root";
	private static String Pass = "password";
	private static Connection con;
	
	public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			//create DB connection
			con = (Connection) DriverManager.getConnection(url,User,Pass);
			
		}
		catch(Exception e) {
			System.out.println("Database Connection was not established!");
		}
		return con;
	}


}
