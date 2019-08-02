package com.virtusa.BusTicketReservation.service;

import java.util.List;

import com.virtusa.BusTicketReservation.exception.TravelLineException;
import com.virtusa.BusTicketReservation.model.BookingMapDetail;
import com.virtusa.BusTicketReservation.model.ServiceDetail;
import com.virtusa.BusTicketReservation.model.TicketInfo;

public interface ICustomer {
	
	 public List<TicketInfo> retrieveTicket(int bid) throws TravelLineException ;
	 
}
