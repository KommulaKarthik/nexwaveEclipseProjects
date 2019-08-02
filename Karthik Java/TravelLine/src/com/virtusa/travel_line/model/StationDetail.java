package com.virtusa.travel_line.model;

public class StationDetail {

	public StationDetail() {
		// TODO Auto-generated constructor stub
	}
	
	private int stationId;
	private String stationName;
	public StationDetail(int stationId, String stationName) {
		super();
		this.stationId = stationId;
		this.stationName = stationName;
	}
	public int getStationId() {
		return stationId;
	}
	public void setStationId(int stationId) {
		this.stationId = stationId;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + stationId;
		result = prime * result + ((stationName == null) ? 0 : stationName.hashCode());
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
		StationDetail other = (StationDetail) obj;
		if (stationId != other.stationId)
			return false;
		if (stationName == null) {
			if (other.stationName != null)
				return false;
		} else if (!stationName.equals(other.stationName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "StationDetail [stationId=" + stationId + ", stationName=" + stationName + "]";
	}
	
	

}
