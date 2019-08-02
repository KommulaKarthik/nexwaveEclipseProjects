package com.virtusa.BusTicketReservation.model;

public class CustomerDetail {

	public CustomerDetail() {
		// TODO Auto-generated constructor stub
	}
	
	private int customerId;
	private String customerFullName;
	private int customerAge;
	private long customerMobileNumber;
	private String customerMailId;
	private IdentityDetail identityDetail;
	public CustomerDetail(int customerId, String customerFullName, int customerAge, long customerMobileNumber,
			String customerMailId, IdentityDetail identityDetail) {
		super();
		this.customerId = customerId;
		this.customerFullName = customerFullName;
		this.customerAge = customerAge;
		this.customerMobileNumber = customerMobileNumber;
		this.customerMailId = customerMailId;
		this.identityDetail = identityDetail;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerFullName() {
		return customerFullName;
	}
	public void setCustomerFullName(String customerFullName) {
		this.customerFullName = customerFullName;
	}
	public int getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	public long getCustomerMobileNumber() {
		return customerMobileNumber;
	}
	public void setCustomerMobileNumber(long customerMobileNumber) {
		this.customerMobileNumber = customerMobileNumber;
	}
	public String getCustomerMailId() {
		return customerMailId;
	}
	public void setCustomerMailId(String customerMailId) {
		this.customerMailId = customerMailId;
	}
	public IdentityDetail getIdentityDetail() {
		return identityDetail;
	}
	public void setIdentityDetail(IdentityDetail identityDetail) {
		this.identityDetail = identityDetail;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + customerAge;
		result = prime * result + ((customerFullName == null) ? 0 : customerFullName.hashCode());
		result = prime * result + customerId;
		result = prime * result + ((customerMailId == null) ? 0 : customerMailId.hashCode());
		result = prime * result + (int) (customerMobileNumber ^ (customerMobileNumber >>> 32));
		result = prime * result + ((identityDetail == null) ? 0 : identityDetail.hashCode());
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
		CustomerDetail other = (CustomerDetail) obj;
		if (customerAge != other.customerAge)
			return false;
		if (customerFullName == null) {
			if (other.customerFullName != null)
				return false;
		} else if (!customerFullName.equals(other.customerFullName))
			return false;
		if (customerId != other.customerId)
			return false;
		if (customerMailId == null) {
			if (other.customerMailId != null)
				return false;
		} else if (!customerMailId.equals(other.customerMailId))
			return false;
		if (customerMobileNumber != other.customerMobileNumber)
			return false;
		if (identityDetail == null) {
			if (other.identityDetail != null)
				return false;
		} else if (!identityDetail.equals(other.identityDetail))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CustomerDetail [customerId=" + customerId + ", customerFullName=" + customerFullName + ", customerAge="
				+ customerAge + ", customerMobileNumber=" + customerMobileNumber + ", customerMailId=" + customerMailId
				+ ", identityDetail=" + identityDetail + "]";
	}

	

}
