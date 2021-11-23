package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	public boolean insertMG_no01(String uid) throws NamingException, SQLException {
		Connection conn = ConnectionPool.get(); 
		PreparedStatement stmt = null;
		try {
			String sql = "INSERT INTO mandal_goal(id,MG_no) VALUES(?,?)";
		
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, uid);
			stmt.setString(2, "1");
			int count = stmt.executeUpdate();
			return (count == 1) ? true : false;
		} finally {
		if (stmt != null) stmt.close();
		if (conn != null) conn.close(); 
		}
	}
	public boolean insertMG_no02(String uid) throws NamingException, SQLException {
		Connection conn = ConnectionPool.get(); 
		PreparedStatement stmt = null;
		try {
			String sql = "INSERT INTO mandal_goal(id,MG_no) VALUES(?,?)";
		
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, uid);
			stmt.setString(2, "2");
			int count = stmt.executeUpdate();
			return (count == 1) ? true : false;
		} finally {
		if (stmt != null) stmt.close();
		if (conn != null) conn.close(); 
		}
	}
	public boolean insertMG_no03(String uid) throws NamingException, SQLException {
		Connection conn = ConnectionPool.get(); 
		PreparedStatement stmt = null;
		try {
			String sql = "INSERT INTO mandal_goal(id,MG_no) VALUES(?,?)";
		
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, uid);
			stmt.setString(2, "3");
			int count = stmt.executeUpdate();
			return (count == 1) ? true : false;
		} finally {
		if (stmt != null) stmt.close();
		if (conn != null) conn.close(); 
		}
	}
	public boolean insertMG_no04(String uid) throws NamingException, SQLException {
		Connection conn = ConnectionPool.get(); 
		PreparedStatement stmt = null;
		try {
			String sql = "INSERT INTO mandal_goal(id,MG_no) VALUES(?,?)";
		
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, uid);
			stmt.setString(2, "4");
			int count = stmt.executeUpdate();
			return (count == 1) ? true : false;
		} finally {
		if (stmt != null) stmt.close();
		if (conn != null) conn.close(); 
		}
	}
	public boolean insertMG_no05(String uid) throws NamingException, SQLException {
		Connection conn = ConnectionPool.get(); 
		PreparedStatement stmt = null;
		try {
			String sql = "INSERT INTO mandal_goal(id,MG_no) VALUES(?,?)";
		
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, uid);
			stmt.setString(2, "5");
			int count = stmt.executeUpdate();
			return (count == 1) ? true : false;
		} finally {
		if (stmt != null) stmt.close();
		if (conn != null) conn.close(); 
		}
	}
	public boolean insertMG_no06(String uid) throws NamingException, SQLException {
		Connection conn = ConnectionPool.get(); 
		PreparedStatement stmt = null;
		try {
			String sql = "INSERT INTO mandal_goal(id,MG_no) VALUES(?,?)";
		
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, uid);
			stmt.setString(2, "6");
			int count = stmt.executeUpdate();
			return (count == 1) ? true : false;
		} finally {
		if (stmt != null) stmt.close();
		if (conn != null) conn.close(); 
		}
	}
	public boolean insertMG_no07(String uid) throws NamingException, SQLException {
		Connection conn = ConnectionPool.get(); 
		PreparedStatement stmt = null;
		try {
			String sql = "INSERT INTO mandal_goal(id,MG_no) VALUES(?,?)";
		
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, uid);
			stmt.setString(2, "7");
			int count = stmt.executeUpdate();
			return (count == 1) ? true : false;
		} finally {
		if (stmt != null) stmt.close();
		if (conn != null) conn.close(); 
		}
	}
	public boolean insertMG_no08(String uid) throws NamingException, SQLException {
		Connection conn = ConnectionPool.get(); 
		PreparedStatement stmt = null;
		try {
			String sql = "INSERT INTO mandal_goal(id,MG_no) VALUES(?,?)";
		
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, uid);
			stmt.setString(2, "8");
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
	
	public String getMG01(String uid) throws NamingException, SQLException { 
		Connection conn = ConnectionPool.get();
		PreparedStatement stmt = null;
		ResultSet rs = null;
	
		try {
		String sql = "SELECT MG01 FROM mandal WHERE id = ?"; 
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, uid);
		rs = stmt.executeQuery();
		
		return rs.next() ? rs.getString("MG01") : "{}";
		
		} finally {
			if (rs != null) rs.close();
			if (stmt != null) stmt.close(); 
			if (conn != null) conn.close();
		}
	}
	public String getMG02(String uid) throws NamingException, SQLException { 
		Connection conn = ConnectionPool.get();
		PreparedStatement stmt = null;
		ResultSet rs = null;
	
		try {
		String sql = "SELECT MG02 FROM mandal WHERE id = ?"; 
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, uid);
		rs = stmt.executeQuery();
		
		return rs.next() ? rs.getString("MG02") : "{}";
		
		} finally {
			if (rs != null) rs.close();
			if (stmt != null) stmt.close(); 
			if (conn != null) conn.close();
		}
	}
	public String getMG03(String uid) throws NamingException, SQLException { 
		Connection conn = ConnectionPool.get();
		PreparedStatement stmt = null;
		ResultSet rs = null;
	
		try {
		String sql = "SELECT MG03 FROM mandal WHERE id = ?"; 
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, uid);
		rs = stmt.executeQuery();
		
		return rs.next() ? rs.getString("MG03") : "{}";
		
		} finally {
			if (rs != null) rs.close();
			if (stmt != null) stmt.close(); 
			if (conn != null) conn.close();
		}
	}
	public String getMG04(String uid) throws NamingException, SQLException { 
		Connection conn = ConnectionPool.get();
		PreparedStatement stmt = null;
		ResultSet rs = null;
	
		try {
		String sql = "SELECT MG04 FROM mandal WHERE id = ?"; 
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, uid);
		rs = stmt.executeQuery();
		
		return rs.next() ? rs.getString("MG04") : "{}";
		
		} finally {
			if (rs != null) rs.close();
			if (stmt != null) stmt.close(); 
			if (conn != null) conn.close();
		}
	}
	public String getMG05(String uid) throws NamingException, SQLException { 
		Connection conn = ConnectionPool.get();
		PreparedStatement stmt = null;
		ResultSet rs = null;
	
		try {
		String sql = "SELECT MG05 FROM mandal WHERE id = ?"; 
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, uid);
		rs = stmt.executeQuery();
		
		return rs.next() ? rs.getString("MG05") : "{}";
		
		} finally {
			if (rs != null) rs.close();
			if (stmt != null) stmt.close(); 
			if (conn != null) conn.close();
		}
	}
	public String getMG06(String uid) throws NamingException, SQLException { 
		Connection conn = ConnectionPool.get();
		PreparedStatement stmt = null;
		ResultSet rs = null;
	
		try {
		String sql = "SELECT MG06 FROM mandal WHERE id = ?"; 
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, uid);
		rs = stmt.executeQuery();
		
		return rs.next() ? rs.getString("MG06") : "{}";
		
		} finally {
			if (rs != null) rs.close();
			if (stmt != null) stmt.close(); 
			if (conn != null) conn.close();
		}
	}
	public String getMG07(String uid) throws NamingException, SQLException { 
		Connection conn = ConnectionPool.get();
		PreparedStatement stmt = null;
		ResultSet rs = null;
	
		try {
		String sql = "SELECT MG07 FROM mandal WHERE id = ?"; 
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, uid);
		rs = stmt.executeQuery();
		
		return rs.next() ? rs.getString("MG07") : "{}";
		
		} finally {
			if (rs != null) rs.close();
			if (stmt != null) stmt.close(); 
			if (conn != null) conn.close();
		}
	}
	public String getMG08(String uid) throws NamingException, SQLException { 
		Connection conn = ConnectionPool.get();
		PreparedStatement stmt = null;
		ResultSet rs = null;
	
		try {
		String sql = "SELECT MG08 FROM mandal WHERE id = ?"; 
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, uid);
		rs = stmt.executeQuery();
		
		return rs.next() ? rs.getString("MG08") : "{}";
		
		} finally {
			if (rs != null) rs.close();
			if (stmt != null) stmt.close(); 
			if (conn != null) conn.close();
		}
	}

	
	public String getgoal01(String uid,String MG_no) throws NamingException, SQLException { 
		Connection conn = ConnectionPool.get();
		PreparedStatement stmt = null;
		ResultSet rs = null;
	
		try {
		String sql = "SELECT goal01,goal02 FROM mandal_goal WHERE id = ? and MG_no = ?"; 
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, uid);
		stmt.setString(2, MG_no);
		rs = stmt.executeQuery();
		String str = ""; 
		int cnt = 0; 
		
		while(rs.next()) {
			if (cnt++ > 0) str += "";
				str += rs.getString("goal01");
				//str += rs.getString("goal02");
			}
			return str + "";
			
		//return rs.next() ? rs.getString("goal01") : "{}";
		
		} finally {
			if (rs != null) rs.close();
			if (stmt != null) stmt.close(); 
			if (conn != null) conn.close();
		}
	}	
	public String getgoal02(String uid,String MG_no) throws NamingException, SQLException { 
		Connection conn = ConnectionPool.get();
		PreparedStatement stmt = null;
		ResultSet rs = null;
	
		try {
		String sql = "SELECT goal02 FROM mandal_goal WHERE id = ? and MG_no = ?"; 
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, uid);
		stmt.setString(2, MG_no);
		rs = stmt.executeQuery();
		String str = ""; 
		int cnt = 0; 
		
		while(rs.next()) {
			if (cnt++ > 0) str += "";
				str += rs.getString("goal02");
			}
			return str + "";
			
		//return rs.next() ? rs.getString("goal01") : "{}";
		
		} finally {
			if (rs != null) rs.close();
			if (stmt != null) stmt.close(); 
			if (conn != null) conn.close();
		}
	}
	public String getgoal03(String uid,String MG_no) throws NamingException, SQLException { 
		Connection conn = ConnectionPool.get();
		PreparedStatement stmt = null;
		ResultSet rs = null;
	
		try {
		String sql = "SELECT goal03 FROM mandal_goal WHERE id = ? and MG_no = ?"; 
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, uid);
		stmt.setString(2, MG_no);
		rs = stmt.executeQuery();
		String str = ""; 
		int cnt = 0; 
		
		while(rs.next()) {
			if (cnt++ > 0) str += "";
				str += rs.getString("goal03");
			}
			return str + "";
			
		//return rs.next() ? rs.getString("goal01") : "{}";
		
		} finally {
			if (rs != null) rs.close();
			if (stmt != null) stmt.close(); 
			if (conn != null) conn.close();
		}
	}
	public String getgoal04(String uid,String MG_no) throws NamingException, SQLException { 
		Connection conn = ConnectionPool.get();
		PreparedStatement stmt = null;
		ResultSet rs = null;
	
		try {
		String sql = "SELECT goal04 FROM mandal_goal WHERE id = ? and MG_no = ?"; 
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, uid);
		stmt.setString(2, MG_no);
		rs = stmt.executeQuery();
		String str = ""; 
		int cnt = 0; 
		
		while(rs.next()) {
			if (cnt++ > 0) str += "";
				str += rs.getString("goal04");
			}
			return str + "";
			
		//return rs.next() ? rs.getString("goal01") : "{}";
		
		} finally {
			if (rs != null) rs.close();
			if (stmt != null) stmt.close(); 
			if (conn != null) conn.close();
		}
	}
	public String getgoal05(String uid,String MG_no) throws NamingException, SQLException { 
		Connection conn = ConnectionPool.get();
		PreparedStatement stmt = null;
		ResultSet rs = null;
	
		try {
		String sql = "SELECT goal05 FROM mandal_goal WHERE id = ? and MG_no = ?"; 
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, uid);
		stmt.setString(2, MG_no);
		rs = stmt.executeQuery();
		String str = ""; 
		int cnt = 0; 
		
		while(rs.next()) {
			if (cnt++ > 0) str += "";
				str += rs.getString("goal05");
			}
			return str + "";
			
		//return rs.next() ? rs.getString("goal01") : "{}";
		
		} finally {
			if (rs != null) rs.close();
			if (stmt != null) stmt.close(); 
			if (conn != null) conn.close();
		}
	}
	public String getgoal06(String uid,String MG_no) throws NamingException, SQLException { 
		Connection conn = ConnectionPool.get();
		PreparedStatement stmt = null;
		ResultSet rs = null;
	
		try {
		String sql = "SELECT goal06 FROM mandal_goal WHERE id = ? and MG_no = ?"; 
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, uid);
		stmt.setString(2, MG_no);
		rs = stmt.executeQuery();
		String str = ""; 
		int cnt = 0; 
		
		while(rs.next()) {
			if (cnt++ > 0) str += "";
				str += rs.getString("goal06");
			}
			return str + "";
			
		//return rs.next() ? rs.getString("goal01") : "{}";
		
		} finally {
			if (rs != null) rs.close();
			if (stmt != null) stmt.close(); 
			if (conn != null) conn.close();
		}
	}
	public String getgoal07(String uid,String MG_no) throws NamingException, SQLException { 
		Connection conn = ConnectionPool.get();
		PreparedStatement stmt = null;
		ResultSet rs = null;
	
		try {
		String sql = "SELECT goal07 FROM mandal_goal WHERE id = ? and MG_no = ?"; 
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, uid);
		stmt.setString(2, MG_no);
		rs = stmt.executeQuery();
		String str = ""; 
		int cnt = 0; 
		
		while(rs.next()) {
			if (cnt++ > 0) str += "";
				str += rs.getString("goal07");
			}
			return str + "";
			
		//return rs.next() ? rs.getString("goal01") : "{}";
		
		} finally {
			if (rs != null) rs.close();
			if (stmt != null) stmt.close(); 
			if (conn != null) conn.close();
		}
	}
	public String getgoal08(String uid,String MG_no) throws NamingException, SQLException { 
		Connection conn = ConnectionPool.get();
		PreparedStatement stmt = null;
		ResultSet rs = null;
	
		try {
		String sql = "SELECT goal08 FROM mandal_goal WHERE id = ? and MG_no = ?"; 
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, uid);
		stmt.setString(2, MG_no);
		rs = stmt.executeQuery();
		String str = ""; 
		int cnt = 0; 
		
		while(rs.next()) {
			if (cnt++ > 0) str += "";
				str += rs.getString("goal08");
			}
			return str + "";
			
		//return rs.next() ? rs.getString("goal01") : "{}";
		
		} finally {
			if (rs != null) rs.close();
			if (stmt != null) stmt.close(); 
			if (conn != null) conn.close();
		}
	}

}
