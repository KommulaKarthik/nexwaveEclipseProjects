package com.virtusa.BusTicketReservation.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.BusTicketReservation.model.BookingMapDetail;
import com.virtusa.BusTicketReservation.service.BookingMapService;

/**
 * Servlet implementation class PassengerDetailsController
 */
@WebServlet("/PassengerDetailsController")
public class PassengerDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PassengerDetailsController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String seat=request.getParameter("seatno");
		int seatNo=Integer.parseInt(seat);
		String passengerAge=request.getParameter("PassengerAge");
		int passAge=Integer.parseInt(passengerAge);
		String passengerName=request.getParameter("PassengerName");		
		BookingMapService service= new BookingMapService();
		
		 BookingMapDetail bookingMapDetail=new  BookingMapDetail();
	     bookingMapDetail.setSeatNumber(seatNo);
	     bookingMapDetail.setTravellerName(passengerName);
	     bookingMapDetail.setTravellerAge(passAge);
		
		RequestDispatcher dispatcher=null;

		try{
		int genId=service.passengerDetails(bookingMapDetail);
		System.out.println(genId);
		
		if(genId!=0){
		dispatcher=request.getRequestDispatcher("/jsp/payment.jsp");
		}else{
		dispatcher=request.getRequestDispatcher("error.html");
		}

		}catch(Exception e){
		e.printStackTrace();
		dispatcher=request.getRequestDispatcher("error.html");

		//logger.error("err page",e);
		}
		dispatcher.forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		

		}

	}


