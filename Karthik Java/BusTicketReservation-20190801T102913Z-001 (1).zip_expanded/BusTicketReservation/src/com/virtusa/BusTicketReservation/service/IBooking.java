package com.virtusa.BusTicketReservation.service;

import com.virtusa.BusTicketReservation.exception.TravelLineException;
import com.virtusa.BusTicketReservation.model.BookingDetail;
import com.virtusa.BusTicketReservation.model.ServiceDetail;

public interface IBooking {
	
	public void bookTicket(BookingDetail bookingDetail) throws TravelLineException;
	public String cancelTicket(BookingDetail bookingDetail) throws TravelLineException;
	public void displayTicket() throws TravelLineException;
}
