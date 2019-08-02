
//If 2 interfaces has the same method only 1 implementation is enough. 

interface I9 {
	
	int x = 100;
	
    abstract void print();
}

interface I10 {
	
	int x = 200;
		 
	abstract void print();
}

class C4 implements I9,I10 {
	
	@Override
	public void print() {
	  
		System.out.println(I9.x);		

	}				
}

public class InterfaceExample4 {
	
	public static void main(String[ ] args) {
	
       C4 x = new C4( );
       x.print();
		
	}	
}
