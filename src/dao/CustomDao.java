package dao;

import java.util.ArrayList;

import entity.Custom;

//Custom 表的Dao接口
public interface CustomDao extends Dao<Custom>{
	//子Dao可以扩展更多的方法
	//根据名字查询
	public ArrayList<Custom> selectByName(String name);
}
