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
	
	
	
}
