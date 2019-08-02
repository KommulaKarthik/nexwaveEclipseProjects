/* Important points: 

1. ArrayList is ordered by index position.

2. ArrayList takes duplicates.

3. Difference between ArrayList and vector:
    i) Methods in the Vector are synchronized and it is thread safe where as ArrayList is not thread safe.   
    ii) ArrayList has good performance when compared to vector. 
    iii) ArrayList grows its size by half where as vector grows its size by double.

 */
import java.util.*;

public class ArrayListExample {

	public static void main(String[  ] args) {
						
		ArrayList<Integer> numbers = new ArrayList<Integer>( );		

		numbers.ensureCapacity(50);   //Set the initial capacity to 50. Override the default capacity 10. 

		numbers.add(new Integer(1));  //adds the object to the end of collection.
		numbers.add(2);  //auto boxing
		numbers.add(new Integer(1));  //list takes duplicates.  		
		numbers.add(new Integer(8));
		numbers.add(new Integer(4));
		numbers.add(new Integer(5));
		numbers.add(3,new Integer(6));  //add the object at the index 3. Index starts from zero. 
		numbers.add(new Integer(7));	

		System.out.println("Objects in the array list: "+numbers);

		System.out.println("Count of elements in the the arraylist: "+numbers.size());

		System.out.println("Get the object present at the index zero: "+numbers.get(0));

		System.out.println("Does arraylist contain object 6 ? "+numbers.contains(new Integer(6)));
						
		System.out.println("Index of object 6 is "+numbers.indexOf(new Integer(6)));

		System.out.println("Last index of object 1 is "+numbers.lastIndexOf(new Integer(1)));

		numbers.remove(4);  //4 is the index not the object(number).

		System.out.println("test:"+numbers.remove(new Integer(7))); //Remove the object.                  				

		System.out.println(numbers);

		//Iterator can iterate only in forward direction where as ListIterator can iterate both in forward and backward direction.  
		ListIterator<Integer> listIterator = numbers.listIterator();		
																	
		System.out.println(listIterator.next());   // Returns the next element in the list and advances the cursor position.
		System.out.println(listIterator.next());
		System.out.println(listIterator.previous()); //Returns the previous element in the list and moves the cursor position backwards.
		System.out.println(listIterator.previous());		
													
		numbers.clear();  //removes all the objects in the collection.				
	}
}

/*
Difference between Enumeration and the Iterator:
Enumeration is read only it does not have remove method where as iterator has a remove method.   
*/
