package com.virtusa.travel_line.service;

import com.virtusa.travel_line.dao.BookingDao;
import com.virtusa.travel_line.exception.TravelLineException;
import com.virtusa.travel_line.model.BookingDetail;

public class BookingService {

	public BookingService() {
		// TODO Auto-generated constructor stub
		
		
		
	}
	private BookingDao bookingDao = new BookingDao();
	
	
	public void bookTicket(BookingDetail bookingDetail) throws TravelLineException {
		// TODO Auto-generated method stub
		
	}

	
	public String cancelTicket(BookingDetail bookingDetail) throws TravelLineException {
		// TODO Auto-generated method stub
		return bookingDao.cancelTicket(bookingDetail);
	}

	
	public void displayTicket() throws TravelLineException {
		// TODO Auto-generated method stub
		
	}


}
