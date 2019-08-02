package com.virtusa.BusTicketReservation.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.virtusa.BusTicketReservation.exception.TravelLineException;
import com.virtusa.BusTicketReservation.model.TicketInfo;
import com.virtusa.BusTicketReservation.service.CustomerService;

/**
 * Servlet implementation class RetrievalController
 */
@WebServlet("/RetrievalController")
public class RetrievalController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RetrievalController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Logger logger = Logger.getLogger("RetrievalController.class");

		response.setContentType("text/html");
		CustomerService customerService =CustomerService.getCustomerService();
		//PrintWriter out = response.getWriter();
		RequestDispatcher requestDispatcher =null;
		String bookId = request.getParameter("bookingId");
		int book=Integer.parseInt(bookId);
		
		
			
		try {
			
			List<TicketInfo> list= customerService.retrieveTicket(book);
			
			
			if(!(list.isEmpty())) {
			//HttpSession session = request.getSession();
			//session.setAttribute("bookingIdNo",bookingDetail );
			request.setAttribute("booklist",list);
			
			requestDispatcher=request.getRequestDispatcher("result.jsp");
			requestDispatcher.forward(request, response);
			}else {
				requestDispatcher = request.getRequestDispatcher("/html/error.html");
				requestDispatcher.forward(request, response);
				
				
			}
			
			
			
		} catch (TravelLineException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			requestDispatcher = request.getRequestDispatcher("/html/error.html");
			requestDispatcher.forward(request, response);
			logger.error("Some internal error");
			
		}
		
	}

	}


