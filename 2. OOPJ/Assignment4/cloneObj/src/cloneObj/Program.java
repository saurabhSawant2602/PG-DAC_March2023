package cloneObj;


//Employee Class
class Employee implements Cloneable {
	String name;
	int id;
	Date joiningDate = new Date(17, 04, 2023);

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Employee employee =(Employee) super.clone();
		employee.joiningDate=(Date) joiningDate.clone();
		
		return employee;
	}

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
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

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", joiningDate=" + joiningDate + "]";
	}

}

class Date implements Cloneable{
	int day;
	int month;
	int year;

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}




	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

}

public class Program {
	public static void main(String[] args) {

		try {
			Employee emp1 = new Employee("Saurabh", 1);
			Employee cloneEmp = (Employee) emp1.clone();
			
			
			
			System.out.println("Before cloning");
			System.out.println(emp1);
			System.out.println(cloneEmp);
			cloneEmp.joiningDate.setDay(16);
			cloneEmp.setName("Bhushan");
			System.out.println("After cloning");
			System.out.println(emp1);
			System.out.println(cloneEmp);

		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}