package dao;

import java.math.BigDecimal;
import java.util.ArrayList;

public interface Dao <T>{
	//��
	public void save(T t);
	//ɾ
	public void delete(T t);
	//��
	public void update(T t);
	//��һ��
	public T selectById(BigDecimal id);
	//������
	public ArrayList<T> selectAll();
}
