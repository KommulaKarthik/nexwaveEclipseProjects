package com.virtusa.collections.assignment;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ArrayListDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<Integer>( );		

		//numbers.ensureCapacity(50);  

		numbers.add(new Integer(1));  
		numbers.add(new Integer(2)); 
		numbers.add(new Integer(1));    		
		numbers.add(new Integer(8));
		numbers.add(new Integer(4));
		numbers.add(new Integer(7));
		numbers.add(new Integer(6));   
		numbers.add(new Integer(7));
		
		System.out.println(numbers);
		
		LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(numbers);
		ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(hashSet);
		System.out.println(listWithoutDuplicates);

	}

}
