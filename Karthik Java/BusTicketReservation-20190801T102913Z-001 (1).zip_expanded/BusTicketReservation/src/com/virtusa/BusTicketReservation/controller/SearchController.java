package com.virtusa.BusTicketReservation.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.virtusa.BusTicketReservation.exception.TravelLineException;
import com.virtusa.BusTicketReservation.model.BookingDetail;
import com.virtusa.BusTicketReservation.service.ServiceSearch;

/**
 * Servlet implementation class SearchController
 */
@WebServlet("/SearchController")
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
   	@Override
   	protected void doGet(HttpServletRequest request, HttpServletResponse response)
   			throws ServletException, IOException {
   		
   		response.setContentType("text/html");
		ServiceSearch service = ServiceSearch.getServiceSearch();
		PrintWriter out = response.getWriter();

		RequestDispatcher requestDispatcher= null;

		String source =  request.getParameter("city");
		String destination =  request.getParameter("city1");
		String passengers = request.getParameter("passengercount");
		int noOfPassengers = Integer.parseInt(passengers);
		String dateOfJourney = request.getParameter("doj");
		/*BookingDetail bookingDetail = new BookingDetail();
		
		bookingDetail.setSource(source);
		bookingDetail.setDestination(destination);
		bookingDetail.setNoOfpassengers(passenegerCount);
		bookingDetail.setJourneyDate(dateOfJourney);*/
		BookingDetail bookingDetail= new BookingDetail(dateOfJourney, noOfPassengers, source, destination);
		try {
			int bid = service.searchService(bookingDetail);
			
			if(bid!=0) {
				requestDispatcher = request.getRequestDispatcher("SelectServiceController");
				
			}else {
				requestDispatcher = request.getRequestDispatcher("/html/error.html");
				
			}
		} catch (TravelLineException e) {
			// TODO Auto-generated catch block
			requestDispatcher = request.getRequestDispatcher("/html/error.html");
			e.printStackTrace();
		}
		requestDispatcher.forward(request, response);

		
		
		
		
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Logger logger = Logger.getLogger("SearchController.class");
		doGet(request, response);
		
		
	}

}
