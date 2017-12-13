package dao;

import java.math.BigDecimal;
import java.util.ArrayList;

public interface Dao <T>{
	//增
	public void save(T t);
	//删
	public void delete(T t);
	//改
	public void update(T t);
	//查一个
	public T selectById(BigDecimal id);
	//查所有
	public ArrayList<T> selectAll();
}
