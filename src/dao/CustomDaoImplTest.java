package dao;

import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;

import org.junit.Test;

import entity.Custom;

public class CustomDaoImplTest {

	@Test
	public void testSave() {
		CustomDao cdi = DaoFactory.getCustomDaoInstance();
		Custom custom = new Custom();
		custom.setId(new BigDecimal(5));
		custom.setName("zhangsan");
		custom.setPassword("123456");
		Timestamp ts = new Timestamp(2000,1,1,1,1,1,1);
		custom.setBirthday(ts);
		custom.setAddress("¥Û¡¨");
		cdi.save(custom);
	}

	@Test
	public void testDelete() {
		CustomDao cdi = DaoFactory.getCustomDaoInstance();
		Custom custom = new Custom();
		custom.setId(new BigDecimal(1));
		cdi.delete(custom);
	}

	@Test
	public void testUpdate() {
		CustomDao cdi = DaoFactory.getCustomDaoInstance();
		Custom custom = new Custom();
		custom.setId(new BigDecimal(5));
		custom.setName("lisi");
		custom.setPassword("123");
		Timestamp ts = new Timestamp(1998,1,1,1,1,1,1);
		custom.setBirthday(ts);
		custom.setAddress("…Ú—Ù");
		cdi.update(custom);
	}

	@Test
	public void testSelectById() {
		CustomDao cdi = DaoFactory.getCustomDaoInstance();
		Custom custom = cdi.selectById(new BigDecimal(1));
		System.out.println(custom);
	}

	@Test
	public void testSelectAll() {
		CustomDao cdi = DaoFactory.getCustomDaoInstance();
		ArrayList<Custom> customs = cdi.selectAll();
		System.out.println(customs);
	}

	@Test
	public void testSelectByName() {
		CustomDao cdi = DaoFactory.getCustomDaoInstance();
		ArrayList<Custom> customs = cdi.selectByName("lisi");
		System.out.println(customs);
	}

}
