package com.itjeon.study.designPattern.iterator;

public class BookShelf implements Aggregate<Book> {

	private Book[] books;
	private int last = 0;
	
	public BookShelf(int maxsize){
		this.books = new Book[maxsize];
	}
	
	public Book getBookAt(int index){
		return books[index];
	}
	
	public void apppendBook(Book book){
		this.books[last] = book;
		last++;
	}
	
	public int getLength(){
		return last;
	}
	
	public Iterator<Book> iterator() {
		return new BookShelfIterator(this);
	}

	
}
