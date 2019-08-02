package com.virtusa.travel_line.service;

import com.virtusa.travel_line.dao.AdminDao;
import com.virtusa.travel_line.exception.TravelLineException;
import com.virtusa.travel_line.model.AdminDetail;
import com.virtusa.travel_line.model.FeedbackDetail;
import com.virtusa.travel_line.model.ServiceDetail;

public class AdminService {

	public AdminService() {
		// TODO Auto-generated constructor stub
	}
	private AdminDao adminDao = new AdminDao();
	
	public int addService(AdminDetail adminDetail) throws TravelLineException {
		// TODO Auto-generated method stub
		return adminDao.addService(adminDetail);
	}

	
	public int modifyService(AdminDetail adminDetail) throws TravelLineException {
		// TODO Auto-generated method stub
		return adminDao.modifyService(adminDetail);
	}

	public int addAdmin(AdminDetail adminDetail) throws TravelLineException {
		// TODO Auto-generated method stub
		return adminDao.addAdmin(adminDetail);
	}

	
	public int deleteService(AdminDetail adminDetail) throws TravelLineException {
		// TODO Auto-generated method stub
		return adminDao.deleteService(adminDetail);
	}

	
	public FeedbackDetail viewFeedback(FeedbackDetail feedbackDetail) throws TravelLineException {
		// TODO Auto-generated method stub
		return adminDao.viewFeedback(feedbackDetail);
	}

	
	public ServiceDetail viewSchedules(ServiceDetail serviceDetail) throws TravelLineException {
		// TODO Auto-generated method stub
		return adminDao.viewSchedules(serviceDetail);
	}
	
	public int doLogin(AdminDetail adminDetail) throws TravelLineException{
		
		return adminDao.doLogin(adminDetail);
	}

}
