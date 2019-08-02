
// HashSet and LinkedHashSet both are same the only difference is HashSet is unordered and LinkedHashSet is ordered. 

import java.util.*;

public class LinkedHashSetExample {

	public static void main(String[ ] args) {

		LinkedHashSet<String> balls = new LinkedHashSet<String>( );
		balls.add("green");
		balls.add("yellow");
		balls.add("purple");
		balls.add("pink");
		balls.add("orange");
		balls.add("yellow");
				
		for(String s : balls) {
			System.out.println(s);
		}        				       
	}
}
