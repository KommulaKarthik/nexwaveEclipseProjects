package com.virtusa.BusTicketReservation.service;

import com.virtusa.BusTicketReservation.Dao.BookingDao;
import com.virtusa.BusTicketReservation.exception.TravelLineException;
import com.virtusa.BusTicketReservation.model.BookingDetail;

public class BookingService {

	public BookingService() {
		
		
		
	}
	private BookingDao bookingDao = new BookingDao();
	
	
	public void bookTicket(BookingDetail bookingDetail) throws TravelLineException {
		
	}

	
	public String cancelTicket(BookingDetail bookingDetail) throws TravelLineException {
		return bookingDao.cancelTicket(bookingDetail);
	}

	
	public void displayTicket() throws TravelLineException {

		
	}


}
