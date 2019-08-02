/* Important points:

//This will work: 
Parent array[ ] = new Child[20];

   Animal  animals[  ] = new Dog[10];
   Animal  animals[  ] = new Horse[10];
   Animal  animals[  ] = new Cat[10];   
   public void anyAnimals(Animal  animals[  ])
   {

   }

//This will not work: 
List<Parent> myList = new ArrayList<Child>();


1. There is no such thing called <? implements Vehicle>. The extends keyword is used for both class and interface. 

2. Wild cards should NEVER be used for object creation they can be used only in references. 
      
*/

import java.util.ArrayList;
import java.util.List;

import somePackage.*;

public class WildCard1 {

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
				
		readAnyArrayList(vehicles);
		readAnyArrayList(cars);
		readAnyArrayList(maruthis);		
	}
	
	static void readAnyArrayList(ArrayList<?> arrayList) {
	
		System.out.println(arrayList);
	// arrayList.add(new Maruthi("Maruthi 2")); // - This line will not compile. 'add' method does not work for <?> wild card. 
	}	
}

/*

Identify which are correct :

1) ArrayList<?> list = new ArrayList<Dog>();
2) ArrayList<? extends Animal> aList = new ArrayList<Dog>();
3) ArrayList<?> foo = new ArrayList<? extends Animal>();
4) ArrayList<? extends Dog> cList = new ArrayList<Integer>();
5) ArrayList<? super Dog> bList = new ArrayList<Animal>();
6) ArrayList<? super Animal> dList = new ArrayList<Dog>();
7) ArrayList<? implements Animatable> alist = new ArrayList<Logo>( );

Correct answer : 1,2 and 5.
*/
