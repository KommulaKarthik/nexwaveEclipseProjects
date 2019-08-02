package com.virtusa.BusTicketReservation.service;

import java.util.List;

import com.virtusa.BusTicketReservation.Dao.AdminDao;
import com.virtusa.BusTicketReservation.exception.TravelLineException;
import com.virtusa.BusTicketReservation.model.AdminDetail;
import com.virtusa.BusTicketReservation.model.FeedbackDetail;
import com.virtusa.BusTicketReservation.model.ServiceDetail;

public class AdminService {

	public AdminService() {

	}
	private AdminDao adminDao = new AdminDao();
	
	public int addService(ServiceDetail serviceDetail) throws TravelLineException {

		return adminDao.addService(serviceDetail);
	}

	
	public int modifyService(ServiceDetail serviceDetail) throws TravelLineException {

		return adminDao.modifyService(serviceDetail);
	}

	public int addAdmin(AdminDetail adminDetail) throws TravelLineException {

		return adminDao.addAdmin(adminDetail);
	}

	
	public String deleteService(AdminDetail adminDetail) throws TravelLineException {

		return adminDao.deleteService(adminDetail);
	}

	
	public FeedbackDetail viewFeedback(FeedbackDetail feedbackDetail) throws TravelLineException {

		return adminDao.viewFeedback(feedbackDetail);
	}

	
	public List<ServiceDetail> viewSchedules() throws TravelLineException {

		return adminDao.viewSchedules();
	}


	public int doLogin(AdminDetail adminDetail) throws TravelLineException {

		return adminDao.doLogin(adminDetail);
	}

	

	
	
}
