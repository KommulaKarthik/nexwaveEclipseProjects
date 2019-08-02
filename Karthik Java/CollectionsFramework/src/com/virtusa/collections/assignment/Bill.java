package com.virtusa.collections.assignment;

import java.util.ArrayList;
import java.util.Comparator;
class SortByBillId implements Comparator<Bill>{

	@Override
	public int compare(Bill b1, Bill b2) {
		if(b1.getBillId() > b2.getBillId()) {
			return 1;
		}
		if(b1.getBillId() == b2.getBillId()) {
			return 0;
		}
		if(b1.getBillId() < b2.getBillId()) {
			return -1;
		}
		return 0;
	}
	
	
}
public class Bill {

	private long billId;
	private double billTotal;
	
	
	public Bill(long billId, double billTotal) {
		super();
		this.billId = billId;
		this.billTotal = billTotal;
	}
	
	


	public long getBillId() {
		return billId;
	}




	public void setBillId(long billId) {
		this.billId = billId;
	}




	public double getBillTotal() {
		return billTotal;
	}




	public void setBillTotal(double billTotal) {
		this.billTotal = billTotal;
	}




	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", billTotal=" + billTotal + "]";
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Bill> bill = new ArrayList<Bill>();
		bill.add(new Bill(12345678L,567.54));
		bill.add(new Bill(98745678L,467.34));
		bill.add(new Bill(38245678L,967.74));
		bill.add(new Bill(63545678L,267.14));
		bill.add(new Bill(24345678L,367.94));
		bill.add(new Bill(52345678L,167.34));
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
