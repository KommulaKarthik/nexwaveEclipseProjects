package com.virtusa.travelline.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.travel_line.model.TicketInfo;
import com.virtusa.travel_line.service.CustomerService;

/**
 * Servlet implementation class RetreivalController
 */
@WebServlet("/RetreivalController")
public class RetreivalController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RetreivalController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		response.setContentType("text/html");
		CustomerService customerService = new CustomerService();
		PrintWriter out = response.getWriter();
		RequestDispatcher requestDispatcher =null;
		
		
		String bookId = request.getParameter("bookingId");
		int bid=Integer.parseInt(bookId);
		
		try {
			List<TicketInfo> list= customerService.retrieveTicket(bid);
			
			if(list.size()==0){
				
				
				System.out.println("List is empty");
				
				
			}else{
				
				out.println("<h3>Ticket Details</h3>");
				out.println("<table border='1'>");
				out.println("<tr><td>Customer Name</td><td>Journey Date </td><td>Service Id</td><td>Source</td><td>Destination</td><td>Start Time</td><td>Journey Time</td><td>No Of Seats</td></tr>");
				
				for(TicketInfo ticketInfo : list){
					System.out.println("<tr>");
					out.println("<td>" + ticketInfo.getCustomerDetail().getCustomerFullName() + "</td>");
					out.println("<td>" + ticketInfo.getBookingDetail().getJourneyDate() + "</td>");
					out.println("<td>" + ticketInfo.getServiceDetail().getServiceId() + "</td>");
					out.println("<td>" + ticketInfo.getServiceDetail().getServiceFrom() + "</td>");
					out.println("<td>" + ticketInfo.getServiceDetail().getServiceTo() + "</td>");
					out.println("<td>" + ticketInfo.getServiceDetail().getDepartureTime() + "</td>");
					out.println("<td>" + ticketInfo.getServiceDetail().getJourneyTime()  + "</td>");
					out.println("<td>" + ticketInfo.getBookingDetail().getNoOfSeats()  + "</td>");
					System.out.println("</tr>");
					
					
				}
				
				out.println("</table>");
				
				
				
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//logger.error("Some internal error");
			
		}
		
	}

		
		
}


