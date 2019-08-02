/* Important points:

1. We can iterate a map either by using keySet method or entrySet method.     

2. Using 'for loop' to iterate a map is not recommended because it throws 'ConcurrentModificationException' if you 
    try to remove any entries when looping.  

3. It is recommended to use iterator to iterate a map because iterator has a remove method and it allows removing 
    the entries when iterating.
    
*/

import java.util.*;

public class IterateMap {

	public static void main(String[ ] args) {

		HashMap<String, String> loans = new HashMap<String, String>();
		loans.put("key1", "value1");
		loans.put("key2", "value2");
		loans.put("key3", "value3");

		//Iterating map using 'keySet' method:

		Set<String> keySet = loans.keySet();

		Iterator<String> keySetIterator = keySet.iterator();		

		System.out.println("------------------------------------------------");

		System.out.println("Iterating map using keySet method(Iterator)");

		while (keySetIterator.hasNext()) {

			String key = keySetIterator.next();			
			System.out.println("key: " + key + " value: " + loans.get(key));
			//keySetIterator.remove(); -  Use iterator remove method to remove entries when iterating.

		}

		//Iterating map using 'entrySet' method:

		Set<Map.Entry<String, String>> entrySet1 = loans.entrySet();

		Iterator<Map.Entry<String, String>> entrySetIterator = entrySet1.iterator();

		System.out.println("------------------------------------------------");

		System.out.println("Iterating map using entrySet method(Iterator)");

		while (entrySetIterator.hasNext()) {

			Map.Entry<String,String> entry = entrySetIterator.next();

			System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());

			//entrySetIterator.remove();  -  Use iterator remove method to remove entries when iterating.
		}
		

		//Given below 2 approaches are not recommend. 

		System.out.println("------------------------------------------------");
		System.out.println("Iterating map using for-each loop");
		for (String key : loans.keySet()) {			
			System.out.println("key: " + key + " value: " + loans.get(key));			
		//	loans.remove(key);  -  This line will throw 'ConcurrentModificationException'. 
		}

		Set<Map.Entry<String, String>> entrySet = loans.entrySet();
		System.out.println("------------------------------------------------");
		System.out.println("Iterating map using entrySet and for-each loop");		
		for (Map.Entry<String,String> entry : entrySet) {
			System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
		}
	}
}
