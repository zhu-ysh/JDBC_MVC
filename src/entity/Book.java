package entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Book {
	private BigDecimal bookId;
	private String bookName;
	private String bookAuthor;
	private Timestamp bookTime;
	public BigDecimal getBookId() {
		return bookId;
	}
	public void setBookId(BigDecimal bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public Timestamp getBookTime() {
		return bookTime;
	}
	public void setBookTime(Timestamp bookTime) {
		this.bookTime = bookTime;
	}
	public Book() {
		super();
	}
	public Book(BigDecimal bookId, String bookName, String bookAuthor, Timestamp bookTime) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookTime = bookTime;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookTime="
				+ bookTime + "]";
	}
}
