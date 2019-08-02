package com.virtusa.bank.tax.model;

public class Address {

	public Address() {
		// TODO Auto-generated constructor stub
	}
	private String address1;
	private String address2;
	private String street;
	private String city;
	private long pincode;
	public Address(String address1, String address2, String street, String city, long pincode) {
		super();
		this.address1 = address1;
		this.address2 = address2;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public String toString(){
		return address1;
		
	}

}
