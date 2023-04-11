package domain;

import java.util.Scanner;

public class Customer {
	private String name;
	private int age;
	private static Scanner sc = new Scanner(System.in);
	private int custId;
	private int Totalbill;

	public Customer() {

		this.custId = (int) Math.floor(Math.random() * (200 - 100 + 1) + 100);
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", custId=" + custId + ", Totalbill=" + Totalbill + "]";
	}

	// public void acceptRecord() {
//		System.out.println("Enter your name :");
//		this.name=sc.nextLine();
//		System.out.println("Enter your age :");
//		this.age=sc.nextInt();
//	}
	public int getTotalbill() {
		return Totalbill;
	}

	public void setTotalbill(int totalbill) {
		Totalbill = totalbill;
	}

	public String getName() {
		return name;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
