package domain;

public class NonFictionBook extends Book {
     private String Subject;

	public NonFictionBook(String title, String author, String publisher, double price, int numPages, String subject) {
		super(title, author, publisher, price, numPages);
		Subject = subject;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	@Override
	public double calculatePrice() {
		// TODO Auto-generated method stub
		return super.calculatePrice();
	}
     
    
}
