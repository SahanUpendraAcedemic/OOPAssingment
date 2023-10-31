package staff;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StaffLoginServlet")
public class StaffLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter output = response.getWriter();
		
		String username = request.getParameter("staffuname");
		String password = request.getParameter("staffpass");
		boolean acccheck = false;

		try {
			acccheck = StaffDButil.validate(username,password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		if(acccheck==true) {
			
			try {
				List<Staff> staffDetails = StaffDButil.getStaff(username,password);
				request.setAttribute("staffdetails", staffDetails);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			RequestDispatcher dis = request.getRequestDispatcher("Staffaccount.jsp");
			dis.forward(request,response);
		}
		else{
			
			output.println("<script type = 'text/javascript'>");
			output.println("alert('Entered Username Password are incorrect! Try again!');");
			output.println("location='Stafflogin.jsp'");
			output.println("</script>");
		}
		}
	}


