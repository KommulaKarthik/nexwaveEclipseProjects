package com.virtusa.travel_line.model;

import java.sql.Time;

public class ServiceDetail extends BusTypeDetail {

	public ServiceDetail() {
		// TODO Auto-generated constructor stub
	}
	private int serviceId;
	private int capacity;
	private String serviceFrom;
	private String serviceTo;
	private double serviceFare;
	private String serviceStatus;
	private Time departureTime;
	private Time journeyTime;
	private StationDetail stationDetail;
	private BusTypeDetail busTypeDetail;
	private long distance;
	public ServiceDetail(int serviceId, int capacity, String serviceFrom, String serviceTo, double serviceFare,
			String serviceStatus, Time departureTime, Time journeyTime, StationDetail stationDetail,
			BusTypeDetail busTypeDetail, long distance) {
		super();
		this.serviceId = serviceId;
		this.capacity = capacity;
		this.serviceFrom = serviceFrom;
		this.serviceTo = serviceTo;
		this.serviceFare = serviceFare;
		this.serviceStatus = serviceStatus;
		this.departureTime = departureTime;
		this.journeyTime = journeyTime;
		this.stationDetail = stationDetail;
		this.busTypeDetail = busTypeDetail;
		this.distance = distance;
	}
	public int getServiceId() {
		return serviceId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
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
	public String getServiceStatus() {
		return serviceStatus;
	}
	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}
	public Time getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}
	public Time getJourneyTime() {
		return journeyTime;
	}
	public void setJourneyTime(Time journeyTime) {
		this.journeyTime = journeyTime;
	}
	public StationDetail getStationDetail() {
		return stationDetail;
	}
	public void setStationDetail(StationDetail stationDetail) {
		this.stationDetail = stationDetail;
	}
	public BusTypeDetail getBusTypeDetail() {
		return busTypeDetail;
	}
	public void setBusTypeDetail(BusTypeDetail busTypeDetail) {
		this.busTypeDetail = busTypeDetail;
	}
	public long getDistance() {
		return distance;
	}
	public void setDistance(long distance) {
		this.distance = distance;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((busTypeDetail == null) ? 0 : busTypeDetail.hashCode());
		result = prime * result + capacity;
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + (int) (distance ^ (distance >>> 32));
		result = prime * result + ((journeyTime == null) ? 0 : journeyTime.hashCode());
		long temp;
		temp = Double.doubleToLongBits(serviceFare);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((serviceFrom == null) ? 0 : serviceFrom.hashCode());
		result = prime * result + serviceId;
		result = prime * result + ((serviceStatus == null) ? 0 : serviceStatus.hashCode());
		result = prime * result + ((serviceTo == null) ? 0 : serviceTo.hashCode());
		result = prime * result + ((stationDetail == null) ? 0 : stationDetail.hashCode());
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
		if (busTypeDetail == null) {
			if (other.busTypeDetail != null)
				return false;
		} else if (!busTypeDetail.equals(other.busTypeDetail))
			return false;
		if (capacity != other.capacity)
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (distance != other.distance)
			return false;
		if (journeyTime == null) {
			if (other.journeyTime != null)
				return false;
		} else if (!journeyTime.equals(other.journeyTime))
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
		if (serviceStatus == null) {
			if (other.serviceStatus != null)
				return false;
		} else if (!serviceStatus.equals(other.serviceStatus))
			return false;
		if (serviceTo == null) {
			if (other.serviceTo != null)
				return false;
		} else if (!serviceTo.equals(other.serviceTo))
			return false;
		if (stationDetail == null) {
			if (other.stationDetail != null)
				return false;
		} else if (!stationDetail.equals(other.stationDetail))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ServiceDetail [serviceId=" + serviceId + ", capacity=" + capacity + ", serviceFrom=" + serviceFrom
				+ ", serviceTo=" + serviceTo + ", serviceFare=" + serviceFare + ", serviceStatus=" + serviceStatus
				+ ", departureTime=" + departureTime + ", journeyTime=" + journeyTime + ", stationDetail="
				+ stationDetail + ", busTypeDetail=" + busTypeDetail + ", distance=" + distance + "]";
	}
	
	
	

}
