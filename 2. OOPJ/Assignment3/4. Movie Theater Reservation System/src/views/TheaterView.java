package views;

import domain.Customer;

public class TheaterView {
	static TheaterView theaterView = new TheaterView();
	Customer[][] seatingChart;
    final static int RATE=240;
	int totalSeats;
	int bookedTickets;
	Customer[] customers;

	public TheaterView() {
		this(10, 5);
	}

	public TheaterView(int r, int c) {
		this.seatingChart = new Customer[r][c];
		this.totalSeats = r * c;
		this.customers = new Customer[r * c];

	}

	public void showSeats() {
		for (Customer row[] : theaterView.seatingChart) {
			for (Customer column : row) {
				if (column == null)
					System.out.print(" |___| ");
				else
					System.out.print(" |###| ");
			}
			System.out.println();
		}
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public void addBookedTickets() {
		this.bookedTickets = bookedTickets + 1;
	}

	public void removeBookedTickets() {
		this.bookedTickets -= 1;
	}

}
