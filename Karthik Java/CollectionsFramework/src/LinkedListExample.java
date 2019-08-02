/* Important points:

Difference between ArrayList and LinkedList:
 
1. ArrayList internally uses array to store the elements. LinkedList internally uses doubly linked list to store 
    the elements.

2. ArrayList gives you fast iteration and random access when compared to LinkedList but insertion and deletion is 
    slower. 

3. LinkedList gives you fast insertion and deletion when compared to ArrayList but iteration is slower. LinkedList has poor 
    random access.
    
4. ArrayList implements List and RandomAccess interfaces. LinkedList implements List, Queue and Deque interfaces. 
 
*/
import java.util.*;

public class LinkedListExample {

	public static void main(String[ ] args) {
		
		LinkedList<Integer> numbers = new LinkedList<Integer>( );		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(4);
		numbers.add(5);
		numbers.add(5);
		numbers.add(6);		
		
		//Some methods from Queue interface 
		System.out.println("peek: "+numbers.peek());  //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
		System.out.println("Remove: "+numbers.remove());  //Retrieves and removes the head of this queue.
		System.out.println("poll: "+numbers.poll());    //Retrieves and removes the head of this queue, or returns null if this queue is empty.
        				
        //Some methods from Deque interface  		
		System.out.println("peek last "+numbers.peekLast());   //Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty.					  
		System.out.println("poll last "+numbers.pollLast());  //Retrieves and removes the last element of this deque, or returns null if this deque is empty.
		System.out.println("removeFirstOccurrence: "+numbers.removeFirstOccurrence(5));   //Removes the first occurrence of the specified element from this deque.
		System.out.println("removeLastOccurrence: "+numbers.removeLastOccurrence(4));   //Removes the first occurrence of the specified element from this deque.

		System.out.println(numbers);		
	}
}
