package dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entity.Custom;
import util.DBUtil;

public class CustomDaoImpl implements CustomDao {
	
	//声明一个连接
	private Connection conn = DBUtil.getConnection();

	@Override
	public void save(Custom t) {
		String sql = "insert into custom values(?,?,?,?,?)";
		PreparedStatement ps = null;
		
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setBigDecimal(1, t.getId());
			ps.setString(2, t.getName());
			ps.setString(3, t.getPassword());
			ps.setTimestamp(4, t.getBirthday());
			ps.setString(5, t.getAddress());
			
			int row = ps.executeUpdate();
			System.out.println("添加用户成功");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("添加用户失败");
		}finally{
			if(null!=ps){
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

	@Override
	public void delete(Custom t) {
		String sql = "delete from custom where id=?";
		PreparedStatement ps = null;
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setBigDecimal(1, t.getId());
			ps.executeUpdate();
			System.out.println("删除成功");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("删除失败!!!");
		}finally{
			if(null != ps){
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void update(Custom t) {
		String sql = "update custom set name=?,password=?,birthday=?,address=? where id=?";
		PreparedStatement ps = null;
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, t.getName());
			ps.setString(2, t.getPassword());
			ps.setTimestamp(3, t.getBirthday());
			ps.setString(4, t.getAddress());
			ps.setBigDecimal(5, t.getId());
			
			int row = ps.executeUpdate();
			conn.commit();
			System.out.println("更新用户成功");
		} catch (SQLException e) {
			System.out.println("更新用户失败");
		}finally{
			if(null!=ps){
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	@Override
	public Custom selectById(BigDecimal id) {
		String sql = "select * from custom where id=?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setBigDecimal(1, id);
			rs = ps.executeQuery();
			if(rs.next()){
				Custom cus = new Custom();
				cus.setId(rs.getBigDecimal(1));
				cus.setName(rs.getString(2));
				cus.setPassword(rs.getString(3));
				cus.setBirthday(rs.getTimestamp(4));
				cus.setAddress(rs.getString(5));
				return cus;
			}
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			if (null!=rs) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(null!=ps){
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public ArrayList<Custom> selectAll() {
		String sql = "select * from custom";
		PreparedStatement ps = null;
		ResultSet set = null;
		ArrayList<Custom> customs = new ArrayList<Custom>();
		
		try {
			ps = conn.prepareStatement(sql);
			set = ps.executeQuery();
			while(set.next()){
				Custom cus = new Custom();
				cus.setId(set.getBigDecimal(1));
				cus.setName(set.getString(2));
				cus.setPassword(set.getString(3));
				cus.setBirthday(set.getTimestamp(4));
				cus.setAddress(set.getString(5));
				customs.add(cus);
			}
			return customs;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			if (null!=set) {
				try {
					set.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(null!=ps){
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public ArrayList<Custom> selectByName(String name) {
		String sql = "select * from custom where name=?";
		PreparedStatement ps = null;
		ResultSet set = null;
		ArrayList<Custom> customs = new ArrayList<Custom>();
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			set = ps.executeQuery();
			while(set.next()){
				Custom cus = new Custom();
				cus.setId(set.getBigDecimal(1));
				cus.setName(set.getString(2));
				cus.setPassword(set.getString(3));
				cus.setBirthday(set.getTimestamp(4));
				cus.setAddress(set.getString(5));
				customs.add(cus);
			}
			return customs;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			if (null!=set) {
				try {
					set.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(null!=ps){
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
