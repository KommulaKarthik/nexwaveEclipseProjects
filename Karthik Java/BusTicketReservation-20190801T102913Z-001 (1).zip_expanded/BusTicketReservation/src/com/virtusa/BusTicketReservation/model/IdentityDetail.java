package com.virtusa.BusTicketReservation.model;

public class IdentityDetail {

	public IdentityDetail() {
		// TODO Auto-generated constructor stub
	}
	private int proofId;
	private String proofName;
	public IdentityDetail(int proofId, String proofName) {
		super();
		this.proofId = proofId;
		this.proofName = proofName;
	}
	public int getProofId() {
		return proofId;
	}
	public void setProofId(int proofId) {
		this.proofId = proofId;
	}
	public String getProofName() {
		return proofName;
	}
	public void setProofName(String proofName) {
		this.proofName = proofName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + proofId;
		result = prime * result + ((proofName == null) ? 0 : proofName.hashCode());
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
		IdentityDetail other = (IdentityDetail) obj;
		if (proofId != other.proofId)
			return false;
		if (proofName == null) {
			if (other.proofName != null)
				return false;
		} else if (!proofName.equals(other.proofName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "IdentityDetail [proofId=" + proofId + ", proofName=" + proofName + "]";
	}
	
	

}
