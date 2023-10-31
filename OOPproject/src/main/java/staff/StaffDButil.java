package staff;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import user.UserDBconnect;

public class StaffDButil {
	
	private static Connection con =null;
	private static Statement stmt = null;
	private static boolean checkquery;
	private static ResultSet rs = null;

	public static boolean validate(String Uname,String Pwd) {
		
		try {
			con=UserDBconnect.getConnection();
			stmt=con.createStatement();
			String sql = "SELECT * FROM staffdetails WHERE slogin='"+Uname+"'and spass='"+Pwd+"' ";
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
	
		public static List <Staff> getStaff(String Uname,String Pwd)
		{
			ArrayList <Staff> staffdetails = new ArrayList<>();
			
			//Validate User Database
			try {
				con = StaffDBconnect.getConnection();
				stmt=con.createStatement();
				
				String sql="SELECT * FROM staffdetails WHERE slogin='"+Uname+"'and spass='"+Pwd+"' ";
				ResultSet rs = stmt.executeQuery(sql);

				if(rs.next()) {
					int sid = rs.getInt(1);
					String staffname= rs.getString(2);
					String post = rs.getString(3);
					String phone = rs.getString(4);
					String email = rs.getString(5);
					String slogin = rs.getString(6);
					String spass = rs.getString(6);

					Staff s = new Staff(sid,staffname,post,phone,email,slogin,spass);
					staffdetails.add(s);
				}
			}
			catch(SQLException e)
			{
				System.out.println("Error Database connection invaild!");
				e.printStackTrace();
			}
			return staffdetails;
		}

}
