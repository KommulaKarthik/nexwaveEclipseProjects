package com.ymail;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TwoController
 */
public class TwoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TwoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		String username = request.getParameter("username");
		String gender  = request.getParameter("gender");
		String email = request.getParameter("email");
		String password  = request.getParameter("password");
		
		//response.addCookie(new Cookie("email", email));
		//response.addCookie(new Cookie("password", password));
		
		

		out.print("<form action='ThreeController' method='post'>");
		out.print(" <input type='hidden' name='username' value="+username+">");
		out.print(" <input type='hidden' name='gender' value="+gender+">");
		out.print(" Enter email <input type='hidden' name='email' value="+email+"><br>");
		out.print(" Enter password <input type='hidden' name='password' value="+password+"><br>");
		out.print("Enter address<input type='text' name='address'><br>");
		out.print("Enter contact<input type='number' name='contact'>");
		out.print("<input type='submit' name='next' value='Next'>");
		
		
		out.print("</form>");
		
		
		//RequestDispatcher requestDispatcher = request.getRequestDispatcher("three.html");
		//requestDispatcher.forward(request, response);
		
		
		
		
		
		
		
		
		
		
		
	}

}
