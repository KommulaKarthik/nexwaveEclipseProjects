/* Important points:

1. Collection is an interface present at the top of the collection hierarchy where as collections is a utility(helper) class 
    that contains methods for sorting, searching, reversing etc.. the collection.  

2. Binary search algorithm works only if the data is sorted.

3. If sorting is done using comparable searching also should be done using same comparable. If sorting is done using 
    comparator searching also should be done using same comparator. What ever the comparable or comparator 
    used for sorting the SAME comparable or comparator must be used for searching as well.
    
4. Sort method works only for list types because TreeSet class should be used for sorting set.  

5. Binary search method works only for list types because set do not have indexes.

*/

import java.util.*;
import somePackage.Student;

class SortByAge implements Comparator<Student> {

	public int compare(Student s1, Student s2) {

		if(s1.getAge() > s2.getAge()) {
			return 1;
		}
		if(s1.getAge() == s2.getAge()) {
			return 0;
		}
		if(s1.getAge() < s2.getAge()) {
			return -1;
		}
		return 0;		
	}		
}

public class CollectionsClass {

	public static void main(String[  ] args) {
						 
		//Sorting using comparable
		ArrayList<Integer> numbers = new ArrayList<Integer>( );
		numbers.add(8);
		numbers.add(5);		
		numbers.add(2);
		numbers.add(4);
		numbers.add(6);
		numbers.add(6);
		numbers.add(6);

		System.out.println("Before sorting:  "+ numbers);

		Collections.sort(numbers);

		System.out.println("After sorting:  "+ numbers);
		
		//Sorting using comparator 
		ArrayList<Student> students = new ArrayList<Student>( );
		students.add(new Student(3,"Ravi","Bangalore",18));
		students.add(new Student(5,"Rahul","Bangalore",17));
		students.add(new Student(1,"Prem","Bangalore",16));
		students.add(new Student(6,"Kumar","Bangalore",21));
		students.add(new Student(2,"Arvind","Bangalore",11));
		students.add(new Student(4,"Veer","Bangalore",10));

		System.out.println("Before sorting:  "+students);

		Collections.sort(students, new SortByAge( ));

		System.out.println("After sorting:  "+students);
		
		//Binary search using comparable. 
		System.out.println("Index of element 6 is:  "+Collections.binarySearch(numbers,6));		

		//Binary search using comparator.		 		
		System.out.println("Index of student 'arvind' is:  "+Collections.binarySearch(students,new Student(2,"Arvind","Bangalore",11),new SortByAge( )));
        		
		//Reversing the collection. 
		Collections.reverse(numbers);
		System.out.println("After reversing numbers list  "+numbers);
				 		
	    //For the given comparator this method will return reverse comparator. No need to write again separate reverse comparator class.    
		Comparator<Student> reverseComparator = Collections.reverseOrder(new SortByAge( ));
		System.out.println(reverseComparator);
		System.out.println("Object 6 is appearing "+Collections.frequency(numbers, 6)+" times in collection");
		
		ArrayList<Integer> num = new ArrayList<Integer>( );
		num.add(1);
		num.add(2);
		num.add(3);
		
		List<Integer> safenum = Collections.synchronizedList(num);
		System.out.println(safenum);
	}
}
