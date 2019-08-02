package com.virtusa.zomato.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;



import com.virtusa.zomato.exception.ZomatoException;
import com.virtusa.zomato.model.LoginDetail;
import com.virtusa.zomato.service.ZomatoService;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static ZomatoService service = new ZomatoService();
	
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Logger logger = Logger.getLogger("LoginController");
		RequestDispatcher requestDispatcher = null;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("Welcome to Servlets");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		LoginDetail loginDetail = new LoginDetail(username, password);
		
		
		
		
		try {
			int flag = service.doLoginCheck(loginDetail);
			//logger.info(message);
			
			if(flag==0){
				out.println("Not Successfully login");
				requestDispatcher = request.getRequestDispatcher("/html/login2.html");
				//requestDispatcher.forward(request,response);
			}
			else{
				logger.info(" successfully login plz display login page");
				out.print("Successfully logged in");
				HttpSession session = request.getSession();
				session.setAttribute("user",loginDetail);
				requestDispatcher = request.getRequestDispatcher("/html/home.html");
				//requestDispatcher.forward(request,response);
				
			}
			
			
		} catch (ZomatoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			requestDispatcher=  request.getRequestDispatcher("/html/error.html");
			logger.error("internal error while login",e);
		}
		
	
		requestDispatcher.forward(request, response);
		
	}

}
