package order;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reviewOrderServlet")
public class reviewOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	//doPost method to handle requests made through POST method
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Retrieving a data-list from a serv-let
		List<Order> orderDetails= OrderDButil.reviewOrders();
		//setting a data-set to be forwarded to a JSP by RequestDispatcher
		request.setAttribute("order", orderDetails);
		
		//forwarding to a JSP file
		RequestDispatcher dis= request.getRequestDispatcher("ReviewOrders.jsp");
		dis.forward(request, response);
	}

}
