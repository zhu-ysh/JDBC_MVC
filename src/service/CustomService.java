package service;

import java.util.ArrayList;

import entity.Custom;

public interface CustomService extends Service<Custom>{
	//���
	public ArrayList<Custom> selectByName(String name);
}
