/* Important points:

1. In TreeMap keys are sorted. 

2. TreeMap uses either comparable or comparator to compare the objects. Objects can be arranged in ascending or 
    descending order only if they are comparable each other.
    
3. This class does not makes use of hashing algorithm so it is not necessary to override equals and hash code methods.
     
*/

import java.util.*;

public class TreeMapExample {
	
	public static void main(String[  ] args) {
		
		TreeMap<String,Long> treeMap = new TreeMap< >( );
		
		treeMap.put("Ravi", 7760122680L);
		treeMap.put("Naresh", 7760122681L);
		treeMap.put("Sekhar", 7760122682L);
		treeMap.put("Pratap", 7760122683L);
		treeMap.put("Veer", 7760122684L);
		treeMap.put("Arvind", 7760122685L);
		
		for(String s : treeMap.keySet()) {
			System.out.println(s+"   "+treeMap.get(s));
		}
		        		
	}
}

