package domain;

public class Book implements Comparable<Book> {
   private String title;
   private String author;
   private int publicationYear;
   
@Override
public int compareTo(Book b) {
	
	if(this.publicationYear < b.getPublicationYear()) {
	    return this.publicationYear - b.getPublicationYear();
	}
	return 0;
}

public Book(String title, String author, int publicationYear) {

	this.title = title;
	this.author = author;
	this.publicationYear = publicationYear;
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

public int getPublicationYear() {
	return publicationYear;
}

public void setPublicationYear(int publicationYear) {
	this.publicationYear = publicationYear;
}

@Override
public String toString() {
	return "Book [title=" + title + ", author=" + author + ", publicationYear=" + publicationYear + "]";
}

   
	
	
	
}
