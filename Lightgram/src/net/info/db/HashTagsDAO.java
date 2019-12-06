package net.info.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class HashTagsDAO {
	private Connection conn;
	private DataSource ds;
	private ResultSet rs;
	private PreparedStatement pstmt;
	int result;
	
	public HashTagsDAO() {
		try {
			Context init = new InitialContext();
			ds = (DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public boolean insertHashTag(String hashTag) {
		try {
			conn = ds.getConnection();
			conn.setAutoCommit(false);
			String sql = "select hashTag from hashTags where hashTag = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, hashTag);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				sql = "update hashTags set usingCount = usingCount + 1 where hashTag = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, hashTag);
				pstmt.executeUpdate();
				conn.commit();
				return true;
			} else {
				sql = "insert into hashTags (hashTag, usingCount) values (?, 1)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, hashTag);
				pstmt.executeUpdate();
				conn.commit();
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}finally {
			close();
		}
		return false;
	}
	
	public boolean deleteHashTag(String id, int itemNum) {
		try {
			result = 0;
			conn = ds.getConnection();
			conn.setAutoCommit(false);
			String sql = "select hashtag from " + id + "_post where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String[] hashTags = rs.getString(1).split(" ");
				for(String hashTag : hashTags) {
					sql = "update hashtags set usingCount = usingCount - 1 where hashTag = ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, hashTag);
					result = pstmt.executeUpdate();
				}
			}
			
			if(result != -1) {
				conn.commit();
				return true;
			}
		} catch(Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {
			close();
		}
		return false;
	}
}
