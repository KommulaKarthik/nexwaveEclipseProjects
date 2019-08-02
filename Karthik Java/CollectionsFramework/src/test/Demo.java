package test;
import java.util.*;

public class Demo {

	public static void main(String[] args) {
		
		String b1 = new String("green");
		String b2 = new String("yellow");
		String b3 = new String("purple");
		String b4 = new String("orange");		
								
		TreeSet<String> set = new TreeSet<String>( );
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);		
		
		Iterator<String> iterator = set.iterator();
		
        while(iterator.hasNext()) {
        	
        	String obj = iterator.next();
        	if(obj.equals("purple")) {
        		iterator.remove();
        	}
        }
        
        for(String obj : set) {
        	System.out.println(obj);
        }
		
	}
}
