package oopsconcepts;

import java.util.ArrayList;
import java.util.List;

class Book {
	public String title;
	public String author;
	
	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

class Library {
	private final List<Book> books;
	
	Library(List<Book> books){
		this.books = books;
	}
	
	public List<Book> getTotalBooksInLibrary() {
		return books;
	}
}

public class Composition {

	public static void main(String[] args) {
		Book b1 = new Book("Effective Java", "Joshua Bloch");
		Book b2 = new Book("Thinking in Java", "Bruce Eckel");
		Book b3 = new Book("Java: The Complete Reference", "Herbet Schildt");
		
		// Creating the list which contains the no of books.
		List<Book> books = new ArrayList<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		
		Library library = new Library(books);
		List<Book> bks = library.getTotalBooksInLibrary();
		for(Book bk: bks) {
			System.out.println("Title: "+bk.title + " and "+ "Author: "+bk.author);
		}
	}
}
