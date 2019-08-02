package com.virtusa.BusTicketReservation.service;

import com.virtusa.BusTicketReservation.exception.TravelLineException;
import com.virtusa.BusTicketReservation.model.BookingMapDetail;
import com.virtusa.BusTicketReservation.model.ServiceDetail;

public interface IBookingMap {
	
	public void displayBookingDetails(BookingMapDetail bookingMapDetail) throws TravelLineException;
	//public int passengerDetails()throws TravelLineException;
	int passengerDetails(BookingMapDetail bookingMapDetail) throws TravelLineException;


}
