package com.virtusa.travel_line.service;

import com.virtusa.travel_line.exception.TravelLineException;
import com.virtusa.travel_line.model.AdminDetail;
import com.virtusa.travel_line.model.FeedbackDetail;
import com.virtusa.travel_line.model.ServiceDetail;

public interface IAdmin {
	public int addService(AdminDetail adminDetail) throws TravelLineException;
	public int modifyService(AdminDetail adminDetail) throws TravelLineException;
	public int addAdmin(AdminDetail adminDetail) throws TravelLineException;
	public int deleteService(AdminDetail adminDetail) throws TravelLineException;
	public FeedbackDetail viewFeedback(FeedbackDetail feedbackDetail) throws TravelLineException;
	public ServiceDetail viewSchedules(ServiceDetail serviceDetail) throws TravelLineException;
	public int doLogin(AdminDetail adminDetail) throws TravelLineException;

}
