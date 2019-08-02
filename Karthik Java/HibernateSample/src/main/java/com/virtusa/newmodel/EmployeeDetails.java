package com.virtusa.newmodel;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EmployeeDetails {
	
	public EmployeeDetails(){
		
	}
	
	
	@Column(name="emp_address")
	private String address;
	@Column(name="emp_zipcode")
	private String zipCode;
	@Column(name="emp_bloodgroup")
	private String bloodGroup;
	@Column(name="emp_age")
	private int age;
	public EmployeeDetails(String address, String zipCode, String bloodGroup, int age) {
		super();
		this.address = address;
		this.zipCode = zipCode;
		this.bloodGroup = bloodGroup;
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [address=" + address + ", zipCode=" + zipCode + ", bloodGroup=" + bloodGroup + ", age="
				+ age + "]";
	}
	
	
	

}
