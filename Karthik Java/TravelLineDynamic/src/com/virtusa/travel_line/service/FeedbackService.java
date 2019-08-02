package com.virtusa.travel_line.service;

import com.virtusa.travel_line.dao.FeedbackDao;
import com.virtusa.travel_line.exception.TravelLineException;

public class FeedbackService {

	public FeedbackService() {
		// TODO Auto-generated constructor stub
	}
	
	private FeedbackDao feedbackDao = new FeedbackDao();
	
	public String feedback() throws TravelLineException {
		// TODO Auto-generated method stub
		return feedbackDao.feedback();
	}

	
	public String cancelFeedback() throws TravelLineException {
		// TODO Auto-generated method stub
		return feedbackDao.cancelFeedback();
	}

}
