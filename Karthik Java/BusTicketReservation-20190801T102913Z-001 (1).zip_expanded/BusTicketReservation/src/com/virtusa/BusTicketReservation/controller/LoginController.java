package com.virtusa.BusTicketReservation.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.virtusa.BusTicketReservation.exception.TravelLineException;
import com.virtusa.BusTicketReservation.model.AdminDetail;
import com.virtusa.BusTicketReservation.service.AdminService;



/**
 * Servlet implementation class Logincontroller
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		AdminDetail adminDetail;
		response.setContentType("text/html");
		Logger logger = Logger.getLogger("logging");
		String adminName = request.getParameter("adminName");
		String password = request.getParameter("password");

		
		adminDetail = new AdminDetail(adminName, password);
		AdminService adminService = new AdminService();

		try {
			int i = adminService.doLogin(adminDetail);
			if (i != 0) {
				HttpSession session = request.getSession();
				session.setAttribute("adminName", adminName);
				request.getRequestDispatcher("AddAdmin.jsp").forward(request, response);
			} else {

				//request.getRequestDispatcher("login.jsp").forward(request, response);
				request.setAttribute("message","username/password not correct");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		} catch (TravelLineException e) {
			logger.error("Travelline exception", e);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			doGet(request, response);

	}

}