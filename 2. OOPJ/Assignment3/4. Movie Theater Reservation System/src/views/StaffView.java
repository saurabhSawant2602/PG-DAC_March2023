package views;

import java.util.Scanner;

import domain.Customer;
import domain.Staff;

public class StaffView extends TheaterView {
	Scanner sc = new Scanner(System.in);
	Staff staff;
	int bookedSeatsCount;

	public StaffView(Staff staff) {
		this.staff = staff;
	}

	public void showBookedTickets() {
		theaterView.showSeats();
	}

	public void countBookedSeats() {
		int count = 0;
		for (Customer row[] : theaterView.seatingChart) {
			for (Customer column : row) {
				if (column != null)
					count++;
			}
		}
		this.bookedSeatsCount = count;
	}

	public int getTicketSold() {
		this.countBookedSeats();
		return this.bookedSeatsCount;
	}

	public int GetRevenueGenerated() {
		return (this.bookedSeatsCount * TheaterView.RATE);
	}

	public int showMenu() {
		System.out.println("--------------------------------------");
		System.out.println();
		System.out.println("1. Ticket Sales Report");
		System.out.println("2. Available seats");
		System.out.println("3. Revenue Generated");
		System.out.println("4. Switch to User mode");
		System.out.println();
		System.out.println("--------------------------------------");
		System.out.println();
		return sc.nextInt();
	}

	public void switchMenu() {
		int option;
		while ((option = this.showMenu()) != 4) {
			switch (option) {
			case 1:
				System.out.println("Booked seats :" + this.bookedSeatsCount);
				System.out.println("Tickets sale :" + (getTicketSold() * TheaterView.RATE));

				break;
			case 2:
				System.out.println("Available seats :" + (theaterView.getTotalSeats() - this.bookedSeatsCount));
				System.out.println("Tickets sale :" + (getTicketSold() * TheaterView.RATE));

				break;
			case 3:
				System.out.println("Revenue Generated :" + (getTicketSold() * TheaterView.RATE));
				break;

			default:
				break;
			}
		}
	}
}
