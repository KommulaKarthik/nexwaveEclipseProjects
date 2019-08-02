package com.ymail;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThreeController
 */
public class ThreeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThreeController() {
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
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		
		
		
		
		out.print(username);
		out.print(gender);
		out.print(email);

		out.print(password);

		out.print(address);
		out.print(phone);

		
		
	}

}
