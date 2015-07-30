package com.msci.collectionpractice;

import java.util.*;

public class LibraryList {
	List<Book> bookList;
	public LibraryList(){
		bookList = new ArrayList<Book>();;
	}
	
	
	public void addBook(Book b){
		bookList.add(b);
		System.out.println("Book added to library");
	}
	
	public void removeBook(String theTitle){
		for (int i=bookList.size()-1; i>=0; i--){ // starts from booklist.size since this is computed everytime if placed in second condition
			Book b = bookList.get(i);
			if (b.getAuthor().equals(theTitle) || b.getTitle().equals(theTitle)){
				bookList.remove(b);
				System.out.println("Book " + b.getTitle() + " removed");
			}
		}
	}
	
	public void printDetails(String authorName){
		for (int i=0; i<bookList.size(); i++){
			Book b = bookList.get(i);
			if (b.getAuthor().equals(authorName)){
				System.out.println(b);
			}
		}
	}
	
	public void printAllBooks(){
		for (int i=0; i<bookList.size(); i++){
			Book b = bookList.get(i);
			System.out.println(b);
		}
	}
	public List<Book> returnACopyOfBooks(){
		List<Book> bookListCopy = new ArrayList<Book>();
		for (int i=0; i<bookList.size(); i++){
			Book existingBook = bookList.get(i);
			Book book = new Book(existingBook.getTitle(),existingBook.getPrice(),existingBook.getAuthor());
			bookListCopy.add(book);
		}
		return bookListCopy;
		
	}
}
