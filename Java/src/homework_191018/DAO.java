package homework_191018;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {
	PreparedStatement pstmt = null;
	Connection conn = null;
	
	ArrayList<Object[]> selectAll() {
		StringBuilder sql = new StringBuilder();
		sql.append("select * from board " + 
				"order by BOARD_RE_REF desc, " + 
				"BOARD_RE_SEQ asc");
		ArrayList<Object[]> arrlist = new ArrayList<Object[]>();
		try {
			conn = ConnUtil.getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			ResultSet rs = pstmt.executeQuery();		
			while (rs.next()) {
				int num = rs.getInt("BOARD_NUM");
				String name = rs.getString("BOARD_NAME");
				String pass = rs.getString("BOARD_PASS");
				String subject = rs.getString("BOARD_SUBJECT");
				String content = rs.getString("BOARD_CONTENT");
				String file = rs.getString("BOARD_FILE");
				String original = rs.getString("BOARD_ORIGINAL");
				int re_ref = rs.getInt("BOARD_RE_REF");
				int re_lev = rs.getInt("BOARD_RE_LEV");
				int re_seq = rs.getInt("BOARD_RE_SEQ");
				int readcount = rs.getInt("BOARD_READCOUNT");
				Date date = rs.getDate("BOARD_DATE");
				Object[] obj = {num, name, pass, subject, content, file, original, re_ref, re_lev, re_seq, readcount, date};
				arrlist.add(obj);
			}
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return arrlist;
	}
	
	void insert(String name, String pass, String subject, String content) {
		StringBuilder sql = new StringBuilder();
		sql.append("insert into board(BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,"
				+ "BOARD_CONTENT,BOARD_RE_REF,"
				+ "BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT,"
				+ "BOARD_DATE) "
				+ "values(board_seq.nextval,?,?,?,"
				+ "?,board_seq.nextval,"
				+ "0,0,0,"
				+ "sysdate)");
		
		try {
			conn = ConnUtil.getConnection();
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, name);
			pstmt.setString(2, pass);
			pstmt.setString(3, subject);
			pstmt.setString(4, content);
			
			int result = pstmt.executeUpdate();
			System.out.println(result + "�� db�� �ݿ���");
		} catch (SQLException se) {
			System.out.println(se.getMessage());
			se.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	ArrayList<Object[]> select_max() {
		StringBuilder sql = new StringBuilder();
		sql.append("select * from board "
				+ "where BOARD_NUM=("
				+ "select MAX(BOARD_NUM) "
				+ "from board)");
		ArrayList<Object[]> arrlist = new ArrayList<Object[]>();
		try {
			conn = ConnUtil.getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			ResultSet rs = pstmt.executeQuery();		
			while (rs.next()) {
				int num = rs.getInt("BOARD_NUM");
				String name = rs.getString("BOARD_NAME");
				String pass = rs.getString("BOARD_PASS");
				String subject = rs.getString("BOARD_SUBJECT");
				String content = rs.getString("BOARD_CONTENT");
				String file = rs.getString("BOARD_FILE");
				String original = rs.getString("BOARD_ORIGINAL");
				int re_ref = rs.getInt("BOARD_RE_REF");
				int re_lev = rs.getInt("BOARD_RE_LEV");
				int re_seq = rs.getInt("BOARD_RE_SEQ");
				int readcount = rs.getInt("BOARD_READCOUNT");
				Date date = rs.getDate("BOARD_DATE");
				Object[] obj = {num, name, pass, subject, content, file, original, re_ref, re_lev, re_seq, readcount, date};
				arrlist.add(obj);
			}
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return arrlist;
	}
	
	void re_insert(String name, String pass, String subject, String content, 
			int num, int level_num, int count_num) {
		StringBuilder sql = new StringBuilder();
			
		sql.append("UPDATE BOARD "
				+ "SET BOARD_RE_SEQ = BOARD_RE_SEQ + 1 "
				+ "WHERE BOARD_RE_REF = ? "
				+ "AND BOARD_RE_SEQ > ?");
		
		try {
			conn = ConnUtil.getConnection();
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, num);
			pstmt.setInt(2, count_num);
			
			int result = pstmt.executeUpdate();
			System.out.println(result + "RE_SEQ 1�� ���� �ݿ���");
		} catch (SQLException se) {
			System.out.println(se.getMessage());
			se.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		
		
		StringBuilder sql2 = new StringBuilder();
		
		sql2.append("insert into board(BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,"
				+ "BOARD_CONTENT,BOARD_RE_REF,"
				+ "BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT,"
				+ "BOARD_DATE) "
				+ "values(board_seq.nextval,?,?,?,"
				+ "?,?,"
				+ "?,?,0,"
				+ "sysdate)");
		
		String output = "";
		for(int i = 0; i <= level_num; i++) {
			output += "  ";
		}
		
		try {
			conn = ConnUtil.getConnection();
			
			pstmt = conn.prepareStatement(sql2.toString());
			pstmt.setString(1, name);
			pstmt.setString(2, pass);
			pstmt.setString(3, output + "Re:" + subject);
			pstmt.setString(4, content);
			pstmt.setInt(5, num);
			pstmt.setInt(6, level_num+1);
			pstmt.setInt(7, count_num+1);
			
			int result = pstmt.executeUpdate();
			System.out.println(result + "�� �亯 ����� db�� �ݿ���");
		} catch (SQLException se) {
			System.out.println(se.getMessage());
			se.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	void update(String name, String pass, String subject, String content, 
			int num) {
		StringBuilder sql = new StringBuilder();
			
		sql.append("UPDATE BOARD "
				+ "SET BOARD_NAME = ?, BOARD_PASS = ?, "
				+ "BOARD_SUBJECT = ?, BOARD_CONTENT = ? "
				+ "WHERE BOARD_NUM = ? ");
		
		try {
			conn = ConnUtil.getConnection();
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, name);
			pstmt.setString(2, pass);
			pstmt.setString(3, subject);
			pstmt.setString(4, content);
			pstmt.setInt(5, num);
			
			int result = pstmt.executeUpdate();
			System.out.println(result + "UPDATE �ݿ���");
		} catch (SQLException se) {
			System.out.println(se.getMessage());
			se.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	void delete_update(int num, int ref, int count) {
		StringBuilder sql = new StringBuilder();
		
		sql.append("DELETE FROM BOARD "
				+ "WHERE BOARD_NUM = ?");
		
		try {
			conn = ConnUtil.getConnection();
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, num);
			
			int result = pstmt.executeUpdate();
			System.out.println(result + "�� DELETE �ݿ���");
		} catch (SQLException se) {
			System.out.println(se.getMessage());
			se.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		
		StringBuilder sql2 = new StringBuilder();
		sql2.append("UPDATE BOARD "
				+ "SET BOARD_RE_SEQ = BOARD_RE_SEQ - 1 "
				+ "WHERE BOARD_RE_REF = ? "
				+ "AND BOARD_RE_SEQ > ?");
		
		try {
			conn = ConnUtil.getConnection();
			
			pstmt = conn.prepareStatement(sql2.toString());
			pstmt.setInt(1, ref);
			pstmt.setInt(2, count);
			
			int result = pstmt.executeUpdate();
			System.out.println(result + "�� RE_SEQ 1�� ���� �ݿ���");
		} catch (SQLException se) {
			System.out.println(se.getMessage());
			se.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	ArrayList<Object[]> select(int BOARD_NUM) {
		StringBuilder sql = new StringBuilder();
		sql.append("select * from board "
				+ "where BOARD_NUM=? ");
		ArrayList<Object[]> arrlist = new ArrayList<Object[]>();
		try {
			conn = ConnUtil.getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, BOARD_NUM);
			ResultSet rs = pstmt.executeQuery();		
			while (rs.next()) {
				int num = rs.getInt("BOARD_NUM");
				String name = rs.getString("BOARD_NAME");
				String pass = rs.getString("BOARD_PASS");
				String subject = rs.getString("BOARD_SUBJECT");
				String content = rs.getString("BOARD_CONTENT");
				String file = rs.getString("BOARD_FILE");
				String original = rs.getString("BOARD_ORIGINAL");
				int re_ref = rs.getInt("BOARD_RE_REF");
				int re_lev = rs.getInt("BOARD_RE_LEV");
				int re_seq = rs.getInt("BOARD_RE_SEQ");
				int readcount = rs.getInt("BOARD_READCOUNT");
				Date date = rs.getDate("BOARD_DATE");
				Object[] obj = {num, name, pass, subject, content, file, original, re_ref, re_lev, re_seq, readcount, date};
				arrlist.add(obj);
			}
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return arrlist;
	}
}
