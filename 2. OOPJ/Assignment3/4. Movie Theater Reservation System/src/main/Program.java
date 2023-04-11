package main;

import java.util.Scanner;

import domain.Customer;
import domain.Staff;
import views.CustomerView;
import views.StaffView;
import views.TheaterView;

public class Program {
	static Scanner sc = new Scanner(System.in);
	static Customer customer;

	public static Customer acceptRecord() {
		sc.nextLine();
		Customer customer = new Customer();
		System.out.println("Enter customer's name :");
		customer.setName(sc.nextLine());
		System.out.println("Enter customer's age :");
		customer.setAge(sc.nextInt());

		return customer;

	}

	public static int showMenu() {
		System.out.println("1. Customer Mode");
		System.out.println("2. Staff Mode");
		System.out.println("0. Exit");
		System.out.println("Enter your choice :");
		return sc.nextInt();
	}

	public static void switchLogin() {
		int option;
		while ((option = showMenu()) != 0) {
			switch (option) {
			case 1:
				customer = acceptRecord();
				CustomerView customerView = new CustomerView(customer);
				customerView.switchMenu();
				break;
			case 2:
				System.out.println("Welcome to Movie theater booking app ");
				Staff staff = new Staff();
				StaffView staffView= new StaffView(staff);
				staffView.switchMenu();
				break;

			default:
				break;
			}

		}
	}

	public static void main(String[] args) {

	
      switchLogin();
	

//		int count=staffView.getTicketSold();
//		System.out.println(count);
//		System.out.println(staffView.GetRevenueGenerated());
//		

	}
}
