package domain;

public class FictionBook extends Book{
    private String genre;

	public FictionBook(String title, String author, String publisher, double price, int numPages, String genre) {
		super(title, author, publisher, price, numPages);
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public double calculatePrice() {
		// TODO Auto-generated method stub
		return super.calculatePrice();
	}
    
    
    
}
