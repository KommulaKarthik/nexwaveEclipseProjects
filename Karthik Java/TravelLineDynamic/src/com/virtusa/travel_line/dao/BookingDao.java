package com.virtusa.travel_line.dao;

import com.virtusa.travel_line.exception.TravelLineException;
import com.virtusa.travel_line.model.BookingDetail;
import com.virtusa.travel_line.service.IBooking;

public class BookingDao implements IBooking {

	public BookingDao() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bookTicket(BookingDetail bookingDetail) throws TravelLineException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String cancelTicket(BookingDetail bookingDetail) throws TravelLineException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void displayTicket() throws TravelLineException {
		// TODO Auto-generated method stub
		
	}

}
