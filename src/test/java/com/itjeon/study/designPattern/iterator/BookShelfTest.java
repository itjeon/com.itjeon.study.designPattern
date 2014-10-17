package com.itjeon.study.designPattern.iterator;

import junit.framework.TestCase;

import org.junit.BeforeClass;
import org.junit.Test;

public class BookShelfTest extends TestCase {
	
	BookShelf bookShelf;
	
	@BeforeClass
	public void setUp(){
		bookShelf = new BookShelf(4);
		bookShelf.apppendBook(new Book("Around the World in 80 Days"));
		bookShelf.apppendBook(new Book("Bible"));
		bookShelf.apppendBook(new Book("Cinderella"));
		bookShelf.apppendBook(new Book("Daddy-Long-Legs"));
	}
	
	@Test
	public void testGetLength(){
		assertNotNull(bookShelf);
		assertEquals(4, bookShelf.getLength());
	}
	
	@Test
	public void testGetAt(){
		assertEquals("Cinderella", bookShelf.getBookAt(2).getName());
	}

}
