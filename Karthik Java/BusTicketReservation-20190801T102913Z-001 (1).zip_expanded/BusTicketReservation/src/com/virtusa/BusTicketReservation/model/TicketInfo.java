package com.virtusa.BusTicketReservation.model;

public class TicketInfo {
	private int infoId;
	private CustomerDetail customerDetail;
	private BookingDetail bookingDetail;
	private BookingMapDetail bookingMapDetail;
	private IdentityDetail identityDetail;
	private ServiceDetail serviceDetail;
	public TicketInfo()
	{}
	public TicketInfo(int infoId, CustomerDetail customerDetail, BookingDetail bookingDetail,
	BookingMapDetail bookingMapDetail, IdentityDetail identityDetail, ServiceDetail serviceDetail) {
	super();
	this.infoId = infoId;
	this.customerDetail = customerDetail;
	this.bookingDetail = bookingDetail;
	this.bookingMapDetail = bookingMapDetail;
	this.identityDetail = identityDetail;
	this.serviceDetail = serviceDetail;
	}
	public int getInfoId() {
	return infoId;
	}
	public void setInfoId(int infoId) {
	this.infoId = infoId;
	}
	public CustomerDetail getCustomerDetail() {
	return customerDetail;
	}
	public void setCustomerDetail(CustomerDetail customerDetail) {
	this.customerDetail = customerDetail;
	}
	public BookingDetail getBookingDetail() {
	return bookingDetail;
	}
	public void setBookingDetail(BookingDetail bookingDetail) {
	this.bookingDetail = bookingDetail;
	}
	public BookingMapDetail getBookingMapDetail() {
	return bookingMapDetail;
	}
	public void setBookingMapDetail(BookingMapDetail bookingMapDetail) {
	this.bookingMapDetail = bookingMapDetail;
	}
	public IdentityDetail getIdentityDetail() {
	return identityDetail;
	}
	public void setIdentityDetail(IdentityDetail identityDetail) {
	this.identityDetail = identityDetail;
	}
	public ServiceDetail getServiceDetail() {
	return serviceDetail;
	}
	public void setServiceDetail(ServiceDetail serviceDetail) {
	this.serviceDetail = serviceDetail;
	}
	@Override
	public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((bookingDetail == null) ? 0 : bookingDetail.hashCode());
	result = prime * result + ((bookingMapDetail == null) ? 0 : bookingMapDetail.hashCode());
	result = prime * result + ((customerDetail == null) ? 0 : customerDetail.hashCode());
	result = prime * result + ((identityDetail == null) ? 0 : identityDetail.hashCode());
	result = prime * result + infoId;
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
	TicketInfo other = (TicketInfo) obj;
	if (bookingDetail == null) {
	if (other.bookingDetail != null)
	return false;
	} else if (!bookingDetail.equals(other.bookingDetail))
	return false;
	if (bookingMapDetail == null) {
	if (other.bookingMapDetail != null)
	return false;
	} else if (!bookingMapDetail.equals(other.bookingMapDetail))
	return false;
	if (customerDetail == null) {
	if (other.customerDetail != null)
	return false;
	} else if (!customerDetail.equals(other.customerDetail))
	return false;
	if (identityDetail == null) {
	if (other.identityDetail != null)
	return false;
	} else if (!identityDetail.equals(other.identityDetail))
	return false;
	if (infoId != other.infoId)
	return false;
	if (serviceDetail == null) {
	if (other.serviceDetail != null)
	return false;
	} else if (!serviceDetail.equals(other.serviceDetail))
	return false;
	return true;
	}



}
