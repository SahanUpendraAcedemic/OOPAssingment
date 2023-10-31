package user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class userRegisterServlet
 */
@WebServlet("/userRegisterServlet")
public class userRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userfname = request.getParameter("name");
		String useremail = request.getParameter("email");
		String userphone = request.getParameter("phonenumber");
		String useruname = request.getParameter("uname");
		String userpassword = request.getParameter("password");
		@SuppressWarnings("unused")
		String userpass2 = request.getParameter("conpassword");
		String useraddress = request.getParameter("address");
		String usergender = request.getParameter("Gender");
		
		boolean chckinsert;
		chckinsert=UserDButil.insertUser(userfname, useremail, userphone, useruname, userpassword,useraddress,usergender);
		
		if(chckinsert==true) {
			RequestDispatcher dis = request.getRequestDispatcher("Login.jsp");
			dis.forward(request, response);
		}
		else
		{
			RequestDispatcher dis2 = request.getRequestDispatcher("Register.jsp");
			dis2.forward(request, response);
		}
	
		
	}

}
