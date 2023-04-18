package domain;

public class OutPatient extends Patient {
	private double doctorFees;
	private double testCharges;

	public OutPatient(String name, int id, int age, double doctorFees, double testCharges) {
		super(name, id, age);
		this.doctorFees = doctorFees;
		this.testCharges = testCharges;
	}

	public double getDoctorFees() {
		return doctorFees;
	}

	public void setDoctorFees(double doctorFees) {
		this.doctorFees = doctorFees;
	}

	public double getTestCharges() {
		return testCharges;
	}

	public void setTestCharges(double testCharges) {
		this.testCharges = testCharges;
	}

	@Override
	public double calculateBill() {
		// TODO Auto-generated method stub
		double testCharges= this.getAge()>60? (this.getTestCharges()-this.getTestCharges()*5/100):this.getTestCharges();
		return (super.calculateBill()+this.getDoctorFees()+testCharges);
	}

	
	
}
