package com.virtusa.travel_line.model;

import java.sql.Date;

public class BookingDetail {

	public BookingDetail() {
		// TODO Auto-generated constructor stub
	}
	
	private int bookingId;
	private int pnrNo;
	private Date journeyDate;
	private Date bookingDate;
	private ServiceDetail serviceDetail;
	private CustomerDetail customerDetail;
	private int noOfSeats;
	public BookingDetail(int bookingId, int pnrNo, Date journeyDate, Date bookingDate, ServiceDetail serviceDetail,
			CustomerDetail customerDetail, int noOfSeats) {
		super();
		this.bookingId = bookingId;
		this.pnrNo = pnrNo;
		this.journeyDate = journeyDate;
		this.bookingDate = bookingDate;
		this.serviceDetail = serviceDetail;
		this.customerDetail = customerDetail;
		this.noOfSeats = noOfSeats;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getPnrNo() {
		return pnrNo;
	}
	public void setPnrNo(int pnrNo) {
		this.pnrNo = pnrNo;
	}
	public Date getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
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
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookingDate == null) ? 0 : bookingDate.hashCode());
		result = prime * result + bookingId;
		result = prime * result + ((customerDetail == null) ? 0 : customerDetail.hashCode());
		result = prime * result + ((journeyDate == null) ? 0 : journeyDate.hashCode());
		result = prime * result + noOfSeats;
		result = prime * result + pnrNo;
		result = prime * result + ((serviceDetail == null) ? 0 : serviceDetail.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookingDetail other = (BookingDetail) obj;
		if (bookingDate == null) {
			if (other.bookingDate != null)
				return false;
		} else if (!bookingDate.equals(other.bookingDate))
			return false;
		if (bookingId != other.bookingId)
			return false;
		if (customerDetail == null) {
			if (other.customerDetail != null)
				return false;
		} else if (!customerDetail.equals(other.customerDetail))
			return false;
		if (journeyDate == null) {
			if (other.journeyDate != null)
				return false;
		} else if (!journeyDate.equals(other.journeyDate))
			return false;
		if (noOfSeats != other.noOfSeats)
			return false;
		if (pnrNo != other.pnrNo)
			return false;
		if (serviceDetail == null) {
			if (other.serviceDetail != null)
				return false;
		} else if (!serviceDetail.equals(other.serviceDetail))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BookingDetail [bookingId=" + bookingId + ", pnrNo=" + pnrNo + ", journeyDate=" + journeyDate
				+ ", bookingDate=" + bookingDate + ", serviceDetail=" + serviceDetail + ", customerDetail="
				+ customerDetail + ", noOfSeats=" + noOfSeats + "]";
	}
	
	
	

}
