package com.virtusa.zomato.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.virtusa.zomato.exception.ZomatoException;
import com.virtusa.zomato.model.RestaurantMenuDetail;
import com.virtusa.zomato.service.ZomatoService;

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

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
   
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Logger logger = Logger.getLogger("SearchController");

		response.setContentType("text/html");
		ZomatoService service = new ZomatoService();
		PrintWriter out = response.getWriter();
		RequestDispatcher requestDispatcher =null;
		String restaurantName = request.getParameter("restaurantName");
		
		try{
			List<RestaurantMenuDetail> list = service.searchRestautants(restaurantName);
			request.setAttribute("restlist", list);
			
			requestDispatcher= request.getRequestDispatcher("/jsp/result.jsp");
			requestDispatcher.forward(request, response);
		} catch (ZomatoException e) {
			// TODO Auto-generated catch block
			logger.error("Some internal error");
			requestDispatcher = request.getRequestDispatcher("/html/error.html");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*try {
			List<RestaurantMenuDetail> list = service.searchRestautants(restaurantName);
			
			if(list.size()==0){
				
				
				System.out.println("List is empty");
				
				
			}else{
				
				out.println("<table border='1'>");
				out.println("<tr><td>Restaurant Name</td><td>Address</td><td>Menu Name</td><td>Menu Price</td></tr>");
				
				for(RestaurantMenuDetail restaurantMenuDetail : list){
					System.out.println("<tr>");
					out.print("<td>" + restaurantMenuDetail.getRestaurant().getRestaurantName() + "</td>");
					out.print("<td>" + restaurantMenuDetail.getRestaurant().getRestaurantAddress()  + "</td>");
					out.print("<td>" + restaurantMenuDetail.getMenuDetail().getMenuName()  + "</td>");
					out.print("<td>" + restaurantMenuDetail.getMenuDetail().getMenuPrice()  + "</td>");
					System.out.println("<tr>");
					
					
				}
				
				out.println("</table>");
				
				
				
			}
			
		} catch (ZomatoException e) {
			// TODO Auto-generated catch block
			logger.error("Some internal error");
			requestDispatcher = request.getRequestDispatcher("/html/error.html");
			
		}*/
		
		requestDispatcher.forward(request, response);

		
		
		
	}

	
	
}
