package com.virtusa.travel_line.dao;

import com.virtusa.travel_line.exception.TravelLineException;
import com.virtusa.travel_line.model.BookingDetail;
import com.virtusa.travel_line.model.CreditCard;
import com.virtusa.travel_line.service.IPayment;

public class PaymentDao implements IPayment {

	public PaymentDao() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makePayment(CreditCard creditCard, BookingDetail bookingDetail) throws TravelLineException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String cancelPayment() throws TravelLineException {
		// TODO Auto-generated method stub
		return null;
	}

}
