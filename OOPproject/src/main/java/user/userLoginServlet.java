package user;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/userLoginServlet")
public class userLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter output = response.getWriter();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		boolean acccheck = false;

		
			try {
				acccheck=UserDButil.validate(username,password);
				
			}
			catch(Exception e) {
			e.printStackTrace();
			}
			
		if(acccheck==true) {
			try {
			List<User> userDetails = UserDButil.getUser(username,password);
			request.setAttribute("userdetails", userDetails);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			RequestDispatcher dis = request.getRequestDispatcher("Useraccount.jsp");
			dis.forward(request,response);
		}
		else{
			
			output.println("<script type = 'text/javascript'>");
			output.println("alert('Entered Username Password are incorrect! Try again!');");
			output.println("location='Login.jsp'");
			output.println("</script>");
		}
	}
}
