package dao;

import java.util.ArrayList;

import entity.Custom;

//Custom ���Dao�ӿ�
public interface CustomDao extends Dao<Custom>{
	//��Dao������չ����ķ���
	//�������ֲ�ѯ
	public ArrayList<Custom> selectByName(String name);
}
