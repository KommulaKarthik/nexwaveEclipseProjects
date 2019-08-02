import java.util.ArrayList;
import somePackage.*;

class Alto extends Maruthi {   
	
	private String name;
			
	public Alto(String name) {
		this.name = name;
	}
	
	public String toString( ) {
		
		return name;
	}			
}

public class WildCard3 {

	public static void main(String[  ] args) {

		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>( );
		vehicles.add(new Vehicle("Vehicle 1"));
		vehicles.add(new Vehicle("Vehicle 2"));

		ArrayList<Car> cars = new ArrayList<Car>( );
		cars.add(new Car("Car 1"));
		cars.add(new Car("Car 2"));

		ArrayList<Maruthi> maruthis = new ArrayList<Maruthi>( );
		maruthis.add(new Maruthi("Maruthi 1"));
		maruthis.add(new Maruthi("Maruthi 2"));

		ArrayList<Alto> objects = new ArrayList<Alto>( );
		objects.add(new Alto("Alto1"));
		objects.add(new Alto("Alto2"));

		takeAnyMaruthiParentArrayList(vehicles);
		takeAnyMaruthiParentArrayList(cars);
		takeAnyMaruthiParentArrayList(maruthis);
	//	takeAnyMaruthiParentArrayList(objects);  -   This line of code will not compile because Alto is not parent of Maruthi. 

	}

	static void takeAnyMaruthiParentArrayList(ArrayList<? super Maruthi> arrayList) {

		arrayList.add(new Alto("new alto"));     //add method is allowed in <? super ClassName> wild card.
		System.out.println(arrayList);	       
	}
}
