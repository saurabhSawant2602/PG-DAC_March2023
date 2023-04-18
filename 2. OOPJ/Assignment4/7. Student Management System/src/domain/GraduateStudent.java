package domain;

public class GraduateStudent extends Student {

	double researchFee;

	public GraduateStudent(String name, int id, String major, double gpa, double creditHours,double researchFee) {
		super(name, id, major, gpa);
		this.researchFee = researchFee;
		super.setTutionFee(creditHours*researchFee);
	}

	public double getResearchFee() {
		return researchFee;
	}

	public void setResearchFee(double researchFee) {
		this.researchFee = researchFee;
	}
	
	
	@Override
	public double calculateTution() {
		// TODO Auto-generated method stub
		return super.calculateTution();
	}

	@Override
	public String toString() {
		return (super.toString()+String.format("%-15.2f",this.researchFee));
	}
	

}
