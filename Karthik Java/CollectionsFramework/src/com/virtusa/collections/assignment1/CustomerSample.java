package com.virtusa.collections.assignment1;



class Customer{
	private long customerId;
	private String customerName;
	private long mobileNumber;
	private String emailAddress;
	
	
	
	
	

	public long getCustomerId() {
		return customerId;
	}


	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public long getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public Customer(long customerId, String customerName, long mobileNumber, String emailAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.emailAddress = emailAddress;
	}
	
	
	@Override
	public int hashCode() {
		String customer_Id = Long.toString(customerId);

		if(customer_Id.charAt(1) == 1) 
			return 1;
		return 0;

		
		
	}


	
	
	
	
	
}
public class CustomerSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer1 = new Customer(123456789L, "Karthik", 9876543218L, "karthik1997@gmail.com");
		Customer customer2 = new Customer(123456789L, "Bittu", 7676543218L, "bittu@gmail.com");
		
		if(customer1.equals(customer2)) 
			System.out.println("s1 and s2 objects are meaning fully equivalent");
		else
			System.out.println("s1 and s2 objects are not meaning fully equivalent");


	}

}
