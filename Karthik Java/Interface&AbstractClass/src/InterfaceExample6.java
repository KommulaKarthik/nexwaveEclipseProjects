	
// A reference variable declared as interface type can point to the objects of the class that implements the interface. 

interface Animatable {

	public abstract void animate( );		
}

class Logo implements Animatable {

	@Override
	public void animate() {		
		System.out.println("Logo animated");		
	}		
}

public class InterfaceExample6 {
	
	public static void main(String[  ] args) {

       Animatable animatable = new Logo( );   //Reference variable 'x' is of interface type. 
       animatable.animate();              
	}	
}
