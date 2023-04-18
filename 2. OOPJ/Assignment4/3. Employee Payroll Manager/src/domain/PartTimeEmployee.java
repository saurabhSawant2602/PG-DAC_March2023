package domain;



public class PartTimeEmployee extends Employee{
   private int hoursWorked;
   private double hourlyRate;
   private double BONUS;
   
   
   

public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
	super(name, id, 0);
	this.hoursWorked = hoursWorked;
	this.hourlyRate = hourlyRate;
	super.setSalary(hourlyRate*hoursWorked);
}

public int getHoursWorked() {
	return hoursWorked;
}
public void setHoursWorked(int hoursWorked) {
	this.hoursWorked = hoursWorked;
}
public double getHourlyRate() {
	return hourlyRate;
}
public void setHourlyRate(double hourlyRate) {
	this.hourlyRate = hourlyRate;
}



public double getBONUS() {
	return BONUS;
}

public void setBONUS(double bONUS) {
	BONUS = bONUS;
}

@Override
public double calculatePay() {
   return (super.getSalary()+BONUS);
}
   
   
   
}
