import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[ ] args) {

		test((String s) -> { return s.length(); });		
					         						             	
	}
	
	static void test(Function<String,Integer> f) {

		Integer length = f.apply("123");
		
		System.out.println(length);				
		
	}
}
