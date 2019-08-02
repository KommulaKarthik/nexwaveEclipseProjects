package com.virtusa.BusTicketReservation.service;

import com.virtusa.BusTicketReservation.Dao.BookingMapDao;
import com.virtusa.BusTicketReservation.exception.TravelLineException;
import com.virtusa.BusTicketReservation.model.BookingMapDetail;

public class BookingMapService {

	public BookingMapService() {

		
		
	}
	private BookingMapDao bookingMapDao = new BookingMapDao();
	
	
	public void displayBookingDetails(BookingMapDetail bookingMapDetail) throws TravelLineException {
	
		
	}

	
	public int passengerDetails(BookingMapDetail bookingMapDetail) throws TravelLineException {
		return bookingMapDao.passengerDetails(bookingMapDetail);

		
	}

}
