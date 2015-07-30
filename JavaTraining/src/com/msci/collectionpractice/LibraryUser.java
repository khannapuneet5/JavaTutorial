package com.msci.collectionpractice;
import java.util.*;
public class LibraryUser {

	public static void main(String[] args) {
		LibraryList lib = new LibraryList();
		Book b1 = new Book("Ajax Hacks",200,"Bruce Perry");
		Book b2 = new Book("Thinking in Java",1200,"Bruce Eckel");
		Book b3 = new Book("Practical Ext JS 4",899, "Prabhu");
		Book b4 = new Book("Programming Scala",1500,"Venkat");
		Book b5 = new Book("Seven languages in seven weeks",3000,"Bruce Tate");
		lib.addBook(b1);
		lib.addBook(b2);
		lib.addBook(b3);
		lib.addBook(b4);
		lib.addBook(b5);
		lib.printAllBooks();
		lib.removeBook("Ajax Hacks");
		lib.removeBook("Bruce Eckel");
		lib.printDetails("Prabhu");
		List<Book> books = lib.returnACopyOfBooks();
		for (int i=0; i<books.size(); i++){
			Book b = books.get(i);
			System.out.println(b);
		}
		
		LibrarySet libSet = new LibrarySet();
		libSet.addBook(b1);
		libSet.addBook(b2);
		libSet.addBook(b3);
		libSet.addBook(b4);
		libSet.addBook(b5);
		libSet.printAllBooks();
		System.out.println("*************Removing books*****************");
		//libSet.removeBook("Ajax Hacks");
		//libSet.removeBook("Bruce Eckel");
		libSet.printDetails("Prabhu");
		Set<Book> books2 = libSet.returnACopyOfBooks();
		Iterator<Book> itr = books2.iterator();
		while (itr.hasNext()){
			Book bSet = (Book)itr.next();
			System.out.println(bSet);
		}
	}

}
