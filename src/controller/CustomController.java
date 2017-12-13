package controller;

import java.math.BigDecimal;
import java.util.ArrayList;

import entity.Custom;
import service.CustomService;
import service.CustomServiceImpl;

public class CustomController {
	private CustomService customService = new CustomServiceImpl();
	
	public void save(Custom t) {
		customService.save(t);
	}

	public void delete(Custom t) {
		customService.delete(t);
	}

	public void update(Custom t) {
		customService.update(t);
	}

	public Custom selectById(BigDecimal id) {
		return customService.selectById(id);
	}

	public ArrayList<Custom> selectAll() {
		return customService.selectAll();
	}

	public ArrayList<Custom> selectByName(String name) {
		return customService.selectByName(name);
	}
}
