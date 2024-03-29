package com.virtusa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;


@Entity  
@Table(name= "employeetab") 
@SecondaryTable(name="employeedetail")
public class Employee {
	public Employee(){
		
	}

	
	@Id
	@Column(name="employee_id",length=10)
	private int employeeId; 
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="emp_salary")
	private float salary;
	@Column(name="contact_no")
	private long contactNumber;
	@Column(name="emp_gender")
	private char gender;
	@Column(name="emp_status")
	private boolean status;
	@Column(name="emp_address",table="employeedetail")
	private String address;
	@Column(name="emp_zipcode",table="employeedetail")
	private String zipCode;
	@Column(name="emp_bloodgroup",table="employeedetail")
	private String bloodGroup;
	@Column(name="emp_age",table="employeedetail")
	private int age;
	/*@Temporal(TemporalType.DATE)
	private Date dateOfBirth;*/
	public Employee(int employeeId, String firstName, String lastName, float salary, long contactNumber, char gender,
			boolean status, String address, String zipCode, String bloodGroup, int age) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.contactNumber = contactNumber;
		this.gender = gender;
		this.status = status;
		this.address = address;
		this.zipCode = zipCode;
		this.bloodGroup = bloodGroup;
		this.age = age;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
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
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", salary=" + salary + ", contactNumber=" + contactNumber + ", gender=" + gender + ", status="
				+ status + ", address=" + address + ", zipCode=" + zipCode + ", bloodGroup=" + bloodGroup + ", age="
				+ age + "]";
	}
	
	

}
