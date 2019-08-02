package com.virtusa.travel_line.model;

public class BookingMapDetail {

	public BookingMapDetail() {
		// TODO Auto-generated constructor stub
	}
	private BookingDetail bookingDetail;
	private int seatNumber;
	private String passengerName;
	private int passengerAge;
	public BookingMapDetail(BookingDetail bookingDetail, int seatNumber, String passengerName, int passengerAge) {
		super();
		this.bookingDetail = bookingDetail;
		this.seatNumber = seatNumber;
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
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
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}
	@Override
	public String toString() {
		return "BookingMapDetail [bookingDetail=" + bookingDetail + ", seatNumber=" + seatNumber + ", passengerName="
				+ passengerName + ", passengerAge=" + passengerAge + "]";
	}
	
	
	
	
	

}
