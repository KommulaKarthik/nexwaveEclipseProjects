package com.virtusa.travel_line.service;

import java.util.List;

import com.virtusa.travel_line.exception.TravelLineException;
import com.virtusa.travel_line.model.BookingDetail;
import com.virtusa.travel_line.model.TicketInfo;

public interface ICustomer {
	
    public List<TicketInfo> retrieveTicket(int bid) throws TravelLineException;

	
	

}
