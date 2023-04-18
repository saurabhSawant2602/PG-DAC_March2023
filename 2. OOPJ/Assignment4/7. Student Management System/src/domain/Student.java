package domain;


public class  Student {
     private String name;
     private int id;
     private String major;
     private double gpa;
     private double tutionFee;
     
     
	public Student(String name, int id, String major, double gpa) {
		super();
		this.name = name;
		this.id = id;
		this.major = major;
		this.gpa = gpa;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public double getTutionFee() {
		return tutionFee;
	}
	public void setTutionFee(double tutionFee) {
		this.tutionFee = tutionFee;
	}
	public double calculateTution() {
		return this.getTutionFee();
	}
	
	@Override
	public String toString() {
		return String.format("%-10d%-10s%-10s%-15.2f",name,  id,  major,  gpa);
	}
	
	

     
  
	
     
     
     
     
}
