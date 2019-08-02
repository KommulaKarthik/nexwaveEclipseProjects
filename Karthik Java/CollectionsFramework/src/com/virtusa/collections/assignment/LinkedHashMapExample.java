package com.virtusa.collections.assignment;

import java.util.ArrayList;
import java.util.LinkedHashMap;


public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Course,ArrayList<Book>> library = new LinkedHashMap<Course,ArrayList<Book>>( );
		Course c1 = new Course("C");
		Course c2 = new Course("Java");
		Course c3 = new Course("Python");
		Course c4 = new Course("DataStructures");
		Course c5 = new Course("C++");
		
		ArrayList<Book> book = new ArrayList<Book>();
		book.add(new Book("The C Programming Language","Brian W. Kernighan and Dennis M. Ritchie",123456789L));
		book.add(new Book(" C The Complete Reference","Herbert Schildt",123456789L));
		book.add(new Book("Programming in ANSI Ce"," E Balagurusamy",852456789L));
		book.add(new Book("Let Us C","Yashavant Kanetkar",613456789L));
		book.add(new Book("Head First C","David Griffiths",396456789L));
		
		
		
		

	}

}
