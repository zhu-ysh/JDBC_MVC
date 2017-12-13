package dao;

public class DaoFactory {
	private static CustomDao customDao;
	
	
	//��̬Dao��������
	public static CustomDao getCustomDaoInstance(){
		if(null == customDao){
			customDao = new CustomDaoImpl();
		}
		return customDao;
	}
	
	//�Ǿ�̬����
	/*public static CustomDao getCustomDaoInstance(){
		return new CustomDaoImpl();
	}*/
}

