package order;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//class responsible for Handle SQL requests and return data-sets
public class OrderDButil {
	private static Connection con =null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	private static boolean isSuccess;
	
	//Method to add data to Database
		public static boolean insertOrder(String ordername,String orderdate,String ordertype,String ordercontent,String dilmethod,String ouid)
		{
			//boolean variable for check the SQL statement
			isSuccess =false;
			//Parsing a String to Integer to insert in to a table row with a integer data-type 
			int conouid = Integer.parseInt(ouid);
			
			try {
				//creating connection object
				con = OrderDBconnect.getConnection();
				//creating statement object
				stmt=con.createStatement();
				
				//Assign a SQL statement in to a String variable
				String sql="INSERT INTO orderdetails VALUES ('"+ordername+"','"+orderdate+"','"+ordertype+"','"+ordercontent+"','"+dilmethod+"','"+conouid+"')";
				//checking and executing the SQL statement
				int rs = stmt.executeUpdate(sql);
				
				//if SQL statement executed the boolean value assign to true or else
				if(rs>0) {
					isSuccess = true;
				}
				else
				{
					isSuccess = false;
				}
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
			//Returning the boolean value according to the SQL statement execution
			return isSuccess;
		}
		
	//Method to read Details from database 	
	public static List<Order> getOrderDetails(String oderid){
			
		//creating An ArrayList to obtain data from a table
			ArrayList <Order> order = new ArrayList<>();
			try {
				//creating connection object
				con=OrderDBconnect.getConnection();
				//creating statement object
				stmt=con.createStatement();
				
				//Assign a SQL statement in to a String variable
				String sql = "select * from orderdetails where ordername='"+oderid+"'";
				rs=stmt.executeQuery(sql);
				
				//next() returns true while there is data to receive, the iteration occurs while the statement is true
				while(rs.next()) {
					
					//Assign values to variables according to the column numbers
					String ordername=rs.getString(1);
					String orderdate=rs.getString(2);
					String ordertype=rs.getString(3);
					String ordercontent=rs.getString(4);
					String diliverymethod=rs.getString(5);
					int ouid=rs.getInt(6);
					
					//Creating a Order object to hold the retrieved values
					Order o = new Order(ordername,orderdate,ordertype,ordercontent,diliverymethod,ouid);
					//Add the created object to the array list
					order.add(o);
				}
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			//Return ArrayList
			return order;
		}
	
	//read all the details of a table
	public static List<Order> reviewOrders(){
		
		ArrayList <Order> order = new ArrayList<>();
		
		try {
			//creating connection object
			con=OrderDBconnect.getConnection();
			//creating statement object
			stmt=con.createStatement();
			
			//Assign a SQL statement in to a String variable
			String sql = "select ordername,orderdate,ordertype,ordercontent,deliverymethod,ouid from orderdetails";
			//checking and executing the SQL statement
			rs=stmt.executeQuery(sql);
			
			//next() returns true while there is data to receive, the iteration occurs while the statement is true
			while(rs.next()) {
				String ordername=rs.getString(1);
				String orderdate=rs.getString(2);
				String ordertype=rs.getString(3);
				String ordercontent=rs.getString(4);
				String diliverymethod=rs.getString(5);
				int ouid=rs.getInt(6);
				
				//Creating a Order object to hold the retrieved values
				Order o = new Order(ordername,orderdate,ordertype,ordercontent,diliverymethod,ouid);
				//Add the created object to the array list
				order.add(o);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//Return ArrayList
		return order;
	}
	
	
	//Method for update details in a table
		public static boolean updateOrder(String ordername,String orderdate,String ordertype,String ordercontent,String dilmethod ){
			
			try {
				//creating connection object
				con=OrderDBconnect.getConnection();
				//creating statement object
				stmt=con.createStatement();
				
				//Assign a SQL statement in to a String variable
				String sql="UPDATE orderdetails SET orderdate='"+orderdate+"',ordertype='"+ordertype+"',ordercontent='"+ordercontent+"',deliverymethod='"+dilmethod+"'"
						+ "WHERE ordername='"+ordername+"'";
				
				//checking and executing the SQL statement
				int rs=stmt.executeUpdate(sql);
				//if SQL statement executed the boolean value assign to true or else
				if(rs>0) {
					isSuccess=true;
				}
				else
				{
					isSuccess=false;
				}	
			}
			catch(Exception e){
				e.printStackTrace();	
			}
			//Returning the boolean value according to the SQL statement execution
			return isSuccess;
		}
		
		//Method to delete details in a table
		public static boolean deleteOrder(String ordername) {
		
			try {
				//creating connection object
				con=OrderDBconnect.getConnection();
				//Assign a SQL statement in to a String variable
				stmt=con.createStatement();
				
				//Assign a SQL statement in to a String variable
				String sql = "DELETE from orderdetails WHERE ordername='"+ordername+"'";
				//checking and executing the SQL statement
				int r = stmt.executeUpdate(sql);
				
				//if SQL statement executed the boolean value assign to true or else
				if(r>0) {
					isSuccess = true;
				}
				else
				{
					isSuccess = false;
				}
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			//Returning the boolean value according to the SQL statement execution
			return isSuccess;
		}
}
