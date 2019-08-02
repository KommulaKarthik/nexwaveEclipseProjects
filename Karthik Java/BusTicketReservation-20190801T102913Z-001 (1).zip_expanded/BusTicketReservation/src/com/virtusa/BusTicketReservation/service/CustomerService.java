package com.virtusa.BusTicketReservation.service;

import java.util.List;

import com.virtusa.BusTicketReservation.Dao.CustomerDao;
import com.virtusa.BusTicketReservation.exception.TravelLineException;
import com.virtusa.BusTicketReservation.model.ServiceDetail;
import com.virtusa.BusTicketReservation.model.TicketInfo;

public class CustomerService {
	
	static CustomerService customerService=null;
	public	static CustomerService getCustomerService()
		{
			if(customerService==null)
			{
				customerService=new CustomerService();
			}
			return customerService;
		}

	public CustomerService() {
		// TODO Auto-generated constructor stub
	}
	
	private CustomerDao customerDao = new CustomerDao();
	
	
	public List<TicketInfo> retrieveTicket(int bid) throws TravelLineException {
		// TODO Auto-generated method stub
		return customerDao.retrieveTicket(bid);
	}

}
