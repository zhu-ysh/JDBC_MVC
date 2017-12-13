package service;

import java.math.BigDecimal;
import java.util.ArrayList;

import dao.CustomDao;
import dao.DaoFactory;
import entity.Custom;

public class CustomServiceImpl implements CustomService {
	
	//ÓÐÒ»¸öDao
	private CustomDao customDao = DaoFactory.getCustomDaoInstance();
	@Override
	public void save(Custom t) {
		customDao.save(t);
	}

	@Override
	public void delete(Custom t) {
		customDao.delete(t);
	}

	@Override
	public void update(Custom t) {
		customDao.update(t);
	}

	@Override
	public Custom selectById(BigDecimal id) {
		return customDao.selectById(id);
	}

	@Override
	public ArrayList<Custom> selectAll() {
		return customDao.selectAll();
	}

	@Override
	public ArrayList<Custom> selectByName(String name) {
		return customDao.selectByName(name);
	}

}
