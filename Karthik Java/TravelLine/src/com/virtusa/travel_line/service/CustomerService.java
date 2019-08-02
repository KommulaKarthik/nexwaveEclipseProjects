package com.virtusa.travel_line.service;

import com.virtusa.travel_line.dao.CustomerDao;
import com.virtusa.travel_line.exception.TravelLineException;
import com.virtusa.travel_line.model.ServiceDetail;

public class CustomerService {

	public CustomerService() {
		// TODO Auto-generated constructor stub
	}
	
	private CustomerDao customerDao = new CustomerDao();
	
	public ServiceDetail retrieveTicket(ServiceDetail serviceDetail) throws TravelLineException {
		// TODO Auto-generated method stub
		return customerDao.retrieveTicket(serviceDetail);
	}

}
