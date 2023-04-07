package main;

import java.util.Scanner;

import domain.Dish;

public class Program {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Restaurant res = new Restaurant();
		int choice;
		Dish dish;
		while ((choice = Program.menu()) != 0) {
			switch (choice) {
			case 1:
				res.showMenuDishes();
				break;
			case 2:
				dish = Program.getOrder();
				res.addDishToMenu(dish);
				break;

			case 3:
				System.out.println("Enter the dish name to modify the price");
				res.modifyPrice(sc.nextLine());
				break;
			case 4:
				sc.nextLine();
				System.out.println("Enter name of the dish to remove the dish from menu :");
				res.removeDish(sc.nextLine());
				break;
			case 5:
				break;
			default:
				System.out.println("Invalid choice");
			}

		}
	}

	// menu list
	public static int menu() {
		System.out.println("0. exit ");
		System.out.println("1. View the current menu with prices");
		System.out.println("2.  Add a new dish to the menu ");
		System.out.println("3. Modify the price of a dish on the menu ");
		System.out.println("4. Remove the dish from menu ");
		return sc.nextInt();
	}

	public static Dish getOrder() {
		Dish dish = new Dish();
		sc.nextLine();
		System.out.println("Enter the dish name :");
		dish.setName(sc.nextLine());
		System.out.println("Enter price for " + dish.getName());
		dish.setPrice(sc.nextDouble());
		return dish;

	}

}
