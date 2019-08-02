package com.virtusa.BusTicketReservation.service;

import java.util.List;

import com.virtusa.BusTicketReservation.exception.TravelLineException;
import com.virtusa.BusTicketReservation.model.BookingDetail;
import com.virtusa.BusTicketReservation.model.ServiceDetail;

public interface IService {
	public void printServiceDetails() throws TravelLineException;
	public List<ServiceDetail> selectService()throws TravelLineException;
	public int bookedDetails() throws TravelLineException;

	public int searchService(BookingDetail bookingDetail) throws TravelLineException;


}
