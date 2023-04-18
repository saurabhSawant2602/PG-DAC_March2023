package domain;

public class Patient {
	private String name;
	private int id;
	private int age;
	private final double treatmentCharges = 500;

	
	
	public Patient(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public double calculateBill() {
		return this.treatmentCharges;
	}
}
