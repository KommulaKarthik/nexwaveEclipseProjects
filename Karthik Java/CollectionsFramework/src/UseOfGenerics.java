import java.util.*;

public class UseOfGenerics {
	
	public static void main(String[ ] args) {
		
		List list = new ArrayList();
		list.add("abc");
		list.add(new Integer(5)); //OK
		 
		for(Object obj : list){
		        String str=(String) obj;  //type casting leading to ClassCastException at runtime
		        System.out.println(str);
		}
		
        System.out.println("***************************************");
        
        List<String> list1 = new ArrayList<String>(); 
        list1.add("abc");        
        //list1.add(new Integer(5)); //compiler error
         
        for(String str : list1){
        	System.out.println(str);  //no type casting needed, avoids ClassCastException
        }                		
	}
}

/* References:
	
http://www.journaldev.com/1663/java-generics-tutorial-example-class-interface-methods-wildcards-and-much-more

*/