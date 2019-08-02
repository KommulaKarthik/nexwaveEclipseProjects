/* Important points:
 
1. HashMap and LinkedHashMap both are same the only difference is LinkedHashMap is ordered. It will preserve the 
order of keys.

*/ 

import java.util.*;

public class LinkedHashMapExample {

	public static void main(String[ ]  args) {

		LinkedHashMap<String, String> loans = new LinkedHashMap<String, String>();
		loans.put("key1", "value1");
		loans.put("key2", "value2");
		loans.put("key3", "value3");

		Set<String> keySet = loans.keySet();
		Iterator<String> keySetIterator = keySet.iterator();		
			
		while (keySetIterator.hasNext()) {
			
			String key = keySetIterator.next();			
			System.out.println("key: " + key + " value: " + loans.get(key));
			
		}
	}	
}
