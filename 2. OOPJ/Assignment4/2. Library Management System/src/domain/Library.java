package domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Library {
	private static Library libInst= new Library();
    private Book Books[];
    private Librarian librarian ;
 
    
    
    public Library() {
		this(3);
		
	}
    
    
    public Library(int capacity) {
    	this.Books= new Book[capacity];
    	this.librarian= new Librarian("SAURABH", "8928010092");
    
    }


	public Book[] getBook() {
		return Books;
	}


	public void setBook(Book[] books) {
		Books = books;
	}


	public static Library getLibInst() {
		return libInst;
	}


	public static void setLibInst(Library libInst) {
		Library.libInst = libInst;
	}


	public Book[] getBooks() {
		return Books;
	}


	public void setBooks(Book[] books) {
		Books = books;
	}

	public boolean addbook() {
		Scanner sc = new Scanner(System.in);
		Book book= new Book();
		System.out.println("Enter the title of the book :");
		book.setTitle(sc.nextLine());
		
		System.out.println("Enter the Author name of the book :");
		book.setAuthor(sc.nextLine());
		
		System.out.println("Enter the publisher of the book :");
		book.setPublisher(sc.nextLine());
		
		System.out.println("Enter the ISBN of the book :");
		book.setIsbn(sc.nextLine());
		
		
		return librarian.addBooks(book);
		
	}
	public boolean removeBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ISBN of the book :");
	    return librarian.removeBooks(sc.nextLine());
		
	}
	
	public boolean printAllBooks() {
		return librarian.printAllBooks();
	}
	
	public int showMenu() throws InputMismatchException{
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Add Book");
		System.out.println("2. Remove Book");
		System.out.println("3. Print All Books");
		System.out.println("0. Exit");
		System.out.println("Enter your choice :");
		return sc.nextInt();
	}

	public void driveMenu() {
		
		int option;
		String msgString;
		while(true) {
		
				
		  try {
			
	
		    option=showMenu();
		    if(option==0) {
		    	
		    	break;
		    }
			switch (option) {
			case 1:
				msgString=addbook()? "Added": "Not Added";
				printmsg(msgString);
				break;
			case 2:
				msgString=removeBook()? "Removed": "Not Removed";
				printmsg(msgString);
				break;
			case 3:
				msgString=printAllBooks()? "":"Library is empty";
				printmsg(msgString);
				break;
			case 0:
				System.out.println("Thank you for visiting");
				break;
			default:
					throw new InputMismatchException();
			}
		  } catch (InputMismatchException e) {
				System.out.println("Enter valid Input !!");
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Library capacity is full !!");
			}
		}
	}

	public void printmsg(String msg) {
		System.out.println(msg);
	}
    
}
