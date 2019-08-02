package com.virtusa.collections.assignment;

public class Customer {
	private long customerId;
	private String customerName;
	private long mobileNumber;
	private String emailAddress;
	

	public Customer(long customerId, String customerName, long mobileNumber, String emailAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.emailAddress = emailAddress;
	}
	


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", mobileNumber="
				+ mobileNumber + ", emailAddress=" + emailAddress + "]";
	}



	public static void main(String[] args) {
		
		Customer customer = new Customer(12345678L,"Karthik",9949158949L,"karthik1997@gmail.com");
		System.out.println(customer);
		
		

	}

}
