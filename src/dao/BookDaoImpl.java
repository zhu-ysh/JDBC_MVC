package dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import entity.Book;
import util.DBUtil;

public class BookDaoImpl implements BookDao {

	private Connection conn = DBUtil.getConnection();
	
	@Override
	public void save(Book t) {
		String sql = "insert into book values(?,?,?,?)";
		PreparedStatement ps = null;
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setBigDecimal(1, t.getBookId());
			ps.setString(2, t.getBookName());
			ps.setString(3, t.getBookAuthor());
			ps.setTimestamp(4, t.getBookTime());
			int row = ps.executeUpdate();
			System.out.println("新增成功");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("新增失败");
		} finally{
			if(null!=ps){
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void delete(Book t) {
		String sql = "delete from book where book_id = ?";
		PreparedStatement ps = null;
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setBigDecimal(1, t.getBookId());
			ps.executeUpdate();
			System.out.println("删除成功");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("删除失败");
		} finally {
			if(null != ps){
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void update(Book t) {
		String sql = "update book set book_name = ?,book_author=?,book_time=? where book_id = ?";
		PreparedStatement ps = null;
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, t.getBookName());
			ps.setString(2, t.getBookAuthor());
			ps.setTimestamp(3, t.getBookTime());
			ps.setBigDecimal(4, t.getBookId());
			ps.executeUpdate();
			System.out.println("更新成功");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("更新失败");
		} finally {
			if(null != ps){
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

	@Override
	public Book selectById(BigDecimal id) {
		String sql = "select * from book where book_id = ?";
		PreparedStatement ps  = null;
		ResultSet res = null;
		
		try {
			ps= conn.prepareStatement(sql);
			ps.setBigDecimal(1, id);
			res = ps.executeQuery();
			if(res.next()){
				Book book = new Book();
				book.setBookId(res.getBigDecimal(1));
				book.setBookName(res.getString(2));
				book.setBookAuthor(res.getString(3));
				book.setBookTime(res.getTimestamp(4));
				return book;
			}
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			if(null != res){
				try {
					res.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(null != ps){
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public ArrayList<Book> selectAll() {
		String sql = "select * from book";
		PreparedStatement ps  = null;
		ResultSet res = null;
		
		try {
			ps= conn.prepareStatement(sql);
			res = ps.executeQuery();
			ArrayList<Book> books = new ArrayList<Book>();
			while(res.next()){
				Book book = new Book();
				book.setBookId(res.getBigDecimal(1));
				book.setBookName(res.getString(2));
				book.setBookAuthor(res.getString(3));
				book.setBookTime(res.getTimestamp(4));
				books.add(book);
			}
			return books;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			if(null != res){
				try {
					res.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(null != ps){
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public ArrayList<Book> selectByTime(Timestamp start, Timestamp end) {
		String sql = "select * from book where book_time between ? and ?";
		PreparedStatement ps = null;
		ResultSet res = null;
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setTimestamp(1, start);
			ps.setTimestamp(2, end);
			res = ps.executeQuery();
			ArrayList<Book> books = new ArrayList<Book>();
			while(res.next()){
				Book book = new Book();
				book.setBookId(res.getBigDecimal(1));
				book.setBookName(res.getString(2));
				book.setBookAuthor(res.getString(3));
				book.setBookTime(res.getTimestamp(4));
				books.add(book);
			}
			return books;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			if(null != res){
				try {
					res.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(null != ps){
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
