package com.virtusa.travel_line.service;

import com.virtusa.travel_line.exception.TravelLineException;
import com.virtusa.travel_line.model.ServiceDetail;

public interface IService {
	public void printServiceDetails() throws TravelLineException;
	public ServiceDetail searchService(ServiceDetail serviceDetail) throws TravelLineException;
	public ServiceDetail selectService(ServiceDetail serviceDetail) throws TravelLineException;


}
