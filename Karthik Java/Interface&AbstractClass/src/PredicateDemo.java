import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[ ] args) {

		isPalindrome((String s) -> {  StringBuffer sb = new StringBuffer(s);
                                            	    sb.reverse();		                                                             
		                                            String reverse = sb.toString();
		                                            return s.equals(reverse);		
		                                         });

	}

	static void isPalindrome(Predicate<String> p) {

		boolean result = p.test("mam");
		System.out.println(result);

	}
}
