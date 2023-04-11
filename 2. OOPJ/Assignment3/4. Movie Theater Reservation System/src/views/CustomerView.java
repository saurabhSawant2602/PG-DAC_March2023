package views;

import java.util.Scanner;

import domain.Customer;

public class CustomerView extends TheaterView {
	static Scanner sc = new Scanner(System.in);
	Customer customer;

	public CustomerView(Customer customer) {
		this.customer = customer;
	}

	public int showMenu() {
		System.out.println("--------------------------------------");
		System.out.println();
		System.out.println("1. Show Seats chart");
		System.out.println("2. Book Ticket");
		System.out.println("3. Cancel Ticket");
		System.out.println("4. Generate bill");
		System.out.println("5. Switch to staff mode");
		System.out.println();
		System.out.println("--------------------------------------");
		return sc.nextInt();
	}

	public void switchMenu() {
		int option;
		while ((option = this.showMenu()) != 5) {
			switch (option) {
			case 1:
				theaterView.showSeats();
				break;
			case 2:
				System.out.println("How many seats do you want to book ?");
				int tickets = sc.nextInt();
				while (tickets != 0) {
					System.out.println("Enter row number and column number for Ticket no  ");
					tickets = this.bookSeat(sc.nextInt(), sc.nextInt()) ? --tickets : tickets;

				}

				break;
			case 3:
				System.out.println("Ticket Booked ");
				this.showBookedTickets();
				System.out.println("How many seats you want to cancel");
				int cancelTickets = sc.nextInt();
				while (cancelTickets != 0) {
					System.out.println("Enter row number and column number to cancel ");

					cancelTickets = this.cancelSeat(sc.nextInt(), sc.nextInt()) ? --cancelTickets : cancelTickets;
				}
				break;
			case 4:
				this.calculateBill();
				break;
			case 5:
				System.out.println("");
			default:
				System.out.println("Invalid option");

			}
		}

	}

	public boolean bookSeat(int r, int c) {
		if (seatingChart.length < r || r <= 0) {
			System.out.println("Invalid row");
			return false;
		}
		if (seatingChart[0].length < c || c <= 0) {
			System.out.println("Invalid column");
			return false;
		}
		if (theaterView.seatingChart[r - 1][c - 1] == null) {
			theaterView.seatingChart[r - 1][c - 1] = customer;
			theaterView.addBookedTickets();
			return true;
		}
		System.out.println("Sorry !! Seat is already booked ");
		return false;

	}

	public boolean cancelSeat(int r, int c) {
		if (seatingChart.length < r || r <= 0) {
			System.out.println("Invalid row");
			return false;
		}
		if (seatingChart[0].length < c || c <= 0) {
			System.out.println("Invalid column");
			return false;
		}
		if (theaterView.seatingChart[r - 1][c - 1] == customer) {
			theaterView.seatingChart[r - 1][c - 1] = null;
			theaterView.removeBookedTickets();
			return true;
		}
		System.out.println("Sorry !! Seat was not booked");
		return false;

	}

	public int showBookedTickets() {

		int count = 0, i = 0;
		for (Customer row[] : theaterView.seatingChart) {
			int j = 0;

			for (Customer column : row) {

				if (this.customer == column) {
					System.out.println("At row :" + (i + 1) + "     column :" + (j + 1));
					count++;
				}
				j++;
			}
			i++;
		}
		return count;
	}

	public void calculateBill() {
		customer.setTotalbill((this.showBookedTickets()) * TheaterView.RATE);
		System.out.println("Total Bill : " + customer.getTotalbill());
	}
}
