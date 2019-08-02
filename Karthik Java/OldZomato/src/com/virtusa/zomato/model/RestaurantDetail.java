package com.virtusa.zomato.model;

public class RestaurantDetail {
	
private int restaurantId;
private String restaurantName;
private String restaurantAddress;
private String restaurantContact;
private String restaurantEmail;
public RestaurantDetail(int restaurantId, String restaurantName, String restaurantAddress, String restaurantContact,
		String restaurantEmail) {
	super();
	this.restaurantId = restaurantId;
	this.restaurantName = restaurantName;
	this.restaurantAddress = restaurantAddress;
	this.restaurantContact = restaurantContact;
	this.restaurantEmail = restaurantEmail;
}
public RestaurantDetail() {
	// TODO Auto-generated constructor stub
}
public int getRestaurantId() {
	return restaurantId;
}
public void setRestaurantId(int restaurantId) {
	this.restaurantId = restaurantId;
}
public String getRestaurantName() {
	return restaurantName;
}
public void setRestaurantName(String restaurantName) {
	this.restaurantName = restaurantName;
}
public String getRestaurantAddress() {
	return restaurantAddress;
}
public void setRestaurantAddress(String restaurantAddress) {
	this.restaurantAddress = restaurantAddress;
}
public String getRestaurantContact() {
	return restaurantContact;
}
public void setRestaurantContact(String restaurantContact) {
	this.restaurantContact = restaurantContact;
}
public String getRestaurantEmail() {
	return restaurantEmail;
}
public void setRestaurantEmail(String restaurantEmail) {
	this.restaurantEmail = restaurantEmail;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((restaurantAddress == null) ? 0 : restaurantAddress.hashCode());
	result = prime * result + ((restaurantContact == null) ? 0 : restaurantContact.hashCode());
	result = prime * result + ((restaurantEmail == null) ? 0 : restaurantEmail.hashCode());
	result = prime * result + restaurantId;
	result = prime * result + ((restaurantName == null) ? 0 : restaurantName.hashCode());
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
	RestaurantDetail other = (RestaurantDetail) obj;
	if (restaurantAddress == null) {
		if (other.restaurantAddress != null)
			return false;
	} else if (!restaurantAddress.equals(other.restaurantAddress))
		return false;
	if (restaurantContact == null) {
		if (other.restaurantContact != null)
			return false;
	} else if (!restaurantContact.equals(other.restaurantContact))
		return false;
	if (restaurantEmail == null) {
		if (other.restaurantEmail != null)
			return false;
	} else if (!restaurantEmail.equals(other.restaurantEmail))
		return false;
	if (restaurantId != other.restaurantId)
		return false;
	if (restaurantName == null) {
		if (other.restaurantName != null)
			return false;
	} else if (!restaurantName.equals(other.restaurantName))
		return false;
	return true;
}
@Override
public String toString() {
	return "RestaurantDetail [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName
			+ ", restaurantAddress=" + restaurantAddress + ", restaurantContact=" + restaurantContact
			+ ", restaurantEmail=" + restaurantEmail + "]";
}


}
