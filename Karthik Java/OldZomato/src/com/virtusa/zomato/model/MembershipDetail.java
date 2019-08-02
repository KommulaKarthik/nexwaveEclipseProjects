package com.virtusa.zomato.model;

import java.util.Date;

public class MembershipDetail {
	
	private int membershipId;
	private Date membershipStartDate;
	private Date membershipEndDate;
	private String membershipType;
	private CustomerDetail customerDetail;
	public MembershipDetail(int membershipId, Date membershipStartDate, Date membershipEndDate, String membershipType,
			CustomerDetail customerDetail) {
		super();
		this.membershipId = membershipId;
		this.membershipStartDate = membershipStartDate;
		this.membershipEndDate = membershipEndDate;
		this.membershipType = membershipType;
		this.customerDetail = customerDetail;
	}
	public int getMembershipId() {
		return membershipId;
	}
	public void setMembershipId(int membershipId) {
		this.membershipId = membershipId;
	}
	public Date getMembershipStartDate() {
		return membershipStartDate;
	}
	public void setMembershipStartDate(Date membershipStartDate) {
		this.membershipStartDate = membershipStartDate;
	}
	public Date getMembershipEndDate() {
		return membershipEndDate;
	}
	public void setMembershipEndDate(Date membershipEndDate) {
		this.membershipEndDate = membershipEndDate;
	}
	public String getMembershipType() {
		return membershipType;
	}
	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;
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
		result = prime * result + ((membershipEndDate == null) ? 0 : membershipEndDate.hashCode());
		result = prime * result + membershipId;
		result = prime * result + ((membershipStartDate == null) ? 0 : membershipStartDate.hashCode());
		result = prime * result + ((membershipType == null) ? 0 : membershipType.hashCode());
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
		MembershipDetail other = (MembershipDetail) obj;
		if (customerDetail == null) {
			if (other.customerDetail != null)
				return false;
		} else if (!customerDetail.equals(other.customerDetail))
			return false;
		if (membershipEndDate == null) {
			if (other.membershipEndDate != null)
				return false;
		} else if (!membershipEndDate.equals(other.membershipEndDate))
			return false;
		if (membershipId != other.membershipId)
			return false;
		if (membershipStartDate == null) {
			if (other.membershipStartDate != null)
				return false;
		} else if (!membershipStartDate.equals(other.membershipStartDate))
			return false;
		if (membershipType == null) {
			if (other.membershipType != null)
				return false;
		} else if (!membershipType.equals(other.membershipType))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MembershipDetail [membershipId=" + membershipId + ", membershipStartDate=" + membershipStartDate
				+ ", membershipEndDate=" + membershipEndDate + ", membershipType=" + membershipType
				+ ", customerDetail=" + customerDetail + "]";
	}
	
	
	
	
	

}
