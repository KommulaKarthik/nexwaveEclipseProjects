package com.virtusa.BusTicketReservation.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.BusTicketReservation.service.ServiceSearch;

/**
 * Servlet implementation class BookedDetailsController
 * @param <SearchService>
 */
public class BookedDetailsController<SearchService> extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookedDetailsController() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		RequestDispatcher dispatcher=null;
		ServiceSearch service=new ServiceSearch();
		try{
		int genId=service.bookedDetails();
        System.out.println(genId);
		if(genId!=0){

		
		dispatcher=request.getRequestDispatcher("//success.html");
		}else{
		dispatcher=request.getRequestDispatcher("/html/error.html");
		}

		}catch(Exception e){
		e.printStackTrace();
		dispatcher=request.getRequestDispatcher("/html/error.html");

		}
		dispatcher.forward(request, response);	

		}

		
	}


