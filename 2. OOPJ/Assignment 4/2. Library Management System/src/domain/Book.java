package domain;


public class Book {
    private String title;
    private String author;
    private String isbn;
    private String publisher;
    private int noOfCopies;
    
    public Book() {
    	this("", "", "", "");
    	this.setNoOfCopies(1);
    }
    
	public Book(String title, String author, String isbn, String publisher) {
	
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.publisher = publisher;
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
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return String.format("%-15s%-15s%-20s%-25s%-10s",title,isbn,author,publisher,noOfCopies);
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
    
    public int getNoOfCopies() {
    	Book[] books= Library.getLibInst().getBooks();
     	for(int i=0;i<books.length;i++) {
     		if(this==books[i]) {
     			noOfCopies+=1;
     		}
     	}
     	
     	return noOfCopies-1;
    }

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
    
    
}
