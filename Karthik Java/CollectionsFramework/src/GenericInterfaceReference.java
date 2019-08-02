import java.util.*;
import somePackage.*;

class TestClass<T> implements Comparator<T> {

	@Override
	public int compare(T o1, T o2) {	
		return 0;
	}	
}

public class GenericInterfaceReference {

	public static void main(String[  ] args) {
		test(new TestClass<Vehicle>( ));		
	}

	static void test(Comparator<? super Car> reference) {
		System.out.println("Test method called");
	}	
}
