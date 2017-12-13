package dao;

public class DaoFactory {
	private static CustomDao customDao;
	
	
	//静态Dao生产工厂
	public static CustomDao getCustomDaoInstance(){
		if(null == customDao){
			customDao = new CustomDaoImpl();
		}
		return customDao;
	}
	
	//非静态工厂
	/*public static CustomDao getCustomDaoInstance(){
		return new CustomDaoImpl();
	}*/
}

