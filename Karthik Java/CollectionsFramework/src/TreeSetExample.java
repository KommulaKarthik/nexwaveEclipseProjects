/* Important points:

1. TreeSet is sorted. 

2. TreeSet uses either comparable or comparator to compare the objects. Objects can be arranged in ascending or 
    descending order only if they are comparable each other.

3. This class does not makes use of hashing algorithm so it is not necessary to override equals and hash code methods.

 */

import java.util.*;

/*class StringOrder implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		return -o1.compareTo(o2);

	}	
}*/

public class TreeSetExample {

	public static void main(String[ ] args) {

		TreeSet<Integer> numbers = new TreeSet<Integer>( );

		numbers.add(4);
		numbers.add(4);
		numbers.add(1);
		numbers.add(3);
		numbers.add(2);

		System.out.println(numbers.toString());

		Iterator<Integer> iterator = numbers.descendingIterator();

		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
