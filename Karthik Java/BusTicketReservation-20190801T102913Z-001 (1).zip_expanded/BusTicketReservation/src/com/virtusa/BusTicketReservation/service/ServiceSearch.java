package com.virtusa.BusTicketReservation.service;

import java.util.List;

import com.virtusa.BusTicketReservation.Dao.ServiceDao;
import com.virtusa.BusTicketReservation.exception.TravelLineException;
import com.virtusa.BusTicketReservation.model.BookingDetail;
import com.virtusa.BusTicketReservation.model.ServiceDetail;

public class ServiceSearch {

	ServiceDao serviceDao = ServiceDao.getServiceDao();
	
	static ServiceSearch serviceSearch=null;
public	static ServiceSearch getServiceSearch()
	{
		if(serviceSearch==null)
		{
			serviceSearch=new ServiceSearch();
		}
		return serviceSearch;
	}
	public ServiceSearch() {
		// TODO Auto-generated constructor stub
	}
	public void printServiceDetails() throws TravelLineException {
		// TODO Auto-generated method stub
		
	}
	public int searchService(BookingDetail bookingDetail) throws TravelLineException {
		// TODO Auto-generated method stub
		return serviceDao.searchService(bookingDetail);
	}
	public List<ServiceDetail>  selectService() throws TravelLineException {
		// TODO Auto-generated method stub
		return serviceDao.selectService();
	}
	public int bookedDetails() throws TravelLineException {
		// TODO Auto-generated method stub
		return serviceDao.bookedDetails();
	}
}
