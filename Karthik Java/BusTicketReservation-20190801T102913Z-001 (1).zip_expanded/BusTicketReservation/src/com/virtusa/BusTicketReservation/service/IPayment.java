package com.virtusa.BusTicketReservation.service;

import com.virtusa.BusTicketReservation.exception.TravelLineException;
import com.virtusa.BusTicketReservation.model.BookingDetail;
import com.virtusa.BusTicketReservation.model.CreditCard;

public interface IPayment {
	//public String makePayment(CreditCard creditCard,BookingDetail bookingDetail) throws TravelLineException;
	public String cancelPayment()throws TravelLineException;
	int makePayment(CreditCard creditCard) throws TravelLineException;
	

}
