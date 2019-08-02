import java.util.function.Consumer;

/* 

@FunctionalInterface
public interface Consumer<T> {

  void accept(T t);

}

*/

class Test implements Consumer<String> {

	@Override
	public void accept(String t) {
			
		System.out.println(t);
		
	}
	
}

public class ConsumerDemo {

	public static void main(String[  ] args) {
        
		//test((String name) -> { System.out.println(name); });
		test(new Test( ));
	}	
	
	static void test(Consumer<String> consumer) {
		
		consumer.accept("first");
        consumer.accept("second");
        consumer.accept("third");
        
	}
}
