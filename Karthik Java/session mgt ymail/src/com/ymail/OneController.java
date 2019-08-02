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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		String username = request.getParameter("username");
		String gender = request.getParameter("gender");
	    
		
		
		out.print("<form action='TwoController' method='post'>");
		out.print("<input  type='hidden' name='username' value=" + username + "><br>");
		out.print("<input  type='hidden' name='gender' value=" + gender + ">");
		out.print("Enter email<input  type='text' name='email'><br>");
		out.print("Enter password<input  type='password' name='password' >");
		out.print("<input  type='submit' name='next' value='Next'>");
		out.print("</form>");

		// RequestDispatcher
		// dispatcher=request.getRequestDispatcher("two.html");
		/// dispatcher.forward(request, response);

	}

}
