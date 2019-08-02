package com.virtusa.travel_line.model;

public class BookingMapDetail {

	public BookingMapDetail() {
		// TODO Auto-generated constructor stub
	}
	private BookingDetail bookingDetail;
	private int seatNumber;
	private String travellerName;
	private int travellerAge;
	public BookingMapDetail(BookingDetail bookingDetail, int seatNumber, String travellerName, int travellerAge) {
		super();
		this.bookingDetail = bookingDetail;
		this.seatNumber = seatNumber;
		this.travellerName = travellerName;
		this.travellerAge = travellerAge;
	}
	public BookingDetail getBookingDetail() {
		return bookingDetail;
	}
	public void setBookingDetail(BookingDetail bookingDetail) {
		this.bookingDetail = bookingDetail;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public String getTravellerName() {
		return travellerName;
	}
	public void setTravellerName(String travellerName) {
		this.travellerName = travellerName;
	}
	public int getTravellerAge() {
		return travellerAge;
	}
	public void setTravellerAge(int travellerAge) {
		this.travellerAge = travellerAge;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookingDetail == null) ? 0 : bookingDetail.hashCode());
		result = prime * result + seatNumber;
		result = prime * result + travellerAge;
		result = prime * result + ((travellerName == null) ? 0 : travellerName.hashCode());
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
		BookingMapDetail other = (BookingMapDetail) obj;
		if (bookingDetail == null) {
			if (other.bookingDetail != null)
				return false;
		} else if (!bookingDetail.equals(other.bookingDetail))
			return false;
		if (seatNumber != other.seatNumber)
			return false;
		if (travellerAge != other.travellerAge)
			return false;
		if (travellerName == null) {
			if (other.travellerName != null)
				return false;
		} else if (!travellerName.equals(other.travellerName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BookingMapDetail [bookingDetail=" + bookingDetail + ", seatNumber=" + seatNumber + ", travellerName="
				+ travellerName + ", travellerAge=" + travellerAge + "]";
	}
	
	
	
	

}
