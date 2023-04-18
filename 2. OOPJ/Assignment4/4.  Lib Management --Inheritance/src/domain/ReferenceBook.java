package domain;

public class ReferenceBook extends Book {
   

	private int edition;

	
	 public ReferenceBook(String title, String author, String publisher, double price, int numPages, int edition) {
		super(title, author, publisher, price, numPages);
		this.edition=edition;
	}


	public int getEdition() {
		return edition;
	}


	public void setEdition(int edition) {
		this.edition = edition;
	}


	@Override
	public double calculatePrice() {
		// TODO Auto-generated method stub
		return super.calculatePrice();
	}
	
	 
    
}
