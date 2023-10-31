package order;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/orderInsertServlet")
public class orderInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	//doPost method to handle requests made through POST method
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Assign data from the request to variables
		String ordername = request.getParameter("oname");
		String orderdate = request.getParameter("oddate");
		String ordertype = request.getParameter("otype");
		String ordercontent = request.getParameter("ocontent");
		String dilmethod = request.getParameter("dilmethod");
		String ouid = request.getParameter("UID");
		
		//Passing data to a method that has a SQL statement to process those data to a database and checking the statement execution is done right
		boolean isTrue;
		isTrue=OrderDButil.insertOrder(ordername, orderdate, ordertype, ordercontent, dilmethod,ouid);
		
		if(isTrue==true) {
			//Retrieving a data-list from a serv-let
			List<Order> orderDetails = OrderDButil.getOrderDetails(ordername);
			
			//setting a data-set to be forwarded to a JSP by RequestDispatcher
			request.setAttribute("orderdetails", orderDetails);
			//forwarding to a JSP file
			RequestDispatcher dis = request.getRequestDispatcher("OrderSummery.jsp");
			dis.forward(request, response);
		}
		else
		{
			//forwarding to a JSP file
			RequestDispatcher dis2 = request.getRequestDispatcher("Orderfail.jsp");
			dis2.forward(request, response);
		}
	}

}
