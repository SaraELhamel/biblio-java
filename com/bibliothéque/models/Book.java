package com.bibliothéque.models;

public class Book {

	private String title;
	private String author;
	private int price;
	
	public Book()
	{
		
	}
	
	public Book(String title, String author, int price)
	{
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	@Override
	public String toString()
	{
		return "\t Title : "+ this.title +"\t Author : "+ this.author +"\t Price : "+ this.price;
	}

}
