package manager;


import domain.InPatient;
import domain.OutPatient;
import domain.Patient;

public class Manager {
	Patient[] patients;

	public Manager() {
		this.patients = new Patient[] {

//	InPatient			String name, int id, int age, int noOfDays, double roomCharges, double medicalCharges
// out patient          String name, int id, int age, double doctorFees, double testCharges
				new InPatient("Saurabh", 1, 23, 12, 10000, 5000), new OutPatient("Madan", 2, 65, 15000, 5000),
				new InPatient("Saurabh", 3, 68, 12, 12512.432, 8373.22),
				new OutPatient("Mohan", 4, 59, 18234.16, 6080.12), new InPatient("Saurabh", 5, 23, 12, 1000, 500),
				new OutPatient("John", 6, 34, 34329.455, 4350.32),

		};
		printBillOfAll();
		totalBill();
		
		
	}

	public void printBillOfAll() {
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		System.out.println();
		System.out.println(String.format("%-5s%-15s%-10s%-15s%-15s","ID", "Name","Age","Total Bill","Patient type"));
		System.out.println();
		for(Patient patient:patients) {
			//id name age bill Patienttype
			String type= patient instanceof InPatient? "InPatient" : "OutPatient";
			System.out.println(String.format("%-5d%-15s%-10d%-15.2f%-15s",patient.getId(),patient.getName(),patient.getAge(),patient.calculateBill(),type));
		}
		System.out.println("-------------------------------------------------------------");
	}
	
	public void totalBill() {
		double total=0;
		for(Patient patient:patients) {
			total+=patient.calculateBill();
		}
		System.out.println();
		System.out.println(String.format("%s %.2f", "Total Bill Pending of all patients combined:  ",total));
	}
	

}
