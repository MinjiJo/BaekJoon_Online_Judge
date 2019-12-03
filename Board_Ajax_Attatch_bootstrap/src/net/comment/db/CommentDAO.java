package net.comment.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class CommentDAO {
	//������ ���̽� �۾��� �ʿ��� �������̽�
	private DataSource ds; // DataSource ds �� ����ġ��Ĺ�� �����ϴ� DBCP(DB Connection Pool) �̴�.
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	int result;

	//�����ڿ��� JNDI ���ҽ��� �����Ͽ� Connection ��ü�� ���ɴϴ�.
	public CommentDAO() {
		try {
			Context init = new InitialContext();
			ds = (DataSource) init.lookup("java:/comp/env/jdbc/OracleDB");
		} catch (Exception ex) {
			System.out.println("DB ���� ����: " + ex);
			return;
		}
	}
	
	//���� ���� ���ϱ�
	public int getListCount(int BOARD_RE_REF) {
		int x = 0;
		String sql = "select count(*) "
				+ "from comments where BOARD_RE_REF = ?";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, BOARD_RE_REF);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				x = rs.getInt(1);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("getListCount() ���� : " + ex);
		} finally {
			try {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (pstmt != null) {
					pstmt.close();
					pstmt = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return x;
	} //getListCount() end

	public JsonArray getCommentList(int BOARD_RE_REF) {
		String sql = "select num, id, content, reg_date "
				+ "	  from comments where board_re_ref = ? "
				+ "	  order by reg_date desc";
		JsonArray array = new JsonArray();
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, BOARD_RE_REF);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				JsonObject object = new JsonObject();
				object.addProperty("num", rs.getInt(1));
				object.addProperty("id", rs.getString(2));
				object.addProperty("content", rs.getString(3));
				object.addProperty("reg_date", rs.getString(4));
				array.add(object);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("getCommentList() ���� : " + ex);
		} finally {
			try {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (pstmt != null) {
					pstmt.close();
					pstmt = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return array;
	}

	public int commentsInsert(Comment c) throws Exception {
		int result = 0;
		
		try {
			conn = ds.getConnection();
			
			String sql = "insert into comments "
					+ "(num, id, content, reg_date, BOARD_RE_REF) "
					+ "values(com_seq.nextval, ?, ?, sysdate, ?)";
			
			//���ο� ���� ����ϴ� �κ��Դϴ�.
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, c.getId());
			pstmt.setString(2, c.getContent());
			pstmt.setInt(3, c.getBoard_re_ref());
			result = pstmt.executeUpdate();
			if(result == 1)
				System.out.println("������ ���� �Ϸ�Ǿ����ϴ�.");
		} finally {
			try {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (pstmt != null) {
					pstmt.close();
					pstmt = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public int commentsUpdate(Comment co) throws Exception {
		int result = 0;
		
		try {
			conn = ds.getConnection();
			String sql = "update comments set content =  ? "
					+ "where num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, co.getContent());
			pstmt.setInt(2, co.getNum());
			result = pstmt.executeUpdate();
			if(result==1)
				System.out.println("������ ���� �Ǿ����ϴ�.");
		} finally {
			try {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (pstmt != null) {
					pstmt.close();
					pstmt = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public int commentsDelete(int num)  {
		int result = 0;
		
		try {
			conn = ds.getConnection();
			String sql = "delete from comments where num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			result = pstmt.executeUpdate();
			if(result==1)
				System.out.println("������ ���� �Ǿ����ϴ�.");
		} catch(Exception ex){
			ex.printStackTrace();
		}
		finally {
			try {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (pstmt != null) {
					pstmt.close();
					pstmt = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}