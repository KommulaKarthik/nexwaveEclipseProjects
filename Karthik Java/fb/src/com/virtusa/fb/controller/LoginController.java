package com.virtusa.fb.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.virtusa.fb.dao.UpdateCustomerDao;
import com.virtusa.fb.exception.FacebookException;
import com.virtusa.fb.model.CustomerDetail;
import com.virtusa.fb.service.UpdateCustomerService;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
String username=	request.getParameter("username");
String password=	request.getParameter("password");
try {
		
    if(username.equals("admin") && password.equals("admin")){
		
	HttpSession session=	request.getSession();
    	session.setAttribute("username", username);
    	
    	UpdateCustomerService customerService=new UpdateCustomerService();
		List<CustomerDetail>	details=null;
			details=customerService.viewCustomerDetails();
	  request.setAttribute("details", details);
		request.getRequestDispatcher("home.jsp").forward(request, response);
		
		}else{
		request.setAttribute("message", "admin username pasword is wrong");
		request.getRequestDispatcher("login.jsp").forward(request, response);
		
		
	}
	
	

	} catch (FacebookException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}

}
