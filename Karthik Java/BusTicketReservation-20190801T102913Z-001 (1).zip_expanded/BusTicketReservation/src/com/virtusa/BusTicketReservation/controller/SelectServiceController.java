package com.virtusa.BusTicketReservation.controller;

import org.apache.log4j.Logger;
import org.apache.log4j.Logger.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
//import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.virtusa.BusTicketReservation.exception.TravelLineException;
import com.virtusa.BusTicketReservation.model.ServiceDetail;
import com.virtusa.BusTicketReservation.service.ServiceSearch;

/**
 * Servlet implementation class SelectService
 */
@WebServlet("/SelectServiceController")
public class SelectServiceController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SelectServiceController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Logger logger = Logger.getLogger("SelectServiceController");
		RequestDispatcher requestDispatcher = null;

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		
		ServiceSearch ss = new ServiceSearch();
		try {
			List<ServiceDetail> p = ss.selectService();
			int bId=1;
			request.setAttribute("ServiceList", p);
			session.setAttribute("bookingId", bId);
			request.getRequestDispatcher("SelectService.jsp").forward(request, response);
		} catch (TravelLineException e) {
			e.printStackTrace();
			requestDispatcher = request.getRequestDispatcher("error.html");
			logger.error("internal error while login", e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

	}

}
