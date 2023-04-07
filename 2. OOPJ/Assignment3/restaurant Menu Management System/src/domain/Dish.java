package domain;

public class Dish {
//	the name of the dish and its price
	private String name;
	private double price;
	
	public Dish() {
		this("",0);
	}
	
	public Dish(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Dish [name=" + name + ", price=" + price + "]";
	}

	
	
}
