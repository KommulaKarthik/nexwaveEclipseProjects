package somePackage;

public class CarDemo {
	
	private String model;
	private double price;
	private float mileage;
	
	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public float getMileage() {
		return mileage;
	}



	public void setMileage(float mileage) {
		this.mileage = mileage;
	}



	public CarDemo(String model, double price, float mileage) {
		super();
		this.model = model;
		this.price = price;
		this.mileage = mileage;
	}



	@Override
	public String toString() {
		return "CarDemo [model=" + model + ", price=" + price + ", mileage=" + mileage + "]";
	}
	
	
	

}
