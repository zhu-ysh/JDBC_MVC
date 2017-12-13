package dao;

import java.sql.Timestamp;
import java.util.ArrayList;

import dao.Dao;
import entity.Book;

public interface BookDao extends Dao<Book>{
	public ArrayList<Book> selectByTime(Timestamp start,Timestamp end);
}
