package com.virtusa.BusTicketReservation.service;

import com.virtusa.BusTicketReservation.exception.TravelLineException;

public interface IFeedback {
	public String feedback() throws TravelLineException;
	public String cancelFeedback() throws TravelLineException;
	
	

}
