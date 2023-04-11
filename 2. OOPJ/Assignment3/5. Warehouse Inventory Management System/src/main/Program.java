package main;

import java.util.Scanner;

import domain.Warehouse;

public class Program {
	static Scanner sc = new Scanner(System.in);

	public static int showMenu() {
		System.out.println("----------------------------------------------");
		System.out.println();
		System.out.println("1. Add item to shelf");
		System.out.println("2. Remove item from shelf");
		System.out.println("3. Display contents of all shelves");
		System.out.println("4. Exit");
		System.out.println("----------------------------------------------");
		System.out.println();
		System.out.print("Enter choice   : 	");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Warehouse Inventory Management System");
		System.out.println();
		int choice;
		while ((choice = showMenu()) != 0) {
			switch (choice) {
			case 1:
				sc.nextLine();
				System.out.println("Please enter the name of the item:");
				String item = sc.nextLine();
				System.out.println("Please enter the shelf number (1-10):");
				int number = sc.nextInt();
				Warehouse.addToshelf(number, item);

				break;
			case 2:
				System.out.println("Please enter the shelf number (1-10):");
				int num = sc.nextInt();
				Warehouse.removeItem(num);

				break;
			case 3:
				Warehouse.printAllShelvesItems();

				break;

			default:
				System.out.println("Invalid choice !! Try Again");
			}
		}
		System.out.println("Thank you for using the Warehouse Inventory Management System!");
	}
}
