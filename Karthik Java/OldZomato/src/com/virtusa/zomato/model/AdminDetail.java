package com.virtusa.zomato.model;

public class AdminDetail {
	
	private int adminId;
	private String adminName;
	private String adminEmail;
	private String adminPhone;
	public AdminDetail(int adminId, String adminName, String adminEmail, String adminPhone) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminEmail = adminEmail;
		this.adminPhone = adminPhone;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public String getAdminPhone() {
		return adminPhone;
	}
	public void setAdminPhone(String adminPhone) {
		this.adminPhone = adminPhone;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adminEmail == null) ? 0 : adminEmail.hashCode());
		result = prime * result + adminId;
		result = prime * result + ((adminName == null) ? 0 : adminName.hashCode());
		result = prime * result + ((adminPhone == null) ? 0 : adminPhone.hashCode());
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
		AdminDetail other = (AdminDetail) obj;
		if (adminEmail == null) {
			if (other.adminEmail != null)
				return false;
		} else if (!adminEmail.equals(other.adminEmail))
			return false;
		if (adminId != other.adminId)
			return false;
		if (adminName == null) {
			if (other.adminName != null)
				return false;
		} else if (!adminName.equals(other.adminName))
			return false;
		if (adminPhone == null) {
			if (other.adminPhone != null)
				return false;
		} else if (!adminPhone.equals(other.adminPhone))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "AdminDetail [adminId=" + adminId + ", adminName=" + adminName + ", adminEmail=" + adminEmail
				+ ", adminPhone=" + adminPhone + "]";
	}
	
	

}
