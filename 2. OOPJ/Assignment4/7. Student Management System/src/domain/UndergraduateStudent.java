package domain;

public class UndergraduateStudent extends Student {
	private int creditHours;
	private final double tutionRate=500;

	public UndergraduateStudent(String name, int id, String major, double gpa ,int creditHours) {
		super(name, id, major, gpa);
		
		this.creditHours = creditHours;
		super.setTutionFee(tutionRate*creditHours);;
	}

	public int getCreditHours() {
		return creditHours;
	}

	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}

	public double getTutionRate() {
		return tutionRate;
	}


	
	
	
	@Override
	public double calculateTution() {
		// TODO Auto-generated method stub
		return super.calculateTution();
	}

	@Override
	public String toString() {
		return (super.toString()+String.format("%-10d%-15.2f",this.creditHours, this.tutionRate));
	}
	
	

}
