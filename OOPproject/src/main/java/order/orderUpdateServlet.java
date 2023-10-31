package order;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/orderUpdateServlet")
public class orderUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//doPost method to handle requests made through POST method
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Assign data from the request to variables
		String uponame = request.getParameter("updateoname");
		String update = request.getParameter("updateoddate");
		String upotype = request.getParameter("updateotype");
		String upocontent = request.getParameter("updateocontent");
		String upmethod = request.getParameter("updatedilmethod");
		
		//Passing data to a method that has a SQL statement to process those data to a database and checking the statement execution is done right
		boolean isTrue = OrderDButil.updateOrder(uponame,update, upotype, upocontent, upmethod);
		
		if(isTrue==true) {
			
			//Retrieving a data-list from a serv-let
			List<Order> orderDetails = OrderDButil.getOrderDetails(uponame);
			//setting a data-set to be forwarded to a JSP by RequestDispatcher
			request.setAttribute("orderdetails", orderDetails);
			//forwarding to a JSP file
			RequestDispatcher dis = request.getRequestDispatcher("OrderSummery.jsp");
			dis.forward(request,response);
		}
		else
		{
			//forwarding to a JSP file
			RequestDispatcher dis = request.getRequestDispatcher("Orderfail.jsp");
			dis.forward(request,response);
			
		}
	}

}
