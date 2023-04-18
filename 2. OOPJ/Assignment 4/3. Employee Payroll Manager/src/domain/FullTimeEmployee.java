package domain;

public class FullTimeEmployee extends Employee {

	private double BONUS;

	public FullTimeEmployee(String name, int id, double salary) {
		super(name, id, salary);
	    this.BONUS= super.getSalary()*10/100;
	}


	
	

	public double getBONUS() {
		return BONUS;
	}





	public void setBONUS(double bONUS) {
		BONUS = bONUS;
	}





	@Override
	public double calculatePay() {
	    return (super.getSalary()+this.BONUS);
	}

	@Override
	public String toString() {
		return super.toString()+" bonus=" + this.BONUS ;
	}
	
	

}
