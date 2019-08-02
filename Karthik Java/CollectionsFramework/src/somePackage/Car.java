package somePackage;

public class Car extends Vehicle { 
	
	String name;
	
	public Car( ) { } 
	
	public Car(String name) {
		this.name = name;
	}
	
    public String toString( ) {
		
		return name;
	}
	
}
