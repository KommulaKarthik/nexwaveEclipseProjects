
//One interface can extend(inherit) any number of interfaces directly. 

interface I5 {
  
  public static final int X = 10;
  
  public abstract void printX( );
		  	
}

interface I6 {
	
	public static final int Y = 20;
	
	public abstract void printY( );
}

interface I7 {

	public static final int Z = 30;
	
	public abstract void printZ( );
	
}

interface I8 extends I5,I6,I7 {
	
	public static final int M = 100;
	
	public abstract void printM();
	
}

class C3 implements I8 {
	
	public void printX() {
 		System.out.println(X);		
	}

	
	public void printY() {
		System.out.println(Y);		
	}

	
	public void printZ() {
		System.out.println(Z);		
	}
	
	public void printM() {
		System.out.println(M);		
	}		
}

public class InterfaceExample3 {
	
	public static void main(String[] args) {
	
        C3 x = new C3();
        x.printX();
        x.printY();
        x.printZ();
        x.printM();
		
	}
}
