package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.NamingException;

import util.ConnectionPool;

public class Mandal_goalDAO2 {

	public boolean updategoal01(String id,String MG_no,String goal01) throws NamingException, SQLException {
		Connection conn = ConnectionPool.get(); 
		PreparedStatement stmt = null;
		try {
			String sql = "UPDATE mandal_goal SET goal01=? WHERE id=? and MG_no=?";
			
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, goal01);
			stmt.setString(2, id);
			stmt.setString(3, MG_no);
			int count = stmt.executeUpdate();
			return (count == 1) ? true : false;
		} finally {
		if (stmt != null) stmt.close();
		if (conn != null) conn.close(); 
		}
	}

	public boolean updategoal02(String id,String MG_no,String goal02) throws NamingException, SQLException {
		Connection conn = ConnectionPool.get(); 
		PreparedStatement stmt = null;
		try {
			String sql = "UPDATE mandal_goal SET goal02=? WHERE id=? and MG_no=?";
			
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, goal02);
			stmt.setString(2, id);
			stmt.setString(3, MG_no);
			int count = stmt.executeUpdate();
			return (count == 1) ? true : false;
		} finally {
		if (stmt != null) stmt.close();
		if (conn != null) conn.close(); 
		}
	}
	
	public boolean updategoal03(String id,String MG_no,String goal03) throws NamingException, SQLException {
		Connection conn = ConnectionPool.get(); 
		PreparedStatement stmt = null;
		try {
			String sql = "UPDATE mandal_goal SET goal03=? WHERE id=? and MG_no=?";
			
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, goal03);
			stmt.setString(2, id);
			stmt.setString(3, MG_no);
			int count = stmt.executeUpdate();
			return (count == 1) ? true : false;
		} finally {
		if (stmt != null) stmt.close();
		if (conn != null) conn.close(); 
		}
	}
	
	public boolean updategoal04(String id,String MG_no,String goal04) throws NamingException, SQLException {
		Connection conn = ConnectionPool.get(); 
		PreparedStatement stmt = null;
		try {
			String sql = "UPDATE mandal_goal SET goal04=? WHERE id=? and MG_no=?";
			
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, goal04);
			stmt.setString(2, id);
			stmt.setString(3, MG_no);
			int count = stmt.executeUpdate();
			return (count == 1) ? true : false;
		} finally {
		if (stmt != null) stmt.close();
		if (conn != null) conn.close(); 
		}
	}
	
	public boolean updategoal05(String id,String MG_no,String goal05) throws NamingException, SQLException {
		Connection conn = ConnectionPool.get(); 
		PreparedStatement stmt = null;
		try {
			String sql = "UPDATE mandal_goal SET goal05=? WHERE id=? and MG_no=?";
			
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, goal05);
			stmt.setString(2, id);
			stmt.setString(3, MG_no);
			int count = stmt.executeUpdate();
			return (count == 1) ? true : false;
		} finally {
		if (stmt != null) stmt.close();
		if (conn != null) conn.close(); 
		}
	}
	
	public boolean updategoal06(String id,String MG_no,String goal06) throws NamingException, SQLException {
		Connection conn = ConnectionPool.get(); 
		PreparedStatement stmt = null;
		try {
			String sql = "UPDATE mandal_goal SET goal06=? WHERE id=? and MG_no=?";
			
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, goal06);
			stmt.setString(2, id);
			stmt.setString(3, MG_no);
			int count = stmt.executeUpdate();
			return (count == 1) ? true : false;
		} finally {
		if (stmt != null) stmt.close();
		if (conn != null) conn.close(); 
		}
	}
	
	public boolean updategoal07(String id,String MG_no,String goal07) throws NamingException, SQLException {
		Connection conn = ConnectionPool.get(); 
		PreparedStatement stmt = null;
		try {
			String sql = "UPDATE mandal_goal SET goal07=? WHERE id=? and MG_no=?";
			
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, goal07);
			stmt.setString(2, id);
			stmt.setString(3, MG_no);
			int count = stmt.executeUpdate();
			return (count == 1) ? true : false;
		} finally {
		if (stmt != null) stmt.close();
		if (conn != null) conn.close(); 
		}
	}
	
	public boolean updategoal08(String id,String MG_no,String goal08) throws NamingException, SQLException {
		Connection conn = ConnectionPool.get(); 
		PreparedStatement stmt = null;
		try {
			String sql = "UPDATE mandal_goal SET goal08=? WHERE id=? and MG_no=?";
			
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, goal08);
			stmt.setString(2, id);
			stmt.setString(3, MG_no);
			int count = stmt.executeUpdate();
			return (count == 1) ? true : false;
		} finally {
		if (stmt != null) stmt.close();
		if (conn != null) conn.close(); 
		}
	}
}
