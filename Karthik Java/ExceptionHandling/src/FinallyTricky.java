
public class FinallyTricky {

	public static void main(String[  ] args) {

		System.out.println("Before function call");
		test( );
		System.out.println("After function call");

	}

	static void test( ) {

		try {
			System.out.println("line1");
			System.out.println("line2");
			if(true) 
				return;
			//System.exit(0);
			System.out.println("line3");
			System.out.println("line4");
		}
		finally {
            System.out.println("finally runs");
		}
	}
}
