package com.virtusa.travel_line.model;

public class BusTypeDetail {

	public BusTypeDetail() {
		// TODO Auto-generated constructor stub
	}
	private int busTypeId;
	private int busTypeName;
	public BusTypeDetail(int busTypeId, int busTypeName) {
		super();
		this.busTypeId = busTypeId;
		this.busTypeName = busTypeName;
	}
	public int getBusTypeId() {
		return busTypeId;
	}
	public void setBusTypeId(int busTypeId) {
		this.busTypeId = busTypeId;
	}
	public int getBusTypeName() {
		return busTypeName;
	}
	public void setBusTypeName(int busTypeName) {
		this.busTypeName = busTypeName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + busTypeId;
		result = prime * result + busTypeName;
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
		BusTypeDetail other = (BusTypeDetail) obj;
		if (busTypeId != other.busTypeId)
			return false;
		if (busTypeName != other.busTypeName)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BusTypeDetail [busTypeId=" + busTypeId + ", busTypeName=" + busTypeName + "]";
	}
	
	

}
