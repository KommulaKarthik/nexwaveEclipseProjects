package com.linkedin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OneController
 */
public class OneController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OneController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username = request.getParameter("username");
		String gender  = request.getParameter("gender");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		response.addCookie(new Cookie("username", username));
		response.addCookie(new Cookie("gender", gender));
		
		
		out.print("<form action='TwoController' method='post'>");
		out.print(" <input type='hidden' name='username' value="+username+">");
		out.print(" <input type='hidden' name='gender' value="+gender+">");
		out.print(" Enter email <input type='text' name='email'><br>");
		out.print(" Enter password <input type='password' name='password'>");
		out.print("<input type='submit' name='next' value='Next'>");
		out.print("</form>");
		
		
 
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("two.html");
		requestDispatcher.forward(request, response);
		
		
	}

}
