
//A class can implement any number of interfaces directly.  

interface I2 {

	public static final int X = 10;

	public abstract void printX( );

}

interface I3 {

	public static final int Y = 20;

	public abstract void printY( );

}

interface I4 {

	public static final int Z = 30;

	public abstract void printY( );

}

class C2 implements I2,I3,I4 {

	public void printX( ) {

		System.out.println(X);
	}

	public void printY( ) {

		System.out.println(Y);
	}
	
	public void printZ( ) {

		System.out.println(Z);
	}
}

public class InterfaceExample2 {

	public static void main(String[  ] args) {

		C2 x = new C2( );
		x.printX();
		x.printY();
		x.printZ();

	}
}
