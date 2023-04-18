package manager;

import domain.Book;
import domain.FictionBook;
import domain.NonFictionBook;
import domain.ReferenceBook;

public class Manager {
    
	Book[] books;
	public Manager(){
		 this.books = new Book[] {
					new ReferenceBook("Let Us C", "Yashwant Kanitkar","BPB publictations",500, 120, 2),
					new ReferenceBook("All in one Maths", "Arihant","abc publictations",1200.34,500, 3),
					new ReferenceBook("Measurement and Instrumentation", "George L","ikd  publictations",2300,1000, 1),
					new FictionBook("Harry Potter", "J.K. Rowling","Bloomsbury publictations", 4000, 400, "fantasy literature"),
					new NonFictionBook("In Cold Blood", "Truman Capote","Random House",  2300.55, 0, "Non-Fiction subject"),
					new NonFictionBook("Sapiens: A Brief History of Humankind", "Yuval Noah Harar","Dvir Publishing House", 2300.34, 600, "History")
			};
		 
		 //methos
		 adjustDiscount();
		 printAllBooks();
		 printTotalPrice();
	}
	
	public void adjustDiscount() {
		double discount=0;
		for(Book book: books) {
			if(book instanceof ReferenceBook) {
				ReferenceBook book2=(ReferenceBook) book;
				discount=book2.getEdition()<5?((book2.getPrice()*20/100)):0;
				System.out.println(discount);
				book2.setDiscount(discount);
				book2.calculatePrice();
			}
			if(book instanceof FictionBook) {
				FictionBook book2=(FictionBook) book;
				discount=book2.getGenre().equals("Romance")?(book2.getPrice()*10/100):0;
				book2.setDiscount(discount);
				book2.calculatePrice();
			}
			if(book instanceof NonFictionBook) {
				NonFictionBook book2=(NonFictionBook) book;
				discount=book2.getSubject().equals("History")?(book2.getPrice()*15/100):0;
				book2.setDiscount(discount);
				book2.calculatePrice();
			}
		}
	}
	
	public void printAllBooks() {
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println();
		System.out.println(String.format("%-40s%-50s%-30s%-15s%-15s","Title", "Author", "Publisher","Discount","Price"));
		System.out.println();
		for(Book book:books) {
			System.out.println(String.format("%-40s%-50s%-30s%-15.2f%-15.2f",book.getTitle(), book.getAuthor(), book.getPublisher(), book.getDiscount(),book.getPrice()));
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("---------------------------------------------");
	}
	
	public void printTotalPrice() {
		double totalPrice=0;
		for(Book book:books) {
			totalPrice+=book.calculatePrice();
		}
		System.out.println();
		System.out.println("Total price of all books : "+totalPrice);
	}
	
}
