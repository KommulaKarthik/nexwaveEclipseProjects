package com.virtusa.travel_line.service;

import com.virtusa.travel_line.exception.TravelLineException;
import com.virtusa.travel_line.model.BookingMapDetail;
import com.virtusa.travel_line.model.ServiceDetail;

public interface IBookingMap {
	
	public void displayBookingDetails(BookingMapDetail bookingMapDetail) throws TravelLineException;
	public void selectSeat(BookingMapDetail bookingMapDetail)throws TravelLineException;


}
