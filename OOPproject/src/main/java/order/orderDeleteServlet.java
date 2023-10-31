package order;

import java.io.IOException;
import java.util.List;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/orderDeleteServlet")
public class orderDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//doPost method to handle requests made through POST method
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean isTrue;
		
		//Making a Print-writer object to print an output 
		PrintWriter output = response.getWriter();
		
		//Assign data from the request to variables
		String deleteoname = request.getParameter("diloname");
		//Passing data to a method that has a SQL statement to process those data to a database and checking the statement execution is done right
		isTrue = OrderDButil.deleteOrder(deleteoname);
		
		if(isTrue==true) {
			//Showing a alert from JavaScript
			output.println("<script type = 'text/javascript'>");
			output.println("alert('Deletion Completed!');");
			output.println("location='index.jsp'");
			output.println("</script>");
		}
		else
		{
			List<Order> cusDetails = OrderDButil.getOrderDetails(deleteoname);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("OrderSummery.jsp");
			dis.forward(request, response);
		}

	}

}
