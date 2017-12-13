package dao;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;

import org.junit.Test;

import entity.Book;

public class BookDaoImplTest {
	private BookDaoImpl bdi = new BookDaoImpl();
	Book book = new Book();
	
	@Test
	public void testSave() {
		book.setBookId(new BigDecimal(4));
		book.setBookName("¾ÞÈËµÄÔÉÂä");
		book.setBookAuthor("¿Ï¡¤¸£À³ÌØ");
		book.setBookTime(new Timestamp(2016-1900,4,30,12,0,0,0));
		bdi.save(book);
	}

	@Test
	public void testDelete() {
		book.setBookId(new BigDecimal(4));
		bdi.delete(book);
	}

	@Test
	public void testUpdate() {
		book.setBookId(new BigDecimal(2));
		book.setBookName("°×Ò¹ÐÐ");
		book.setBookAuthor("¶«Ò°¹çÎá");
		book.setBookTime(new Timestamp(1999-1900,8,15,12,0,0,0));
		bdi.update(book);
	}

	@Test
	public void testSelectById() {
		Book book =  bdi.selectById(new BigDecimal(1));
		System.out.println(book);
	}

	@Test
	public void testSelectAll() {
		ArrayList<Book> books = bdi.selectAll();
		System.out.println(books);
	}

	@Test
	public void testSelectByTime() {
		Timestamp start = new Timestamp(1900-1900,8,15,12,0,0,0);
		Timestamp end = new Timestamp(2000-1900,8,15,12,0,0,0);
		
		ArrayList<Book> books = bdi.selectByTime(start, end);
		System.out.println(books);
	}

}
