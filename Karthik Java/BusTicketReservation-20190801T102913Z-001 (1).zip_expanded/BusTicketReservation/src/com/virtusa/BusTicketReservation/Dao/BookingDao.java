package com.virtusa.BusTicketReservation.Dao;

import com.virtusa.BusTicketReservation.exception.TravelLineException;
import com.virtusa.BusTicketReservation.model.BookingDetail;
import com.virtusa.BusTicketReservation.service.IBooking;

public class BookingDao implements IBooking {

	public BookingDao() {

	}

	@Override
	public void bookTicket(BookingDetail bookingDetail) throws TravelLineException {
		
	}

	@Override
	public String cancelTicket(BookingDetail bookingDetail) throws TravelLineException {

		return null;
	}

	@Override
	public void displayTicket() throws TravelLineException {

		
	}

}
