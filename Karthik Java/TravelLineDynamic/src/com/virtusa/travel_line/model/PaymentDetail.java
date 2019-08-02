package com.virtusa.travel_line.model;

public class PaymentDetail {

	public PaymentDetail() {
		// TODO Auto-generated constructor stub
	}
	private int paymentId;
	private BookingDetail bookingDetail;
	private CreditCard creditCard;
	private long totalFare;
	public PaymentDetail(int paymentId, BookingDetail bookingDetail, CreditCard creditCard, long totalFare) {
		super();
		this.paymentId = paymentId;
		this.bookingDetail = bookingDetail;
		this.creditCard = creditCard;
		this.totalFare = totalFare;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public BookingDetail getBookingDetail() {
		return bookingDetail;
	}
	public void setBookingDetail(BookingDetail bookingDetail) {
		this.bookingDetail = bookingDetail;
	}
	public CreditCard getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	public long getTotalFare() {
		return totalFare;
	}
	public void setTotalFare(long totalFare) {
		this.totalFare = totalFare;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookingDetail == null) ? 0 : bookingDetail.hashCode());
		result = prime * result + ((creditCard == null) ? 0 : creditCard.hashCode());
		result = prime * result + paymentId;
		result = prime * result + (int) (totalFare ^ (totalFare >>> 32));
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
		PaymentDetail other = (PaymentDetail) obj;
		if (bookingDetail == null) {
			if (other.bookingDetail != null)
				return false;
		} else if (!bookingDetail.equals(other.bookingDetail))
			return false;
		if (creditCard == null) {
			if (other.creditCard != null)
				return false;
		} else if (!creditCard.equals(other.creditCard))
			return false;
		if (paymentId != other.paymentId)
			return false;
		if (totalFare != other.totalFare)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PaymentDetail [paymentId=" + paymentId + ", bookingDetail=" + bookingDetail + ", creditCard="
				+ creditCard + ", totalFare=" + totalFare + "]";
	}
	
	
	

}
