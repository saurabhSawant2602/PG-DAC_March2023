package main;

import java.util.Scanner;

import domain.Flight;
import domain.User;

public class Program {
	static Scanner sc = new Scanner(System.in);

	public static User CreateUser() {
		User user = new User();
		System.out.println("Enter your name :");
		user.setName(sc.nextLine());
		System.out.println("Enter your email :");
		user.setEmail(sc.nextLine());
		while (true) {

			System.out.println("Enter your Ph No.");
			long number = sc.nextLong();
			if (number > 999_999_999L && number < 999_999_999_9L) {
				user.setContNo(number);
				break;
			}else {
				System.out.println("Invalid number !! try again --!");
			}

		}
		return user;

	}

	public static int menuList() {
		System.out.println("---------------------------------------");
		System.out.println("1. To Check flight availability ");
		System.out.println("2. To reserve seat  ");
		System.out.println("3. To View reserved seats  ");
		System.out.println("4. To cancel reservations ");
		System.out.println("0. To exit ");
		System.out.println("---------------------------------------");
		System.out.println("Enter your choice");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Airline Management App");
		User user = Program.CreateUser();
		System.out.println("Your account created ");
		Reservation res = new Reservation();

		int option;
		while ((option = menuList()) != 0) {
			switch (option) {
			case 1:
				res.showAllAvaiableSeats();
				break;
			case 2:
				System.out.println("Enter the flight number for which you wannna boook you seat : ");
				res.reserveSeat(user, sc.nextInt());
				break;
			case 3:
				res.flightsByUser(user);
				break;
			case 4:
				res.flightsByUser(user);
				System.out.println("Enter the flight number for which you wannna cancel your seat : ");
				res.unreserveSeat(user, sc.nextInt());
				break;
			case 5:
				break;

			}
		}

	}
}
