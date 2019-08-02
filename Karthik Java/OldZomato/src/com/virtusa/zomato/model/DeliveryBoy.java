package com.virtusa.zomato.model;

public class DeliveryBoy {
	
	private int deliveryId;
	private String deliveryName;
	private String deliveryAddress;
	private String deliveryContact;
	private String deliveryEmail;
	public DeliveryBoy(int deliveryId, String deliveryName, String deliveryAddress, String deliveryContact,
			String deliveryEmail) {
		super();
		this.deliveryId = deliveryId;
		this.deliveryName = deliveryName;
		this.deliveryAddress = deliveryAddress;
		this.deliveryContact = deliveryContact;
		this.deliveryEmail = deliveryEmail;
	}
	public int getDeliveryId() {
		return deliveryId;
	}
	public void setDeliveryId(int deliveryId) {
		this.deliveryId = deliveryId;
	}
	public String getDeliveryName() {
		return deliveryName;
	}
	public void setDeliveryName(String deliveryName) {
		this.deliveryName = deliveryName;
	}
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public String getDeliveryContact() {
		return deliveryContact;
	}
	public void setDeliveryContact(String deliveryContact) {
		this.deliveryContact = deliveryContact;
	}
	public String getDeliveryEmail() {
		return deliveryEmail;
	}
	public void setDeliveryEmail(String deliveryEmail) {
		this.deliveryEmail = deliveryEmail;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deliveryAddress == null) ? 0 : deliveryAddress.hashCode());
		result = prime * result + ((deliveryContact == null) ? 0 : deliveryContact.hashCode());
		result = prime * result + ((deliveryEmail == null) ? 0 : deliveryEmail.hashCode());
		result = prime * result + deliveryId;
		result = prime * result + ((deliveryName == null) ? 0 : deliveryName.hashCode());
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
		DeliveryBoy other = (DeliveryBoy) obj;
		if (deliveryAddress == null) {
			if (other.deliveryAddress != null)
				return false;
		} else if (!deliveryAddress.equals(other.deliveryAddress))
			return false;
		if (deliveryContact == null) {
			if (other.deliveryContact != null)
				return false;
		} else if (!deliveryContact.equals(other.deliveryContact))
			return false;
		if (deliveryEmail == null) {
			if (other.deliveryEmail != null)
				return false;
		} else if (!deliveryEmail.equals(other.deliveryEmail))
			return false;
		if (deliveryId != other.deliveryId)
			return false;
		if (deliveryName == null) {
			if (other.deliveryName != null)
				return false;
		} else if (!deliveryName.equals(other.deliveryName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Delivery [deliveryId=" + deliveryId + ", deliveryName=" + deliveryName + ", deliveryAddress="
				+ deliveryAddress + ", deliveryContact=" + deliveryContact + ", deliveryEmail=" + deliveryEmail + "]";
	}
	
	

}
