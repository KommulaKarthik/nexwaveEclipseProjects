package com.virtusa.collections.assignment;

import java.util.Comparator;
import java.util.TreeSet;

import somePackage.CarDemo;

class SortByModel implements Comparator<CarDemo>{

	@Override
	public int compare(CarDemo o1, CarDemo o2) {
		// TODO Auto-generated method stub
	
			
		return o1.getModel().compareTo(o2.getModel());
	}
	
	

	
	
}
class SortByMileage implements Comparator<CarDemo>{

	@Override
	public int compare(CarDemo o1, CarDemo o2) {
		// TODO Auto-generated method stub
		if(o1.getMileage() > o2.getMileage()) 
			return 1;
		if(o1.getMileage() == o2.getMileage()) 
			return 0;
		if(o1.getMileage() < o2.getMileage())
			return -1;
			
		
		
		return 0;
	}
	
}
public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<CarDemo> cars = new TreeSet<CarDemo>(new SortByMileage());
		cars.add(new CarDemo("Maruti Suzuki",600765.87,26.5f));
		cars.add(new CarDemo("Hyundai",1000765.47,24.5f));
		cars.add(new CarDemo("Toyota",800765.57,18.5f));
		cars.add(new CarDemo("Skoda",1230765.67,22.5f));
		System.out.println(cars);
		
		TreeSet<CarDemo> cars1 = new TreeSet<CarDemo>(new SortByModel());
		cars1.add(new CarDemo("Maruti Suzuki",600765.87,26.5f));
		cars1.add(new CarDemo("Hyundai",1000765.47,24.5f));
		cars1.add(new CarDemo("Toyota",800765.57,18.5f));
		cars1.add(new CarDemo("Skoda",1230765.67,22.5f));
		System.out.println(cars1);

	}

}
