package com.virtusa.BusTicketReservation.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.BusTicketReservation.exception.TravelLineException;
import com.virtusa.BusTicketReservation.model.ServiceDetail;
import com.virtusa.BusTicketReservation.service.AdminService;


//import com.travel1.exception.TravelLineException;
//import com.travel1.model.ServiceDetail;
//import com.travel1.service.AdminService;

/**
 * Servlet implementation class ViewScheduleController
 */
@WebServlet("/ViewScheduleController")
public class ViewScheduleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewScheduleController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//PrintWriter out=response.getWriter();
		//out.print("hhj");
		response.setContentType("text/html");
		RequestDispatcher requestDispatcher =null;
		AdminService adminService=new AdminService();

		try {

		List<ServiceDetail> list=adminService.viewSchedules() ;
		//System.out.println(list.size());
		//System.out.println(list);
		if(list.size()!=0) {
		request.setAttribute("schedulelist",list);

		requestDispatcher=request.getRequestDispatcher("viewSchedule.jsp");
		requestDispatcher.forward(request, response);
		}else {
		requestDispatcher = request.getRequestDispatcher("/error.html");
		requestDispatcher.forward(request, response);


		}

		} catch (TravelLineException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		requestDispatcher = request.getRequestDispatcher("/error.html");
		requestDispatcher.forward(request, response);
		//logger.error("Some internal error");
		}


		}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}


}