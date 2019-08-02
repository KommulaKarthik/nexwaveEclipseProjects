package com.virtusa.collections.assignment;

import java.util.Iterator;
import java.util.TreeSet;

public class SortedTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> names = new TreeSet<String>( );
		
		names.add("kamal");
		names.add("abdul");
		names.add("zubair");
		names.add("mahesh reddy");
		names.add("vimal");
		names.add("Rajesh567");
		names.add("rahul");
		names.add("Arun$");
		names.add("@Arun1234");
		names.add("Pavan-Kumar");


		
		Iterator<String> allNames = names.iterator();
		/*while(allNames.hasNext()) {
			String key1 = allNames.next();
			char c[]=key1.toCharArray();
			
			for(int i=0;i<key1.length();i++){
				if(!(Character.isLetter(c[i]))){
					allNames.remove();
					break;
					}
				if(!(Character.isWhitespace(' '))) {
					allNames.remove();
					break;
				}
				
			}
			
		}*/
		
		while(allNames.hasNext()) {
			
			char ch[]=allNames.next().toCharArray();
			
			for(int i=0;i<ch.length;i++){
				if(!(Character.isLetter(ch[i]))){
					allNames.remove();
					break;
				}
				
			}
			
		}
		
			System.out.println(names);
		
		
		


	}

}
