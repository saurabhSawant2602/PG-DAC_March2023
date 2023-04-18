package domain;

public class Motorcycle extends Vehicle {
	private int enginerSize;

	public Motorcycle(String make, String model, int year, double dailyRentalRate, int enginerSize) {
		super(make, model, year, dailyRentalRate);
		this.enginerSize = enginerSize;
	}

	public int getEnginerSize() {
		return enginerSize;
	}

	public void setEnginerSize(int enginerSize) {
		this.enginerSize = enginerSize;
	}

	@Override
	public double calculateRentalFee(int days) {
		// TODO Auto-generated method stub
		int surcharge= this.getEnginerSize()>2000?(20*days):0;
		return (super.calculateRentalFee(days)+surcharge);
	}

	
	
}
