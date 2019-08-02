import java.util.*;
import somePackage.*;

public class WildCard2 {

	public static void main(String[  ] args) {
		
		/*ArrayList<Object> objects = new ArrayList<Object>( );
		objects.add(new Object( ));
		objects.add(new Object( ));*/
				
		List<Vehicle> vehicles = new ArrayList<Vehicle>( );
		vehicles.add(new Vehicle("Vehicle 1"));
		vehicles.add(new Vehicle("Vehicle 2"));
		
		List<Car> cars = new ArrayList<Car>( );
		cars.add(new Car("Car 1"));
		cars.add(new Car("Car 2"));
		
		List<Maruthi> maruthis = new ArrayList<Maruthi>( );
		maruthis.add(new Maruthi("Maruthi 1"));
		maruthis.add(new Maruthi("Maruthi 2"));
				
		readAnyVehicleArrayList(vehicles);
		readAnyVehicleArrayList(cars);
		readAnyVehicleArrayList(maruthis);
	//	readAnyVehicleArrayList(objects);  -   This line will not compile because Object class did not inherit Vehicle. 
		
	}
	
	static void readAnyVehicleArrayList(List<? extends Vehicle> arrayList) {
	
		System.out.println(arrayList);
	//  arrayList.add(new Maruthi("Maruthi 2"));  - This line will not compile. 'add' method does not work for <? extends ClassName> wild card. 
	}
	
}

