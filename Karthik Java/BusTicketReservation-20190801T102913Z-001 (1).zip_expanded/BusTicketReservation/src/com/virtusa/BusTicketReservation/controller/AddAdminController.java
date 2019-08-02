package com.virtusa.BusTicketReservation.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.virtusa.BusTicketReservation.model.AdminDetail;
import com.virtusa.BusTicketReservation.service.AdminService;



/**
 * Servlet implementation class AddAdminController
 */
@WebServlet("/AddAdminController")
public class AddAdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddAdminController() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		Logger logger = Logger.getLogger("logging");
		String adminName = request.getParameter("AdministratorName");
		String password = request.getParameter("AdminPassword");
		String confirmPassword = request.getParameter("ConfirmPassword");
		AdminDetail adminDetail = null;
		
		if (password.equals(confirmPassword)) {
			
			adminDetail = new AdminDetail(adminName, password);
		} else {
			request.setAttribute("message","enter same passwords");
			request.getRequestDispatcher("AddAdmin.jsp").forward(request, response);
		}

		AdminService adminService = new AdminService();
		
		try {
			int i = adminService.addAdmin(adminDetail);
				
			if (i != 0) {
				HttpSession session = request.getSession();
				session.setAttribute("adminName", adminName);
				request.getRequestDispatcher("AddAdmin.jsp").forward(request, response);
			} else {

				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		} catch (com.virtusa.BusTicketReservation.exception.TravelLineException e) {
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