package com.virtusa.BusTicketReservation.model;

import java.sql.Date;

public class BookingDetail {

	public BookingDetail() {

	}
	
	private int bookingId;
	private String journeyDate;
	private String bookingDate;
	private ServiceDetail serviceDetail;
	private CustomerDetail customerDetail;
	private int noOfpassengers;
	private String selectedBusName;
	private int selectedBusId;
	private String source;
	private String destination;
	public BookingDetail(int bookingId, String journeyDate, String bookingDate, ServiceDetail serviceDetail,
			CustomerDetail customerDetail, int noOfpassengers, String selectedBusName, int selectedBusId, String source,
			String destination) {
		super();
		this.bookingId = bookingId;
		this.journeyDate = journeyDate;
		this.bookingDate = bookingDate;
		this.serviceDetail = serviceDetail;
		this.customerDetail = customerDetail;
		this.noOfpassengers = noOfpassengers;
		this.selectedBusName = selectedBusName;
		this.selectedBusId = selectedBusId;
		this.source = source;
		this.destination = destination;
	}
	public BookingDetail(String journeyDate, int noOfpassengers, String source, String destination) {
		super();
		this.journeyDate = journeyDate;
		this.noOfpassengers = noOfpassengers;
		this.source = source;
		this.destination = destination;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(String journeyDate) {
		this.journeyDate = journeyDate;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public ServiceDetail getServiceDetail() {
		return serviceDetail;
	}
	public void setServiceDetail(ServiceDetail serviceDetail) {
		this.serviceDetail = serviceDetail;
	}
	public CustomerDetail getCustomerDetail() {
		return customerDetail;
	}
	public void setCustomerDetail(CustomerDetail customerDetail) {
		this.customerDetail = customerDetail;
	}
	public int getNoOfpassengers() {
		return noOfpassengers;
	}
	public void setNoOfpassengers(int noOfpassengers) {
		this.noOfpassengers = noOfpassengers;
	}
	public String getSelectedBusName() {
		return selectedBusName;
	}
	public void setSelectedBusName(String selectedBusName) {
		this.selectedBusName = selectedBusName;
	}
	public int getSelectedBusId() {
		return selectedBusId;
	}
	public void setSelectedBusId(int selectedBusId) {
		this.selectedBusId = selectedBusId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	
	
	
}