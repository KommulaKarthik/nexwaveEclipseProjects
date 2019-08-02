
enum PropertyTypes { BUILDING, MOBILE, VEHICLE }

interface PropertyInsurance {

	double getPropertyCost( );
	int getPropertyAge( );
	PropertyTypes getPropertyType( );
	double getInsurancePolicyAmount( );

}

class Building {  }

class House extends Building implements PropertyInsurance {

	private double propertyCost;
	private int propertyAge;
	private PropertyTypes propertyType;
	private double insurancePolicyAmount;
	
	public House(double propertyCost, int propertyAge, PropertyTypes propertyType, double insurancePolicyAmount) {		
		this.propertyCost = propertyCost;
		this.propertyAge = propertyAge;
		this.propertyType = propertyType;
		this.insurancePolicyAmount = insurancePolicyAmount;
	}

	@Override
	public double getPropertyCost() {

		return propertyCost;
	}

	@Override
	public int getPropertyAge() {

		return propertyAge;
	}

	@Override
	public PropertyTypes getPropertyType() {

		return propertyType;
	}

	@Override
	public double getInsurancePolicyAmount() {

		return insurancePolicyAmount;
	}

}

class Shop extends Building implements PropertyInsurance {

	private double propertyCost;
	private int propertyAge;
	private PropertyTypes propertyType;
	private double insurancePolicyAmount;

	public Shop(double propertyCost, int propertyAge, PropertyTypes propertyType, double insurancePolicyAmount) {		
		this.propertyCost = propertyCost;
		this.propertyAge = propertyAge;
		this.propertyType = propertyType;
		this.insurancePolicyAmount = insurancePolicyAmount;
	}

	@Override
	public double getPropertyCost() {

		return propertyCost;
	}

	@Override
	public int getPropertyAge() {

		return propertyAge;
	}

	@Override
	public PropertyTypes getPropertyType() {

		return propertyType;
	}

	@Override
	public double getInsurancePolicyAmount() {

		return insurancePolicyAmount;
	}

}

class Vehicle {  }

class Car extends Vehicle implements PropertyInsurance {

	private double propertyCost;
	private int propertyAge;
	private PropertyTypes propertyType;
	private double insurancePolicyAmount;

	public Car(double propertyCost, int propertyAge, PropertyTypes propertyType, double insurancePolicyAmount) {		
		this.propertyCost = propertyCost;
		this.propertyAge = propertyAge;
		this.propertyType = propertyType;
		this.insurancePolicyAmount = insurancePolicyAmount;
	}

	@Override
	public double getPropertyCost() {

		return propertyCost;
	}

	@Override
	public int getPropertyAge() {

		return propertyAge;
	}

	@Override
	public PropertyTypes getPropertyType() {

		return propertyType;
	}

	@Override
	public double getInsurancePolicyAmount() {

		return insurancePolicyAmount;
	}

}

class Phone {  }

class Mobile extends Phone implements PropertyInsurance {

	private double propertyCost;
	private int propertyAge;
	private PropertyTypes propertyType;
	private double insurancePolicyAmount;

	public Mobile(double propertyCost, int propertyAge, PropertyTypes propertyType, double insurancePolicyAmount) {		
		this.propertyCost = propertyCost;
		this.propertyAge = propertyAge;
		this.propertyType = propertyType;
		this.insurancePolicyAmount = insurancePolicyAmount;
	}
	
	@Override
	public double getPropertyCost() {

		return propertyCost;
	}

	@Override
	public int getPropertyAge() {

		return propertyAge;
	}

	@Override
	public PropertyTypes getPropertyType() {

		return propertyType;
	}

	@Override
	public double getInsurancePolicyAmount() {

		return insurancePolicyAmount;
	}
}

class InsuranceUtility {

	static double getInsuranceCoverage(PropertyInsurance insurance) {

		PropertyTypes type = insurance.getPropertyType();				
				
		if(type.equals(PropertyTypes.MOBILE)) { 

			double policyAmount = insurance.getInsurancePolicyAmount();
			if(policyAmount == 200) 
				return insurance.getPropertyCost()/2;
			if(policyAmount == 500) 
				return insurance.getPropertyCost();

		}

		if(type.equals(PropertyTypes.BUILDING)) {

			double propertyCost = insurance.getPropertyCost();
			int propertyAge = insurance.getPropertyAge();

			if(propertyAge < 10) 
				return propertyCost;			
			else if(propertyAge >=10 && propertyAge <=50) 
				return (propertyCost*75)/100;
			else
				return propertyCost/2;

		}
		
		if(type.equals(PropertyTypes.VEHICLE)) {
			
			double propertyCost = insurance.getPropertyCost();
			int propertyAge = insurance.getPropertyAge();

			if(propertyAge < 5) 
				return propertyCost;			
			else if(propertyAge >=5 && propertyAge <=10) 
				return propertyCost/2;
			else
				return (propertyCost*25)/100;
			
		}
		return 0;
	}

}


public class EnumUse {

	public static void main(String[  ] args) {

        House house = new House(25_00000,15, PropertyTypes.BUILDING, 20_000);
        Mobile mobile = new Mobile(10_000,2, PropertyTypes.MOBILE, 200);
        Car car = new Car(5000_00,5, PropertyTypes.VEHICLE, 10_000);
        
        System.out.println("House insurance coverage: "+InsuranceUtility.getInsuranceCoverage(house));
        System.out.println("Mobile insurance coverage: "+InsuranceUtility.getInsuranceCoverage(mobile));
        System.out.println("Car insurance coverage: "+InsuranceUtility.getInsuranceCoverage(car));
        
        PropertyInsurance[  ] propertiesInsured = new PropertyInsurance[3];
        propertiesInsured[0] = house;
        propertiesInsured[1] = mobile;
        propertiesInsured[2] = car;
                        
        double total = 0;
        for(PropertyInsurance property : propertiesInsured) {
        	total = total + property.getPropertyCost();
        }
        
        System.out.println("Properties worth "+total+" are insured");
                        
	}
}
