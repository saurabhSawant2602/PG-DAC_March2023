package domain;

public class Car extends Vehicle{
   

	private int numDoors;
    

	public Car(String make, String model, int year, double dailyRentalRate, int numDoors) {
		super(make, model, year, dailyRentalRate);
		this.numDoors = numDoors;
	}

	
	public int getNumDoors() {
		return numDoors;
	}

	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}


	@Override
	public double calculateRentalFee(int days) {
		// TODO Auto-generated method stub
		double surcharge= this.getNumDoors()>2?(10*days):0;
		return (super.calculateRentalFee(days)+surcharge);
	}
    
	 
    
}
