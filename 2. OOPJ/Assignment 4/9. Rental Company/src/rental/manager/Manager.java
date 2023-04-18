package rental.manager;

import javax.print.attribute.standard.PrinterMessageFromOperator;
import javax.print.attribute.standard.RequestingUserName;

import domain.Car;
import domain.Motorcycle;
import domain.Truck;
import domain.Vehicle;

public class Manager {
	private Vehicle[] vehicles;
	// to-do we can take input for days if we want
	private static int days = 12;

	public Manager() {
		// CAR: String make, String model, int year, double dailyRentalRate, int
		// numDoors

		// MotorCycle : String make, String model, int year, double dailyRentalRate, int
		// enginerSize

		// Truck :String make, String model, int year, double dailyRentalRate, double
		// cargoCapacity
		this.vehicles = new Vehicle[] { new Car("Maruti Suzuki", "Brezza", 2016, 2000, 4),
				new Car("TATA", "Nexon", 2022, 3276, 4), new Motorcycle("KTM", "Duke", 2021, 2003.23, 576),
				new Car("Hyndai", "Creta", 2022, 5434.54, 4), new Car("TATA", "Altroz", 2023, 4565.566, 4),
				new Truck("TATA", "T.10 Ultra", 2023, 6800.324, 8900),
				new Motorcycle("Harley-Davidson", "Heritage Classic", 2021, 5043.253, 1800),
				new Truck("Mahindra", "Loadking Optimo Tipper", 2023, 7546.324, 6950),

		};
		printRentForAll();
		printTotalRent();
	}

	public void printRentForAll() {

		System.out.println("\n---------------------------------------------\n");
		
		
		System.out.println(
				String.format("%-20s%-30s%-10s%-10s%-8s", "Make", "Car Model", "Year", "Rental Rate/Day", "Type"));
		for (Vehicle vehicle : vehicles) {
			String type = vehicle instanceof Car ? "Car" : (vehicle instanceof Truck ? "Truck" : "Motorcycle");
			System.out.println(String.format("%-20s%-30s%-10d%-10.2f%-8s", vehicle.getMake(), vehicle.getModel(),
					vehicle.getYear(), vehicle.calculateRentalFee(days), type));
		}
		System.out.println("\n---------------------------------------------\n");
	}

	public void printTotalRent() {
		double totalRent = 0;
		for (Vehicle vehicle : vehicles) {
			totalRent += vehicle.calculateRentalFee(days);
		}
		System.out.format("%s %.2f", "Total rent of all vehicles :",totalRent);
		System.out.println();
	}

}
