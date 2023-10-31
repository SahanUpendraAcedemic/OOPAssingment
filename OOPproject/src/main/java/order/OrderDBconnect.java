package order;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class OrderDBconnect {
	
	//creating variable to called by DriverManaer getConnection method
	private static  String url= "jdbc:mysql://localhost:3306/oopproject?autoReconnect=true&useSSL=false";
	private static String User = "root";
	private static String Pass = "password";
	private static Connection con;
	
	//Method for create a Database Connection
	public static Connection getConnection() {
		
		try {
			//calling JDBC driver to establish Database Connection
			Class.forName("com.mysql.jdbc.Driver");
			//create DB connection
			con = (Connection) DriverManager.getConnection(url,User,Pass);
			
		}
		catch(Exception e) {
			System.out.println("Database Connection was not established!");
		}
		//return Connection object
		return con;
	}


}
