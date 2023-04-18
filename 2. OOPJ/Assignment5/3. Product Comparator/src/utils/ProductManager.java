package utils;

import java.util.Arrays;
import java.util.Scanner;

import comparactors.CategoryComparator;
import comparactors.NameComparactor;
import comparactors.PriceComparator;
import domain.Product;

public class ProductManager {
	private Product[] products;
	static Scanner sc = new Scanner(System.in);

	public ProductManager() {
		this.products = new Product[3];
		addProducts();
	}

	public void start() {
		this.runMenu();
	}

	public Product createProduct() {
		Product product = new Product();
		System.out.println("Enter the name of the Dish : ");
		product.setName(sc.nextLine());
		System.out.println("Enter the price of the Dish : ");
		product.setPrice(sc.nextDouble());
		sc.nextLine();
		System.out.println("Enter the Catgory of the Dish : ");
		product.setCategory(sc.nextLine());

		return product;
	}

	public boolean addProduct() {
		for (int i = 0; i < products.length; i++) {
			if (products[i] == null) {
				products[i] = createProduct();

				return true;
			}
		}
		return false;
	}

	public void addProducts() {
		System.out.println("Add 3 products");

		for (int i = 1; i <= 3; i++) {

			if (this.addProduct()) {
				System.out.println("product " + i + " added");
			} else {
				System.out.println("List is full!");
			}

		}

	}

	public boolean showAllProducts() {
		System.out.println();
		boolean flag = false;

		for (Product product : products) {
			if (product != null) {
				System.out.println(product);
				flag = true;
			}

		}
		return flag;
	}

	public int showMenu() {
		System.out.println("1. Show all products");
		System.out.println("2. Compare by");
		System.out.println("0. Exit");
		return sc.nextInt();
	}

	public void runMenu() {
		int choice;

		while ((choice = showMenu()) != 0) {
			switch (choice) {
			case 1:
				System.out.println(showAllProducts() ? "" : "Empty !!");

				break;
			case 2:
				runsubMenu();
				break;

			default:
				break;
			}
		}
	}

	private int showSubmenu() {
		System.out.println("1. compare by Name");
		System.out.println("2. compare by Price");
		System.out.println("3. compare by Category");
		System.out.println("0. compare by Category");
		return sc.nextInt();
	}

	public void runsubMenu() {
		int choice;

		while ((choice = showSubmenu()) != 0) {
			switch (choice) {
			case 1:
				NameComparactor idComp = new NameComparactor();
				Arrays.sort(this.products, idComp);
				System.out.println(showAllProducts() ? "" : "Empty !!");
				break;
			case 2:
				PriceComparator priceComp = new PriceComparator();
				Arrays.sort(this.products, priceComp);
				System.out.println(showAllProducts() ? "" : "Empty !!");
				break;
			case 3:
				CategoryComparator catComp = new CategoryComparator();
				Arrays.sort(this.products, catComp);
				System.out.println(showAllProducts() ? "" : "Empty !!");
				break;

			default:
				break;
			}
		}
	}

}
/*
vadapav 
233
nashta
samosa
455
snaks
Dosa
4333
Breakfast
Dal bhat
322
Jevan
Anda curry
100
Dinner
*/