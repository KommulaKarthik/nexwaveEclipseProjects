package com.virtusa.BusTicketReservation.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.virtusa.BusTicketReservation.model.CreditCard;
import com.virtusa.BusTicketReservation.service.PaymentService;

/**
 * Servlet implementation class PaymentController
 */
@WebServlet("/PaymentController")
public class PaymentController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	/**
	 * @see
	 * 
	 * 		HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		


		Logger logger = Logger.getLogger("PaymentController");
		String CardHolderName = request.getParameter("CardHolderName");
		String expirD = request.getParameter("date");
		logger.info(expirD);
		int CardNumber = Integer.parseInt(request.getParameter("CardNo"));

		int CVV = Integer.parseInt(request.getParameter("cvv"));
		
		CreditCard creditcard = new CreditCard(CardNumber, CardHolderName, CVV, expirD);

	
		PaymentService service = new PaymentService();
		RequestDispatcher dispatcher = null;
		try {

		  int  cId = service.makePayment(creditcard);
			if (cId != 0) {
				dispatcher = request.getRequestDispatcher("/jsp/home.jsp");
			} else {
				dispatcher = request.getRequestDispatcher("/html/error.html");
			}

		} catch (Exception e) {
			
			
			logger.info(e);
			dispatcher = request.getRequestDispatcher("/html/error.html");

		}
		dispatcher.forward(request, response);
	}

}