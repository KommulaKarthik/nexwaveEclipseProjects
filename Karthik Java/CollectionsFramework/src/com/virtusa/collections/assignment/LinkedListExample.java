package com.virtusa.collections.assignment;

import java.util.ArrayList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(6);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(1);
		numbers.add(5);
		numbers.add(8);
		
		ArrayList<Integer> arrayNumbers = new ArrayList<Integer>(numbers);
		Collections.sort(arrayNumbers);
		int i=(arrayNumbers.size()-1);
		System.out.println("Second maximum element from the given ArrayList is " + arrayNumbers.get(i-1));
		
	}

}
