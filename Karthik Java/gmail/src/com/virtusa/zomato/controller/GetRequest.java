package com.virtusa.zomato.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.virtusa.zomato.model.LoginDetail;

/**
 * Servlet implementation class GetRequest
 */
@WebServlet("/GetRequest")
public class GetRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetRequest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
	HttpSession httpSession =request.getSession();
	
	
	Object object = httpSession.getAttribute("user");
	
	if(object!=null){
	LoginDetail loginDetail = (LoginDetail)object;
	
	PrintWriter out = response.getWriter();
	out.println(loginDetail);
	}else{
		PrintWriter out = response.getWriter();
		out.println("Please ");
		
		
	}
	
	
	}
}
