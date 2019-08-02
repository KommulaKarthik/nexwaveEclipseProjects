package com.virtusa.collections.assignment;

public class Book {
	
	private String title;
	private String authorName;
	private long isbn;
	public Book(String title, String authorName, long isbn) {
		super();
		this.title = title;
		this.authorName = authorName;
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", authorName=" + authorName + ", isbn=" + isbn + "]";
	}
	
	
	

}
