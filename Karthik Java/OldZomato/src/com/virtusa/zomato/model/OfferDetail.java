package com.virtusa.zomato.model;

import java.util.Date;

public class OfferDetail {
	
	private int offerId;
	private String offerName;
	private int offerDiscount;
	private Date offerStartDate;
	private Date offerEndDate;
	public OfferDetail(int offerId, String offerName, int offerDiscount, Date offerStartDate, Date offerEndDate) {
		super();
		this.offerId = offerId;
		this.offerName = offerName;
		this.offerDiscount = offerDiscount;
		this.offerStartDate = offerStartDate;
		this.offerEndDate = offerEndDate;
	}
	public OfferDetail() {
		// TODO Auto-generated constructor stub
	}
	public int getOfferId() {
		return offerId;
	}
	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}
	public String getOfferName() {
		return offerName;
	}
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}
	public int getOfferDiscount() {
		return offerDiscount;
	}
	public void setOfferDiscount(int offerDiscount) {
		this.offerDiscount = offerDiscount;
	}
	public Date getOfferStartDate() {
		return offerStartDate;
	}
	public void setOfferStartDate(Date offerStartDate) {
		this.offerStartDate = offerStartDate;
	}
	public Date getOfferEndDate() {
		return offerEndDate;
	}
	public void setOfferEndDate(Date offerEndDate) {
		this.offerEndDate = offerEndDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + offerDiscount;
		result = prime * result + ((offerEndDate == null) ? 0 : offerEndDate.hashCode());
		result = prime * result + offerId;
		result = prime * result + ((offerName == null) ? 0 : offerName.hashCode());
		result = prime * result + ((offerStartDate == null) ? 0 : offerStartDate.hashCode());
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
		OfferDetail other = (OfferDetail) obj;
		if (offerDiscount != other.offerDiscount)
			return false;
		if (offerEndDate == null) {
			if (other.offerEndDate != null)
				return false;
		} else if (!offerEndDate.equals(other.offerEndDate))
			return false;
		if (offerId != other.offerId)
			return false;
		if (offerName == null) {
			if (other.offerName != null)
				return false;
		} else if (!offerName.equals(other.offerName))
			return false;
		if (offerStartDate == null) {
			if (other.offerStartDate != null)
				return false;
		} else if (!offerStartDate.equals(other.offerStartDate))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "OfferDetail [offerId=" + offerId + ", offerName=" + offerName + ", offerDiscount=" + offerDiscount
				+ ", offerStartDate=" + offerStartDate + ", offerEndDate=" + offerEndDate + "]";
	}
	
	

}
