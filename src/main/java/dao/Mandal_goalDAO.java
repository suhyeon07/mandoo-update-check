package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.NamingException;

import util.ConnectionPool;

public class Mandal_goalDAO {
	public boolean insert(String uid) throws NamingException, SQLException {
		Connection conn = ConnectionPool.get(); 
		PreparedStatement stmt = null;
		try {
			String sql = "INSERT INTO mandal(id) VALUES(?)";
		
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, uid);
			int count = stmt.executeUpdate();
			return (count == 1) ? true : false;
		} finally {
		if (stmt != null) stmt.close();
		if (conn != null) conn.close(); 
		}
	}
	
	public boolean updateFG(String uid, String FG) throws NamingException, SQLException {
		Connection conn = ConnectionPool.get(); 
		PreparedStatement stmt = null;
		try {
			String sql = "UPDATE mandal SET FG=? WHERE id =? ";
		
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, FG);
			stmt.setString(2, uid);
			
			int count = stmt.executeUpdate();
			return (count == 1) ? true : false;
		} finally {
		if (stmt != null) stmt.close();
		if (conn != null) conn.close(); 
		}
	}
	
	public boolean updateMG(String uid,String MG01,String MG02,String MG03,String MG04,String MG05,String MG06,String MG07,String MG08) throws NamingException, SQLException {
		Connection conn = ConnectionPool.get(); 
		PreparedStatement stmt = null;
		try {
			String sql = "UPDATE mandal SET MG01=?,MG02=?,MG03=?,MG04=?,MG05=?,MG06=?,MG07=?,MG08=? WHERE id =? ";
		
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, MG01);
			stmt.setString(2, MG02);
			stmt.setString(3, MG03);
			stmt.setString(4, MG04);
			stmt.setString(5, MG05);
			stmt.setString(6, MG06);
			stmt.setString(7, MG07);
			stmt.setString(8, MG08);
			stmt.setString(9, uid);
			
			int count = stmt.executeUpdate();
			return (count == 1) ? true : false;
		} finally {
		if (stmt != null) stmt.close();
		if (conn != null) conn.close(); 
		}
	}
	
	public boolean updategoal01(String uid,String MG_no,String goal01) throws NamingException, SQLException {
		Connection conn = ConnectionPool.get(); 
		PreparedStatement stmt = null;
		try {
			String sql = "UPDATE mandal_goal SET MG_no=?,goal01=? WHERE id =? ";
		
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, MG_no);
			stmt.setString(2, goal01);
			stmt.setString(3, uid);
			
			int count = stmt.executeUpdate();
			return (count == 1) ? true : false;
		} finally {
		if (stmt != null) stmt.close();
		if (conn != null) conn.close(); 
		}
	}
	
	public boolean updategoal02(String uid,String MG_no,String goal02) throws NamingException, SQLException {
		Connection conn = ConnectionPool.get(); 
		PreparedStatement stmt = null;
		try {
			String sql = "UPDATE mandal_goal SET MG_no=?,goal02=? WHERE id =? ";
		
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, MG_no);
			stmt.setString(2, goal02);
			stmt.setString(3, uid);
			
			int count = stmt.executeUpdate();
			return (count == 1) ? true : false;
		} finally {
		if (stmt != null) stmt.close();
		if (conn != null) conn.close(); 
		}
	}
	
	public boolean updategoal03(String uid,String MG_no,String goal03) throws NamingException, SQLException {
		Connection conn = ConnectionPool.get(); 
		PreparedStatement stmt = null;
		try {
			String sql = "UPDATE mandal_goal SET MG_no=?,goal03=? WHERE id =? ";
		
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, MG_no);
			stmt.setString(2, goal03);
			stmt.setString(3, uid);
			
			int count = stmt.executeUpdate();
			return (count == 1) ? true : false;
		} finally {
		if (stmt != null) stmt.close();
		if (conn != null) conn.close(); 
		}
	}
	
	public boolean updategoal04(String uid,String MG_no,String goal04) throws NamingException, SQLException {
		Connection conn = ConnectionPool.get(); 
		PreparedStatement stmt = null;
		try {
			String sql = "UPDATE mandal_goal SET MG_no=?,goal04=? WHERE id =? ";
		
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, MG_no);
			stmt.setString(2, goal04);
			stmt.setString(3, uid);
			
			int count = stmt.executeUpdate();
			return (count == 1) ? true : false;
		} finally {
		if (stmt != null) stmt.close();
		if (conn != null) conn.close(); 
		}
	}
	
	public boolean updategoal05(String uid,String MG_no,String goal05) throws NamingException, SQLException {
		Connection conn = ConnectionPool.get(); 
		PreparedStatement stmt = null;
		try {
			String sql = "UPDATE mandal_goal SET MG_no=?,goal05=? WHERE id =? ";
		
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, MG_no);
			stmt.setString(2, goal05);
			stmt.setString(3, uid);
			
			int count = stmt.executeUpdate();
			return (count == 1) ? true : false;
		} finally {
		if (stmt != null) stmt.close();
		if (conn != null) conn.close(); 
		}
	}
	
	public boolean updategoal06(String uid,String MG_no,String goal06) throws NamingException, SQLException {
		Connection conn = ConnectionPool.get(); 
		PreparedStatement stmt = null;
		try {
			String sql = "UPDATE mandal_goal SET MG_no=?,goal06=? WHERE id =? ";
		
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, MG_no);
			stmt.setString(2, goal06);
			stmt.setString(3, uid);
			
			int count = stmt.executeUpdate();
			return (count == 1) ? true : false;
		} finally {
		if (stmt != null) stmt.close();
		if (conn != null) conn.close(); 
		}
	}
	
	public boolean updategoal07(String uid,String MG_no,String goal07) throws NamingException, SQLException {
		Connection conn = ConnectionPool.get(); 
		PreparedStatement stmt = null;
		try {
			String sql = "UPDATE mandal_goal SET MG_no=?,goal07=? WHERE id =? ";
		
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, MG_no);
			stmt.setString(2, goal07);
			stmt.setString(3, uid);
			
			int count = stmt.executeUpdate();
			return (count == 1) ? true : false;
		} finally {
		if (stmt != null) stmt.close();
		if (conn != null) conn.close(); 
		}
	}
	
	public boolean updategoal08(String uid,String MG_no,String goal08) throws NamingException, SQLException {
		Connection conn = ConnectionPool.get(); 
		PreparedStatement stmt = null;
		try {
			String sql = "UPDATE mandal_goal SET MG_no=?,goal08=? WHERE id =? ";
		
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, MG_no);
			stmt.setString(2, goal08);
			stmt.setString(3, uid);
			
			int count = stmt.executeUpdate();
			return (count == 1) ? true : false;
		} finally {
		if (stmt != null) stmt.close();
		if (conn != null) conn.close(); 
		}
	}
	
}
