package com.virtusa.BusTicketReservation.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SeatSelectController
 */
@WebServlet("/SeatSelectController")

public class SeatSelectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SeatSelectController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
				response.setContentType("text/html");
				PrintWriter out=response.getWriter();
				HttpSession session=request.getSession();
				System.out.println("session id is "+session.getAttribute("bId"));
				session.invalidate();
				session.setMaxInactiveInterval(120);
				
			String select[]=request.getParameterValues("seat");
				try {
					out.println("<!DOCTYPE html>");
					out.println("<html>");
					out.println("<body>");
					out.println("<p>Selected Seats are: </p>"+select.length);
					out.print("<form action='/BusTicketReservation/PassengerDetailsController' method='post'>");
							
					
					for(int i=0;i<select.length;i++) {
						out.println(select[i]);
						out.println("Enter name passenger "+(i+1)+"<input type='text' name='PassengerName'><br>");
						out.println("Enter passenger  "+(i+1)+" age <input type='text' name='PassengerAge'><br>");
						out.println("Seat no selected<input type='text' name='seatno' readonly='readonly' value="+select[i]+">"+"<br>");	
						
					}
					out.println("<input type='submit' name='submit' value='proceed'>");
					out.println("</form>");					
					out.println("</body>");
					out.println("</html>");
				}finally {
					out.close();
				}
				
	
	}

}
