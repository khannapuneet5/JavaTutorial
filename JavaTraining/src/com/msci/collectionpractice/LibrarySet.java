package com.msci.collectionpractice;

import java.util.*;

public class LibrarySet {
	Set<Book> bookSet;
	public LibrarySet(){
		bookSet = new HashSet<Book>();
	}
	public void addBook(Book b){
		bookSet.add(b);
		System.out.println("Book added to library");
	}
	
	public void removeBook(String theTitle){
		
		if (bookSet.contains(theTitle)){
			bookSet.remove(theTitle);
		}
	}
	
	public void printDetails(String authorName){
		Iterator<Book> itr = bookSet.iterator();
		while (itr.hasNext()){
			Book b = (Book)itr.next();
			if (b.getAuthor().equals(authorName)){
				System.out.println(b);
			}
			
		}
	}
	
	public void printAllBooks(){
		Iterator<Book> itr = bookSet.iterator();
		while (itr.hasNext()){
			Book b = (Book)itr.next();
			System.out.println(b);
		}
	}
	public Set<Book> returnACopyOfBooks(){
		Set<Book> bookSetCopy = new HashSet<Book>();
		Iterator<Book> itr = bookSet.iterator();
		while(itr.hasNext()){
			Book b1 = (Book)itr.next();
			bookSetCopy.add(b1);
		}
		return bookSetCopy;
	}
}
