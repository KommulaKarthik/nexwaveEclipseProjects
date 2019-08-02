package com.virtusa.collections.assignment2;



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
	
	@Override
	public boolean equals(Object x) {

		Customer c = (Customer)x;

		if(this.customerId == c.customerId) 
			return true;		
		else 
			return false;		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1 = new Customer(12345678L,"Karthik",9949158949L,"karthik1997@gmail.com");
		Customer customer2 = new Customer(12346578L,"Bittu",9549158949L,"bittu@gmail.com");
		
		if(customer1.equals(customer2))
			System.out.println("Two objects are equivalent");
		else
			System.out.println("Two objects are not equivalent");
	}

}
