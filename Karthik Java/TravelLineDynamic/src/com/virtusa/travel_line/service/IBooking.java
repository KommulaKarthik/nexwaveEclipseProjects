package com.virtusa.travel_line.service;

import com.virtusa.travel_line.exception.TravelLineException;
import com.virtusa.travel_line.model.BookingDetail;
import com.virtusa.travel_line.model.ServiceDetail;

public interface IBooking {
	
	public void bookTicket(BookingDetail bookingDetail) throws TravelLineException;
	public String cancelTicket(BookingDetail bookingDetail) throws TravelLineException;
	public void displayTicket() throws TravelLineException;
}
