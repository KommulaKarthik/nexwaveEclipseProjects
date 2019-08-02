package com.virtusa.BusTicketReservation.service;

import com.virtusa.BusTicketReservation.Dao.PaymentDao;
import com.virtusa.BusTicketReservation.exception.TravelLineException;
import com.virtusa.BusTicketReservation.model.CreditCard;

public class PaymentService {
PaymentDao paymentDao=new PaymentDao();
	public PaymentService() {
		// TODO Auto-generated constructor stub
	}

	public int makePayment(CreditCard creditcard) throws TravelLineException{
		// TODO Auto-generated method stub
		return paymentDao.makePayment(creditcard) ;

	}

}
