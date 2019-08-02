package com.virtusa.travel_line.service;

import java.util.List;

import com.virtusa.travel_line.dao.CustomerDao;
import com.virtusa.travel_line.exception.TravelLineException;
import com.virtusa.travel_line.model.TicketInfo;

public class CustomerService {

	public CustomerService() {
		// TODO Auto-generated constructor stub
	}
	
	private CustomerDao customerDao = new CustomerDao();
	
	public List<TicketInfo> retrieveTicket(int bid) throws TravelLineException {
		// TODO Auto-generated method stub
		return customerDao.retrieveTicket(bid);
	}

}
