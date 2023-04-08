package domain;

public class Dish{
	private String dishName;
	private double price;
	public Dish() {
		// TODO Auto-generated constructor stub
	}
	public Dish(String dishName, double price) {
		super();
		this.dishName = dishName;
		this.price = price;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Dish [dishName=" + dishName + ", price=" + price + "]";
	}
	
	
	
	
	
	
}