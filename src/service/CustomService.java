package service;

import java.util.ArrayList;

import entity.Custom;

public interface CustomService extends Service<Custom>{
	//Ìí¼Ó
	public ArrayList<Custom> selectByName(String name);
}
