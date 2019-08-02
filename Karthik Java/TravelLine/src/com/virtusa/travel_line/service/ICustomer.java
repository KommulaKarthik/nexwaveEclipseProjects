package com.virtusa.travel_line.service;

import com.virtusa.travel_line.exception.TravelLineException;
import com.virtusa.travel_line.model.BookingMapDetail;
import com.virtusa.travel_line.model.ServiceDetail;

public interface ICustomer {
	
    public ServiceDetail retrieveTicket(ServiceDetail serviceDetail) throws TravelLineException;

	
	

}
