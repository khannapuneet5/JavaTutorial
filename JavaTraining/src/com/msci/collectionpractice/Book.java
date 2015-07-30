package com.msci.collectionpractice;

public class Book {
	private String title;
	private double price;
	private String author;
	
	public Book(String theTitle, double thePrice, String theAuthor){
		this.title = theTitle;
		this.price = thePrice;
		this.author = theAuthor;
	}
	
	public String toString(){
		return "Author : " + getAuthor() + ", Price : " + getPrice() + ", Title: " + getTitle();
	}
	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

	public String getAuthor() {
		return author;
	}
	
	
}
