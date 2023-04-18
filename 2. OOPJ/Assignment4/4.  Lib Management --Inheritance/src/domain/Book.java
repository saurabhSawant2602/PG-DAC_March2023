package domain;


public class Book {
	private String title;
	private String author;
	private String publisher;
	private double price;
	private int numPages;
	private final double pricePerPages=20;
	private double discount;
	
	
	
	
	public Book(String title, String author, String publisher, double price, int numPages) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.numPages = numPages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getPrice() {
		return price;
	}

	
	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public void setPrice(double price) {
		this.price =price;
	}

	public int getNumPages() {
		return numPages;
	}

	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

	public double calculatePrice() {
		this.setPrice(price-discount);
		return this.getPrice();
	}
	
	
}
