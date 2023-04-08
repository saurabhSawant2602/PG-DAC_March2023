package main;

import java.util.Scanner;

import domain.Dish;

class Program {
	static Scanner sc= new Scanner(System.in);
	
	
	
	public static Dish createDish() {
		
		Dish dish = new Dish();
		sc.nextLine();
		System.out.println("Enter the name of menu dish ");
		dish.setDishName( sc.nextLine());
		System.out.println("Enter the price of menu dish ");
		dish.setPrice( sc.nextDouble());
	    
		return dish;
		
	}
	
	
	
	public static int menuList() {
		System.out.println("1. View the current menu with prices");
		System.out.println("2. Add a new dish to the menu");
		System.out.println("3. Remove a dish from the menu");
		System.out.println("4. Modify the price of a dish on the menu");
		System.out.println("0. Exit the program");
		System.out.println("Enter your choice");
		return sc.nextInt();
		
		
		
//		a. View the current menu with prices
//		b. 
//		c. 
//		d. 
//		e.
	}
	
	public static void main(String[] args) {
		int choice;
		Restaurant restaurant= new Restaurant();
		while((choice = Program.menuList())!=0) {
			switch(choice) {
			case 1:restaurant.showAllDishes();
				  break;
			case 2:Dish dish =Program.createDish();//take input from user and create object/instance of type dish
			       restaurant.AddDish(dish);
				break;
			case 3:
				sc.nextLine();
				System.out.println("Enter dish name which you want to remove :"); 
				restaurant.removeDish(sc.nextLine());
				break;
			case 4:
				sc.nextLine();
				System.out.println("Enter dish name for which you want to update price");
			      restaurant.updatePrice(sc.nextLine());
				break;
			default : System.out.println("Invalid choice");
			
			}
		}
	}
}
