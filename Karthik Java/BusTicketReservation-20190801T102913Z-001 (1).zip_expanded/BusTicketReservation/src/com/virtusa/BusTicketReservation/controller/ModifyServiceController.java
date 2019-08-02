package com.virtusa.BusTicketReservation.controller;
import org.apache.log4j.Logger;

import com.virtusa.BusTicketReservation.model.ServiceDetail;
import com.virtusa.BusTicketReservation.service.AdminService;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ModifyServiceController
 */
@WebServlet("/ModifyServiceController")
public class ModifyServiceController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyServiceController() {
        super();
       
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    static Logger logger=Logger.getLogger("AdminDao");
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		
		
		response.setContentType("text/html");

		
		int serviceId=Integer.parseInt(request.getParameter("serviceId"));
		String serviceName=request.getParameter("serviceName");
		String serviceFrom=request.getParameter("serviceFrom");
		
		String serviceTo=request.getParameter("serviceTo");
		
	
		double serviceFare = Double.parseDouble(request.getParameter("serviceFare"));
		
		AdminService service= new AdminService();
		
		 ServiceDetail serviceDetail=new  ServiceDetail(serviceId,serviceName,serviceFrom,serviceTo,serviceFare);
logger.error("details"+ serviceDetail.toString() );




	
		RequestDispatcher dispatcher=null;

		try{
		int genId=service.modifyService(serviceDetail);
logger.error("genId");
		if(genId!=0){




		
		dispatcher=request.getRequestDispatcher("/html/success.html");
		}else{
		dispatcher=request.getRequestDispatcher("/html/error.html");
		}

		}catch(Exception e){
			logger.error("sql error",e);
		e.printStackTrace();
		dispatcher=request.getRequestDispatcher("/html/error.html");


		}
		dispatcher.forward(request, response);	

		}

		}