package com.virtusa.travel_line.service;

import com.virtusa.travel_line.exception.TravelLineException;
import com.virtusa.travel_line.model.BookingDetail;
import com.virtusa.travel_line.model.CreditCard;

public interface IPayment {
	public String makePayment(CreditCard creditCard,BookingDetail bookingDetail) throws TravelLineException;
	public String cancelPayment()throws TravelLineException;
	

}
