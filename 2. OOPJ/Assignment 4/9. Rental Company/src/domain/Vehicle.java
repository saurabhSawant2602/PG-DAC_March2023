package domain;

public class Vehicle {
    private String make;
    private String model;
    private int year;
    private double dailyRentalRate;
    
	public Vehicle(String make, String model, int year, double dailyRentalRate) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.dailyRentalRate = dailyRentalRate;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getDailyRentalRate() {
		return dailyRentalRate;
	}

	public void setDailyRentalRate(double dailyRentalRate) {
		this.dailyRentalRate = dailyRentalRate;
	}
    
    
    
    public double calculateRentalFee(int days) {
    	return getDailyRentalRate()*days;
    }
    
     
}
