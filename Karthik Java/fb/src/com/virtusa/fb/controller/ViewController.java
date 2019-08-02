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
 * Servlet implementation class ViewController
 */ 
public class ViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	
String cid=	request.getParameter("cid");
int id=Integer.parseInt(cid);

UpdateCustomerService customerService=new UpdateCustomerService();
 try {
	CustomerDetail customerDetail= customerService.getCustomerDetailsById(id);
    request.setAttribute("customer", customerDetail);
    request.getRequestDispatcher("update.jsp").forward(request, response);;
    
    
 
 
 
 } catch (FacebookException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}







	
	}

	

}
