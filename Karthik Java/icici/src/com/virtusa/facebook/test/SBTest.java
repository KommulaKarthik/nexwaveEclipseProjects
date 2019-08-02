package com.virtusa.facebook.test;

public class SBTest {

	public SBTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="My name is Karthik";
		StringBuffer sb=new StringBuffer(text);
		sb.append("I am from India");
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer(sb);
		System.out.println(sb2.equals(sb));
		
		String sb11=sb.toString();
		String sb22=sb2.toString();
		
		
		System.out.println(sb11.equals(sb22));
		
		
		String val=sb.toString();
		System.out.println(val);
		
		sb.delete(0, 5);
		System.out.println(sb);
		sb.insert(5, "Hello");
		System.out.println(sb);
		
		
	}

}
