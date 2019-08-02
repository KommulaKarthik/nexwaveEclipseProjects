package com.linkedin;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
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
		
		
		out.println("username="+username);
		out.println("gender="+gender);
		out.println("email="+email);
		out.println("password="+password);
		out.println("address="+address);
		out.println("phone="+phone);
		
		
		
		/*Cookie arr[] = request.getCookies();
		
		for(int i=0;i<arr.length;i++){
			out.println("cookie name"+arr[i].getName());
			out.println("cookie value"+arr[i].getValue());
			out.println("cookie secure"+arr[i].getSecure());
			out.println("cookie path"+arr[i].getPath());
			out.println("cookie version"+arr[i].getVersion());
			
		}
		out.print(address);
		out.print(phone);*/
		
	
	
		
		
	}

}
