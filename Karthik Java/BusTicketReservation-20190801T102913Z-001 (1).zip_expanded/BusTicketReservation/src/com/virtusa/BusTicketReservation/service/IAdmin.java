package com.virtusa.BusTicketReservation.service;

import java.util.List;

import com.virtusa.BusTicketReservation.exception.TravelLineException;
import com.virtusa.BusTicketReservation.model.AdminDetail;
import com.virtusa.BusTicketReservation.model.FeedbackDetail;
import com.virtusa.BusTicketReservation.model.ServiceDetail;

public interface IAdmin {
	public int modifyService(ServiceDetail serviceDetail) throws TravelLineException;
	public String deleteService(AdminDetail adminDetail) throws TravelLineException;
	public FeedbackDetail viewFeedback(FeedbackDetail feedbackDetail) throws TravelLineException;
	public List<ServiceDetail> viewSchedules() throws TravelLineException;
	public int doLogin(AdminDetail adminDetail) throws TravelLineException;
	public int addService(ServiceDetail serviceDetail) throws TravelLineException;
	public int addAdmin(AdminDetail adminDetail) throws TravelLineException;

}

