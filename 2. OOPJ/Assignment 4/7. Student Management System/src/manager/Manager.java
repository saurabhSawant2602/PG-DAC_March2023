package manager;

import java.security.PublicKey;

import domain.GraduateStudent;
import domain.Student;
import domain.UndergraduateStudent;

public class Manager {
	
	Student[] students;
     
	public Manager() {
		this.students = new Student[] { new UndergraduateStudent("", 1, "Kotlin", 8.5,900),
				new UndergraduateStudent("", 1, "Java", 8.5, 900), new GraduateStudent("", 2, "Ruby", 8.5,200, 3000),
				new UndergraduateStudent("", 3, "C++", 8.5, 900), new GraduateStudent("", 4, "Python", 8.5, 300,3000),
				new UndergraduateStudent("", 5, "JavaScript", 8.5, 900), new GraduateStudent("", 6, "C", 8.5,400, 3000),
				new UndergraduateStudent("", 7, "Machine Learning", 8.5, 900), new GraduateStudent("", 8, "C",8.5, 200, 3000),
				new UndergraduateStudent("", 9, "Swift", 8.5, 900), new GraduateStudent("", 10, "OOPS", 8.5,100, 3000), };
		
		calculateTutionFees();
		printRecord();
		printTotal();
	}
	
	public void calculateTutionFees() {
		for(int i=0;i<students.length;i++) {
			double tutionFee=0;
			if(students[i] instanceof UndergraduateStudent) {
				UndergraduateStudent student= (UndergraduateStudent) students[i];
				tutionFee=student.getGpa()>3.5? (student.getTutionFee()-(student.getTutionFee()*20/100)):student.getTutionFee();
			
				student.setTutionFee(tutionFee);
				
			}
			if(students[i] instanceof GraduateStudent) {
				GraduateStudent student= (GraduateStudent) students[i];
				tutionFee=student.getResearchFee()>5000? (student.getTutionFee()-student.getTutionFee()*10/100):student.getTutionFee();
				student.setTutionFee(tutionFee);
			}
		}
	}
	
	public void printRecord() {
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		System.out.println();
		
		System.out.println(String.format("%-15s%-30s%-15s%-15s%15s","Student ID", "Major","GPA","Tution Fees","Type"));
	    System.out.println();
	    
		for(Student student: students) {
			String type= student instanceof GraduateStudent?"Graduate Student":"UnderGrad Student";
			System.out.println(String.format("%-15d%-30s%-15.2f%-15.2f%-15s",student.getId(), student.getMajor(),student.getGpa(),student.getTutionFee(),type));
		    System.out.println();
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		System.out.println();
	}
	
	public void printTotal() {
		double sum=0;
		System.out.println();
		for(Student student:students) {
			sum+=student.getTutionFee();
		}
		System.out.println("Total tution Fees Received :"+sum);
	}
	
	
	
	
}
