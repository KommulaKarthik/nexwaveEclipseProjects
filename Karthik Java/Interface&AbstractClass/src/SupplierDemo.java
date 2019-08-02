import java.util.function.Supplier;

/*

@FunctionalInterface
public interface Supplier<T> {
  T get();
}

 */

class Test2 implements Supplier<String> {

	@Override
	public String get() {
		int x = (int) (Math.random() * 6);
        String names[  ] = {"tiger", "rex","lilly", "romeo", "sam","teddy"};
        return names[x];
     }
	
}

public class SupplierDemo {

	public static void main(String[  ] args) {
        
		makeRandomName((  ) -> { int x = (int) (Math.random() * 6);
		                                            String names[  ] = {"tiger", "rex","lilly", "romeo", "sam","teddy"};
		                                            return names[x];
		                                          });
		
		//makeRandomName(new Test2( ));
	}	
	
	static void makeRandomName(Supplier<String> supplier) {
		
		System.out.println(supplier.get());
        
	}
	
}
