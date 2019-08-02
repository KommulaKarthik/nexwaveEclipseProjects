package com.virtusa.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		//list.add('M');
		list.add("Karthik");
		//list.add(1234);
		//list.add(true);
		list.add("India");
		
		System.out.println(list);
		
		System.out.println(list.get(0));
		
		System.out.println(list.isEmpty());
		
		list.add(2, "second");
		System.out.println(list);
		List subList = list.subList(0, 3);
		System.out.println(subList);
		
		list.addAll(subList);
		
		System.out.println("Combine Data : " +list);
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			String newEle = iterator.next();
			//System.out.println(newEle);
			if(newEle.startsWith("i")){
				iterator.remove();
			}
			
		}
		System.out.println(list);
		
		
		
		

	}

}
