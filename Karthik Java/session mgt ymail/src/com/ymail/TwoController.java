package com.ymail;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
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
	
		
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		String username = request.getParameter("username");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
	
		out.print("<form action='ThreeController' method='post'>");
		out.print("<input  type='hidden' name='username' value=" + username + "><br>");
		out.print("<input  type='hidden' name='gender' value=" + gender + ">");
		out.print("Enter email<input  type='hidden' name='email' value="+email+"><br>");
		out.print("Enter password<input  type='hidden' name='password' value="+password+ ">");
		out.print("Enter address<input  type='text' name='address'><br>");
		out.print("Enter phone<input  type='text' name='phone'>");
		
		out.print("<input  type='submit' name='next' value='Save'>");
		out.print("</form>");

	
		
		
		
		
		
		// TODO Auto-generated method stub
	}

}
