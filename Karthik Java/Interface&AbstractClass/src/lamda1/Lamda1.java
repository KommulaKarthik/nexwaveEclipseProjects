package lamda1;

interface MathOperation {

	int add(int a, int b);	

}

class Test implements MathOperation {
		
	@Override
	public int add(int a, int b) {		
		return a+b;				
	}

}

public class Lamda1 {

	public static void main(String[  ] args) {

		MathOperation x = new Test( );
        	    		
		System.out.println(x.add(12, 3));

	}
}
