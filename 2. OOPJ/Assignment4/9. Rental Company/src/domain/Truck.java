package domain;

public class Truck extends Vehicle {
	double CargoCapacity;

	public Truck(String make, String model, int year, double dailyRentalRate, double cargoCapacity) {
		super(make, model, year, dailyRentalRate);
		CargoCapacity = cargoCapacity;
	}

	public double getCargoCapacity() {
		return CargoCapacity;
	}

	public void setCargoCapacity(double cargoCapacity) {
		CargoCapacity = cargoCapacity;
	}

	@Override
	public double calculateRentalFee(int days) {
		// TODO Auto-generated method stub
		int surcharge= this.getCargoCapacity()>5000?(30*days):0;
		return (super.calculateRentalFee(days)+surcharge);
	}
	
	
	

}
