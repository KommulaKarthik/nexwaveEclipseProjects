package com.virtusa.travel_line.model;

public class FeedbackDetail {

	public FeedbackDetail() {
		// TODO Auto-generated constructor stub
	}
	private int feedbackId;
	private CustomerDetail customerDetail;
	private String comments;
	private String feedbackMailId;
	public FeedbackDetail(int feedbackId, CustomerDetail customerDetail, String comments, String feedbackMailId) {
		super();
		this.feedbackId = feedbackId;
		this.customerDetail = customerDetail;
		this.comments = comments;
		this.feedbackMailId = feedbackMailId;
	}
	public int getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}
	public CustomerDetail getCustomerDetail() {
		return customerDetail;
	}
	public void setCustomerDetail(CustomerDetail customerDetail) {
		this.customerDetail = customerDetail;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getFeedbackMailId() {
		return feedbackMailId;
	}
	public void setFeedbackMailId(String feedbackMailId) {
		this.feedbackMailId = feedbackMailId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + ((customerDetail == null) ? 0 : customerDetail.hashCode());
		result = prime * result + feedbackId;
		result = prime * result + ((feedbackMailId == null) ? 0 : feedbackMailId.hashCode());
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
		FeedbackDetail other = (FeedbackDetail) obj;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (customerDetail == null) {
			if (other.customerDetail != null)
				return false;
		} else if (!customerDetail.equals(other.customerDetail))
			return false;
		if (feedbackId != other.feedbackId)
			return false;
		if (feedbackMailId == null) {
			if (other.feedbackMailId != null)
				return false;
		} else if (!feedbackMailId.equals(other.feedbackMailId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "FeedbackDetail [feedbackId=" + feedbackId + ", customerDetail=" + customerDetail + ", comments="
				+ comments + ", feedbackMailId=" + feedbackMailId + "]";
	}
	
	
	
	
	

}
