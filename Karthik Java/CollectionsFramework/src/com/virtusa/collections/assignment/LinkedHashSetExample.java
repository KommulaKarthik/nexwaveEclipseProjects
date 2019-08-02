package com.virtusa.collections.assignment;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> country = new LinkedHashSet<String>( );
		country.add("japan");
		country.add("russia");
		country.add("iran");
		country.add("russia");
		country.add("bangladesh");
		country.add("russia");
		country.add("iran");
		country.add("srilanka");
		country.add("india");
		country.add("srilanka");
		country.add("india");
		
		for(String c : country) {
			System.out.println(c);
		} 

	}

}
