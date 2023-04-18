package domain;

public class InPatient extends Patient {
	private int noOfDays;
	private double roomCharges;
	private double medicalCharges;
	public InPatient(String name, int id, int age, int noOfDays, double roomCharges, double medicalCharges) {
		super(name, id, age);
		this.noOfDays = noOfDays;
		this.roomCharges = roomCharges;
		this.medicalCharges = medicalCharges;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public double getRoomCharges() {
		return roomCharges;
	}

	public void setRoomCharges(double roomCharges) {
		this.roomCharges = roomCharges;
	}

	public double getMedicalCharges() {
		return medicalCharges;
	}

	public void setMedicalCharges(double medicalCharges) {
		this.medicalCharges = medicalCharges;
	}

	@Override
	public double calculateBill() {
		// TODO Auto-generated method stub
		double totalRoomCharges=(100*this.getNoOfDays())+this.roomCharges;
		double medicalCharges= this.getAge()>60?(this.getMedicalCharges()-this.getMedicalCharges()*10/100):this.getMedicalCharges();
		return (super.calculateBill()+totalRoomCharges+medicalCharges);
		
		
	}
	
	

}
