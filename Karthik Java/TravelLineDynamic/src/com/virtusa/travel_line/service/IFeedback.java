package com.virtusa.travel_line.service;

import com.virtusa.travel_line.exception.TravelLineException;

public interface IFeedback {
	public String feedback() throws TravelLineException;
	public String cancelFeedback() throws TravelLineException;
	
	

}
