package user;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDButil {
	
	private static Connection con =null;
	private static Statement stmt = null;
	private static boolean checkquery;
	private static ResultSet rs = null;

		public static boolean validate(String uname,String Password) {
			
			try {
				con=UserDBconnect.getConnection();
				stmt=con.createStatement();
				String sql = "SELECT * FROM userdetails WHERE username='"+uname+"'and password='"+Password+"'";
				rs=stmt.executeQuery(sql);
				
				if(rs.next()) {
					checkquery = true;
				}
				else {
					checkquery=false;
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return checkquery;
		}
		
		public static List <User> getUser(String Uname,String Pwd)
		{
			ArrayList <User> userdetails = new ArrayList<>();
			
			//Validate User Database
			try {
				con = UserDBconnect.getConnection();
				stmt=con.createStatement();
				
				String sql="SELECT * FROM userdetails WHERE username='"+Uname+"'and password='"+Pwd+"' ";
				ResultSet rs = stmt.executeQuery(sql);

				if(rs.next()) {
					int uid = rs.getInt(1);
					String fullname= rs.getString(2);
					String phone = rs.getString(3);
					String username = rs.getString(4);
					String password = rs.getString(5);
					String address = rs.getString(6);
					String gender = rs.getString(6);

					User u = new User(uid,fullname,phone,username,password,address,gender);
					userdetails.add(u);
				}
			}
			catch(SQLException e)
			{
				System.out.println("Error Database connection invaild!");
				e.printStackTrace();
			}
			return userdetails;
		}
		
		public static boolean insertUser(String name,String email,String phone,String uname,String passwrd,String address,String gender)
		{
			checkquery =false;
			
			try {
				con = UserDBconnect.getConnection();
				stmt=con.createStatement();
				
				String sql="INSERT INTO userdetails VALUES (0,'"+name+"','"+phone+"','"+uname+"','"+passwrd+"','"+address+"','"+gender+"')";
				int rs = stmt.executeUpdate(sql);
				
				if(rs>0) {
					checkquery = true;
				}
				else
				{
					checkquery = false;
				}
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
			return checkquery;
		}

}
