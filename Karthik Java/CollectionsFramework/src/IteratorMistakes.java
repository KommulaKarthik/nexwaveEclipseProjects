import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMistakes {

	public static void main(String[  ] args)  {

		ArrayList<Integer> numbers = new ArrayList<Integer>( );

		numbers.add(new Integer(11));
		numbers.add(new Integer(2));
		numbers.add(new Integer(3));
		numbers.add(new Integer(30));

		/*		for(int i=0;i<=numbers.size()-1;i++) {

			Integer x = numbers.get(i);

			//int num = x.intValue();

			if(x<=5) {
				numbers.remove(x);				
			}
		}*/

		/*		for(Integer x : numbers) {			
			if(x<=5) {
				numbers.remove(x);
				//numbers.add(33);
			}
		}

		System.out.println(numbers);*/

		Iterator<Integer> iterator = numbers.iterator();		

		while(iterator.hasNext()) {
			Integer x = iterator.next();
			if(x<=5) {				
				iterator.remove();				
				//numbers.remove(x);
				//numbers.add(1);				
			}
		} 

		System.out.println(numbers);  				
	}
}
