package com.virtusa.fb.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.fb.exception.FacebookException;
import com.virtusa.fb.model.CustomerDetail;
import com.virtusa.fb.service.UpdateCustomerService;

/**
 * Servlet implementation class UpdateController
 */
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub


String cid=		request.getParameter("cid");
int customerId=Integer.parseInt(cid);

String customerName=		request.getParameter("customerName");
		

String customerEmail=		request.getParameter("customerEmail");
		

String customerPhone=		request.getParameter("customerContact");

String customerAddress=		request.getParameter("customerAddress");
String password=		request.getParameter("password");
		

String gender=		request.getParameter("gender");

String state=		request.getParameter("state");

String city=		request.getParameter("city");

String country=		request.getParameter("country");
		
		
		
		CustomerDetail customerDetail=new CustomerDetail();
		customerDetail.setCustomerId(customerId);
		customerDetail.setCustomerName(customerName);
customerDetail.setCustomerAddress(customerAddress);
customerDetail.setCountry(country);
customerDetail.setCity(city);
customerDetail.setCustomerContact(customerPhone);
customerDetail.setCustomerEmail(customerEmail);		
customerDetail.setGender(gender.charAt(0));
customerDetail.setPassword(password);
customerDetail.setState(state);
		
UpdateCustomerService customerService=new UpdateCustomerService();
int status;
try {
	status = customerService.updateCustomerDetailsById(customerDetail);
	if(status>0){
		
response.getWriter().println("Updated");	
	}else{
		
		response.getWriter().println("not Updated");	
		
		
	}


} catch (FacebookException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}




		
		
	}

}
