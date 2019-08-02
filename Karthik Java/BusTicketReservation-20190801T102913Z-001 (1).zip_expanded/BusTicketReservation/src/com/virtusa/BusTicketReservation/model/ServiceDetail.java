package com.virtusa.BusTicketReservation.model;

import java.sql.Date;
import java.sql.Time;

public class ServiceDetail{

	public ServiceDetail(int serviceId, String serviceName, String serviceFrom, String serviceTo, double serviceFare,
			String busId, BookingDetail bookingDetail) {
		super();
		this.serviceId = serviceId;
		this.serviceName = serviceName;
		this.serviceFrom = serviceFrom;
		this.serviceTo = serviceTo;
		this.serviceFare = serviceFare;
		this.busId = busId;
		this.bookingDetail = bookingDetail;
	}
	
	public ServiceDetail(int serviceId, String serviceName, String serviceFrom, String serviceTo, double serviceFare) {
		super();
		this.serviceId = serviceId;
		this.serviceName = serviceName;
		this.serviceFrom = serviceFrom;
		this.serviceTo = serviceTo;
		this.serviceFare = serviceFare;
	}

	public ServiceDetail(String type, String type2) {
		// TODO Auto-generated constructor stub
	}
	private int serviceId;
	private String serviceName;
	private String serviceFrom;
	private String serviceTo;
	private double serviceFare;
	public ServiceDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private String busId;
	private BookingDetail bookingDetail;
	public int getServiceId() {
		return serviceId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getServiceFrom() {
		return serviceFrom;
	}
	public void setServiceFrom(String serviceFrom) {
		this.serviceFrom = serviceFrom;
	}
	public String getServiceTo() {
		return serviceTo;
	}
	public void setServiceTo(String serviceTo) {
		this.serviceTo = serviceTo;
	}
	public double getServiceFare() {
		return serviceFare;
	}
	public void setServiceFare(double serviceFare) {
		this.serviceFare = serviceFare;
	}
	public String getBusId() {
		return busId;
	}
	public void setBusId(String busId) {
		this.busId = busId;
	}
	public BookingDetail getBookingDetail() {
		return bookingDetail;
	}
	public void setBookingDetail(BookingDetail bookingDetail) {
		this.bookingDetail = bookingDetail;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookingDetail == null) ? 0 : bookingDetail.hashCode());
		result = prime * result + ((busId == null) ? 0 : busId.hashCode());
		long temp;
		temp = Double.doubleToLongBits(serviceFare);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((serviceFrom == null) ? 0 : serviceFrom.hashCode());
		result = prime * result + serviceId;
		result = prime * result + ((serviceName == null) ? 0 : serviceName.hashCode());
		result = prime * result + ((serviceTo == null) ? 0 : serviceTo.hashCode());
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
		ServiceDetail other = (ServiceDetail) obj;
		if (bookingDetail == null) {
			if (other.bookingDetail != null)
				return false;
		} else if (!bookingDetail.equals(other.bookingDetail))
			return false;
		if (busId == null) {
			if (other.busId != null)
				return false;
		} else if (!busId.equals(other.busId))
			return false;
		if (Double.doubleToLongBits(serviceFare) != Double.doubleToLongBits(other.serviceFare))
			return false;
		if (serviceFrom == null) {
			if (other.serviceFrom != null)
				return false;
		} else if (!serviceFrom.equals(other.serviceFrom))
			return false;
		if (serviceId != other.serviceId)
			return false;
		if (serviceName == null) {
			if (other.serviceName != null)
				return false;
		} else if (!serviceName.equals(other.serviceName))
			return false;
		if (serviceTo == null) {
			if (other.serviceTo != null)
				return false;
		} else if (!serviceTo.equals(other.serviceTo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ServiceDetail [serviceId=" + serviceId + ", serviceName=" + serviceName + ", serviceFrom=" + serviceFrom
				+ ", serviceTo=" + serviceTo + ", serviceFare=" + serviceFare + ", busId=" + busId + ", bookingDetail="
				+ bookingDetail + "]";
	}
}