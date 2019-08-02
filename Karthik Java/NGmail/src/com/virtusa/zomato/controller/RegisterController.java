package com.virtusa.zomato.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.virtusa.zomato.exception.ZomatoException;
import com.virtusa.zomato.model.CustomerDetail;
import com.virtusa.zomato.model.LoginDetail;
import com.virtusa.zomato.service.ZomatoService;

/**
 * Servlet implementation class RegistrationController
 */
@WebServlet("/RegistrationController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
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
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		out.print("Controller Registration");
		
		Logger logger = Logger.getLogger("RegisterController");
		String customerName = request.getParameter("customerName");
		String password = request.getParameter("password");
		String customerAddress = request.getParameter("customerAddress");
		String gender = request.getParameter("gender");
		char genderr = gender.charAt(0);
		String customerEmail = request.getParameter("customerEmail");
		String customerContact = request.getParameter("customerContact");
		String country = request.getParameter("country");
		String state = request.getParameter("state");
		String city = request.getParameter("city");
		
		
		
		CustomerDetail customerDetail =new CustomerDetail(0, customerName, customerAddress, customerEmail, customerContact, password, genderr, country, state, city);
		customerDetail.setGender(genderr);
		customerDetail.setCountry(country);
		customerDetail.setState(state);
		customerDetail.setCity(city);
		customerDetail.setPassword(password);
		
	    ZomatoService service = new ZomatoService();
		RequestDispatcher requestDispatcher = null;
		
		try{
			
			int regId = service.registerCustomer(customerDetail);
			
			if(regId!=0){
				HttpSession session = request.getSession();
				
				LoginDetail loginDetail = new LoginDetail(customerEmail,password);
				session.setAttribute("user", loginDetail);
				System.out.println("login");
				
				requestDispatcher=request.getRequestDispatcher("/html/home.html");
				
				
				
			}else{
				
				
				
			}
		}catch(ZomatoException e){
				e.printStackTrace();
				requestDispatcher=request.getRequestDispatcher("/html/error.html");
				
				logger.error("err page",e);
				requestDispatcher.forward(request, response);
			}
			
			
		
		
		
		
	}
}


