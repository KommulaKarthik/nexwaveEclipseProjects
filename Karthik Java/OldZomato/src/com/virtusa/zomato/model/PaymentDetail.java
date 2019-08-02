package com.virtusa.zomato.model;

public class PaymentDetail {
	
	private int paymentId;
	private String paymentType;
	private String paymentStatus;
	private OrderDetail orderDetail;
	private CustomerDetail customerDetail;
	public PaymentDetail(int paymentId, String paymentType, String paymentStatus, OrderDetail orderDetail,
			CustomerDetail customerDetail) {
		super();
		this.paymentId = paymentId;
		this.paymentType = paymentType;
		this.paymentStatus = paymentStatus;
		this.orderDetail = orderDetail;
		this.customerDetail = customerDetail;
	}
	public PaymentDetail() {
		// TODO Auto-generated constructor stub
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public OrderDetail getOrderDetail() {
		return orderDetail;
	}
	public void setOrderDetail(OrderDetail orderDetail) {
		this.orderDetail = orderDetail;
	}
	public CustomerDetail getCustomerDetail() {
		return customerDetail;
	}
	public void setCustomerDetail(CustomerDetail customerDetail) {
		this.customerDetail = customerDetail;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerDetail == null) ? 0 : customerDetail.hashCode());
		result = prime * result + ((orderDetail == null) ? 0 : orderDetail.hashCode());
		result = prime * result + paymentId;
		result = prime * result + ((paymentStatus == null) ? 0 : paymentStatus.hashCode());
		result = prime * result + ((paymentType == null) ? 0 : paymentType.hashCode());
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
		if (customerDetail == null) {
			if (other.customerDetail != null)
				return false;
		} else if (!customerDetail.equals(other.customerDetail))
			return false;
		if (orderDetail == null) {
			if (other.orderDetail != null)
				return false;
		} else if (!orderDetail.equals(other.orderDetail))
			return false;
		if (paymentId != other.paymentId)
			return false;
		if (paymentStatus == null) {
			if (other.paymentStatus != null)
				return false;
		} else if (!paymentStatus.equals(other.paymentStatus))
			return false;
		if (paymentType == null) {
			if (other.paymentType != null)
				return false;
		} else if (!paymentType.equals(other.paymentType))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PaymentDetail [paymentId=" + paymentId + ", paymentType=" + paymentType + ", paymentStatus="
				+ paymentStatus + ", orderDetail=" + orderDetail + ", customerDetail=" + customerDetail + "]";
	}
	
	

}
