package payroll.manager;

import domain.Employee;
import domain.FullTimeEmployee;
import domain.PartTimeEmployee;

public class PayRoll {
    Employee[] empArr;
	
	public PayRoll() {
		this.empArr= new Employee[] {
			new FullTimeEmployee("Aniket", 1, 30000),
			new FullTimeEmployee("Bandrinath", 2, 35000),
			new PartTimeEmployee("Dhondiram",3,20,300),
			new FullTimeEmployee("Ram", 4, 5000),
			new PartTimeEmployee("Shyam",5,25,23300),
			new FullTimeEmployee("Gotya", 6, 23000),
			new FullTimeEmployee("Chomya", 7, 4000),
			new PartTimeEmployee("Chintu",8,45,300),
			new FullTimeEmployee("Gangadhar", 9, 5000),
			new PartTimeEmployee("Lilabai",10,40,150),
			new PartTimeEmployee("Sita",11,80,230),
			
		};
		this.adjustPay();
		
		this.printRecord();
		this.printPayroll();
		
		
		
	}
	
	public void adjustPay() {
		for(int i=0;i<empArr.length;i++) {
			double bonus=0;
			if(empArr[i] instanceof FullTimeEmployee) {
				FullTimeEmployee employee= (FullTimeEmployee) empArr[i];
				employee.setBONUS(empArr[i].getSalary()*10/100);
				
			}
			if(empArr[i] instanceof PartTimeEmployee) {
				PartTimeEmployee employee= (PartTimeEmployee) empArr[i];
				employee.setSalary(employee.getHourlyRate()*employee.getHoursWorked());
				employee.setBONUS(employee.getHoursWorked()>40? employee.getSalary()*20/100:0);
			}
		}
	}
	
	
	public void printPayroll() {
		
		double total=0;
		for(Employee emp:empArr) {
			total+= emp.calculatePay();
		}
		System.out.println("----------------------------------");
		System.out.println();
		System.out.println("Pay roll of the comapany  "+total);
		System.out.println();
		System.out.println("----------------------------------");
	}
	
	public void printRecord() {
		System.out.println("----------------------------------");
		System.out.println();
		System.out.println("Payroll record (Employee wise)");
		System.out.println();
		System.out.println("----------------------------------");
		
		System.out.println(String.format("%-15s%-15s%-10s","id","Salary","Job-Type"));
		
		for(Employee emp:empArr) {
		
		System.out.println("");
		System.out.println(String.format("%-15s%-15.2f%-10s",emp.getId(),emp.getSalary(),(emp instanceof FullTimeEmployee? "Full Time":"Part Time")));
		}
	}
	
	
}
