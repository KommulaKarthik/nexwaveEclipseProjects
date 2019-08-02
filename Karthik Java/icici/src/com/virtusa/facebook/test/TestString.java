package com.virtusa.facebook.test;

public class TestString {

	public TestString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char arr[]={'b','i','t','t','u'};
		String name1;
		String name11;
		
		
		String phone="12345657895";
		boolean number=phone.matches("[0-9]{10,12}");
		System.out.println(number);
		
		 name11="Welcome to Indiaw";//String constant pool
		 boolean nameCheck=name11.matches("[a-z]{10,}");
		 System.out.println(nameCheck);
		 
		 String phoneNumber="1234161895";
		 String newNumber=phoneNumber.replace("1", "2");
		 System.out.println(newNumber);
		 
		 String data2="123rewy";
		 String data3=data2.replaceAll("[a-z]", " ");
		 System.out.println(data3);
		 String data4=data2.replaceAll("[0-9]", " ");
		 System.out.println(data4);
		 char[] ch=data2.toCharArray();
		 for(int i=0;i<ch.length;i++){
			 System.out.println(ch[i]);
		 }
		 
		 
		
		
		String text = new String("welcome to India");
		byte[] brr=text.getBytes();
		for(int i=0;i<brr.length;i++){
			System.out.println(brr[i]);
		}
		
		
		
		int status=text.compareTo(name11);
		System.out.println("Status =" + status);
		
		int status1=text.compareToIgnoreCase(name11);
		System.out.println(status1);
		
		boolean contains=name11.contains("India");
		System.out.println("India in name is " +contains);
		
		
		boolean endsWith=name11.endsWith("India");
		System.out.println("Name ends with"+endsWith);
		
		boolean startsWith=name11.startsWith("Wel");
		System.out.println("Name starts with"+startsWith);
		
		
		String arr2=String.copyValueOf(arr);
		System.out.println();
		
		String data=name11.concat(text);
		System.out.println("Name="+name11);
		System.out.println("Text="+text);
		System.out.println(data);
		
		
		boolean same=name11.equals(text);
		System.out.println("Same ?" +same);
		same=name11.equalsIgnoreCase(text);
		System.out.println("Same ignore case ?" +same);
		
		String upperData=name11.toUpperCase();
		char ch1=name11.charAt(1);
		System.out.println(ch1);
		
		
		

	}

}
