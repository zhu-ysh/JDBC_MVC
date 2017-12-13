package view;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Scanner;

import controller.CustomController;
import entity.Custom;

public class CustomView {
	CustomController customController = new CustomController();
	
	
	Scanner scan = new Scanner(System.in);
	public void initView(){
		System.out.println("------------!客户管理系统!---------");
		System.out.println("			1.添加客户			");
		System.out.println("			2.删除客户			");
		System.out.println("			3.修改客户			");
		System.out.println("			4.ID查询客户			");
		System.out.println("			5.Name查询客户		");
		System.out.println("			6.查询所有客户			");
		System.out.println("			7.退出				");
		System.out.println("--------------------------------");
	}
	
	public void save(){
		Custom custom = new Custom();
		custom.setId(new BigDecimal(5));
		custom.setName("zhangsan");
		custom.setPassword("123456");
		Timestamp ts = new Timestamp(2000,1,1,1,1,1,1);
		custom.setBirthday(ts);
		custom.setAddress("大连");
		customController.save(custom);
	}
	public void delete(){
		Custom custom = new Custom();
		custom.setId(new BigDecimal(5));
		customController.delete(custom);
	}
	public void update(){
		Custom custom = new Custom();
		custom.setId(new BigDecimal(5));
		custom.setName("lisi");
		custom.setPassword("123");
		Timestamp ts = new Timestamp(1998,1,1,1,1,1,1);
		custom.setBirthday(ts);
		custom.setAddress("沈阳");
		customController.update(custom);
	}
	public void selectById(){
		Custom custom = customController.selectById(new BigDecimal(5));
		System.out.println(custom);
	}
	public void selectByName(){
		ArrayList<Custom> customs = customController.selectByName("lisi");
		System.out.println(customs);
	}
	public void selectAll(){
		ArrayList<Custom> customs = customController.selectAll();
		System.out.println(customs);
	}
	
	
	public static void main(String[] args){
		CustomView cv = new CustomView();
		while(true){
			cv.initView();
			System.out.println("请输入选项:");
			int choose = cv.scan.nextInt();
			switch(choose){
			case 1:cv.save();break;
			case 2:cv.delete();break;
			case 3:cv.update();break;
			case 4:cv.selectById();break;
			case 5:cv.selectByName();break;
			case 6:cv.selectAll();break;
			case 7:System.out.println("再见~!");return;
				default:System.out.println("输入有误请重新输入");
			}
		}
	}
}
