package main;

import java.util.ArrayList;
import java.util.Collections;

import domain.Book;

public class Program  {
   public static void main(String[] args) {
	   
	   ArrayList<Book> books= new ArrayList<>();
	   books.add( new Book("","",2018));
	   books.add( new Book("","",2022));
	   books.add( new Book("","",2012));
	   books.add( new Book("","",2013));
	   books.add( new Book("","",2015));
	   books.add( new Book("","",2011));
   
	  
	   Collections.sort(books);
	   for(Book book :books) {
		   System.out.println(book);
	   }
	   
}
		
 
}
