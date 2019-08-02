package com.virtusa.collections.assignment;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hCount = new HashSet<String>();
		hCount.add("java is platform independent java is object oriented java is machine independent");
		hCount.add("Rahul is my friend.Rahul is very good.Rahul likes playing cricket");
		
		
		Iterator<String> fullString = hCount.iterator();
		
		while(fullString.hasNext()){
			
			String str = fullString.next();
			String a[] = str.split(" "); 
			  
		   
		     
		    for (int i = 0; i < a.length; i++)  
		    { 
		   
		    if (fullString.equals(a[i])) {
		        
		    } 

			
		
		}
		
		

	}

}
}
