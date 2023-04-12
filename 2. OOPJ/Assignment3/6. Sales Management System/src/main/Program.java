package main;

import java.util.Scanner;

import domain.SalesPerson;

public class Program {
	static Organisation org = new Organisation();
	static Scanner sc = new Scanner(System.in);

	public static void addSalesPerson() {
		SalesPerson salesPerson = new SalesPerson();
		sc.nextLine();
		System.out.println("Enter the name of the sales Person :");
		salesPerson.setName(sc.nextLine());

		System.out.println("Enter sales figures monthly basis :");
		double[] salesFigures = new double[12];

		for (int i = 0; i < salesFigures.length; i++) {
			System.out.print("Enter the sales figure for month " + (i + 1)+"   :" );
			salesFigures[i] = sc.nextDouble();
		}

		salesPerson.setSalesFigures(salesFigures);
		org.addSalesPerson(salesPerson);
	}

	public static void updateSalesFigures() {
		System.out.println("Enter the id of sales Person");
		org.updateSaleFigures(sc.nextInt());
	}

	public static void calculateFigOfSaleperson() {
		System.out.println("Enter the id of sales Person");
		SalesPerson person = org.findSalesPerson(sc.nextInt());
		if (person == null) {
			System.out.println("Invalid ID !!");
			return;
		}
		System.out.println("Sale persons total figures : " + person.calculateTotalFigs());
	}

//	public static void calcFigOfAllSalePerson() {
//		System.out.println("Enter the id of sales Person");
//		SalesPerson person = org.findSalesPerson(sc.nextInt());
//		if (person == null) {
//			System.out.println("Invalid ID !!");
//			return;
//		}
//		System.out.println("Sale persons total figures :" + person.calculateTotalFigs());
//	}

	public static void calculateSalesOfAll() {
		org.calculateSalesOfAll();
	}

	public static int showMenu() {
		System.out.println("-------------------------------------");
		System.out.println();
		System.out.println("1. Add a new salesperson");
		System.out.println("2. Update an existing salesperson");
		System.out.println("3. View total sales for a salesperson");
		System.out.println("4. View total sales for all salespersons");
		System.out.println("0. Exit");
		System.out.println();
		System.out.println("-------------------------------------");
		return sc.nextInt();
	}

	public static void switchMenu() {
		int option;
		while ((option = showMenu()) != 0) {
			switch (option) {
			case 1:
				addSalesPerson();
				break;
			case 2:
				updateSalesFigures();
				break;
			case 3:
				calculateFigOfSaleperson();
				break;
			case 4:
				calculateSalesOfAll();
				break;
			default:
				System.out.println("Invalid option ");
			}
		}
	}

	public static void main(String[] args) {
		switchMenu();
       
	}
}
