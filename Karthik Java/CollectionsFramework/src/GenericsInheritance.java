import somePackage.*;

class GenericClass<T> {

	private T T;

	public T get(){
		return this.T;
	}

	public void set(T t1){
		this.T=t1;
	}        
}

class ChildGenericClass<T> extends GenericClass<T> {


}

public class GenericsInheritance {

	public static void main(String args[  ]){
		test(new ChildGenericClass<Maruthi>( ));
	}

	static void test(GenericClass<? extends Vehicle> reference) {
         System.out.println("Test method called");
	}
}
