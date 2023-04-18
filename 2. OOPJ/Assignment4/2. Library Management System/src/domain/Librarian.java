package domain;


public class Librarian {
	private String name;
	private String phNoString;

	public Librarian(String name, String phNoString) {
		super();
		this.name = name;
		this.phNoString = phNoString;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhNoString() {
		return phNoString;
	}

	public void setPhNoString(String phNoString) {
		this.phNoString = phNoString;
	}
	public boolean addBooks(Book book ) {
		
		Book[] books= Library.getLibInst().getBooks();
		for(int i=0;i<books.length;i++) {
			String isbn= book.getIsbn();
			if(books[i]!=null && books[i].getIsbn().equals(isbn) ) {
				books[i].setNoOfCopies(books[i].getNoOfCopies()+1);
				return true;
			}
			if(books[i]==null) {
				books[i]=book;
			
				return true;
			}
		}
		
		
		return false;
	}
	
	public boolean removeBooks(String isbn) {
		Book[] books= Library.getLibInst().getBooks();
		
		for(int i=0;i<books.length;i++) {
			if(books[i]!=null && books[i].getIsbn().equals(isbn)) {
				books[i].setNoOfCopies(books[i].getNoOfCopies()-1);
				if(books[i].getNoOfCopies()==0) {
					books[i]=null;
					return true;
				}
				
			}
			
		}
		return false;
	}

	
    public boolean printAllBooks() {
    	Book[] books= Library.getLibInst().getBooks();
    	boolean flag=false;
    	for(Book book: books) {
    		if(book!=null) {
    			System.out.println(book);
    			flag=true;
    		}
    		
    	}
    	return flag;
    }
}
