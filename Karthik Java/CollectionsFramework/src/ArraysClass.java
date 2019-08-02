import java.util.*;

public class ArraysClass {

	public static void main(String[  ] args) {
										 				
		int numbers[ ] = {2,3,422,4544,1};		
		Arrays.sort(numbers);  //This method is used to sort the array elements
		System.out.println("Array after sorted: "+Arrays.toString(numbers));		
				
		System.out.println("Index of element 2 is: "+Arrays.binarySearch(numbers,2));  //This method is used to search for an element in a array
							
		String names[ ] = {"ravi","rahul","ranjan","kamal"};
		List<String> list = Arrays.asList(names);  // This method is used to convert an array to a list. 
		System.out.println("List contains: "+list);		
	}
}
