package net.info.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class UserId_FollowDAO {
	private Connection conn;
	private DataSource ds;
	private ResultSet rs;
	private PreparedStatement pstmt;
	int result;
	
	public UserId_FollowDAO() {
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
	
	
	public void follwerAdd(String id, String id_session) {
		
	}

	public List<String>[] followerList(String id) {
		result = 0;
		List<String> list[] = new ArrayList[3];
		try {
			conn = ds.getConnection();
			conn.setAutoCommit(false);
			String sql = "select * from " + id + "_follow";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			ResultSet rs2;
			
			list[0] = new ArrayList<String>();
			list[1] = new ArrayList<String>();
			list[2] = new ArrayList<String>();
			while(rs.next()) {
				if(rs.getString("id_follower") != null) {
					list[2].add(rs.getString("id_follower"));
					sql = "select profileImg from All_users where id = ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, rs.getString("id_follower"));
					rs2 = pstmt.executeQuery();
					if(rs2.next())
						list[1].add(rs2.getString(1));
				}
				if(rs.getString("id") != null) {
					list[0].add(rs.getString("id"));
				}
			}
			
			conn.commit();
			return list;
		} catch (Exception e) {
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
		return null;
	}

	public List<String>[] followingList(String id) {
		result = 0;
		List<String> list[] = new ArrayList[3];
		try {
			conn = ds.getConnection();
			conn.setAutoCommit(false);
			String sql = "select * from " + id + "_follow";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			ResultSet rs2;
			list[0] = new ArrayList<String>();
			list[1] = new ArrayList<String>();
			list[2] = new ArrayList<String>();
			while(rs.next()) {
				if(rs.getString("id") != null) {
					list[0].add(rs.getString("id"));
					sql = "select profileImg from All_users where id = ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, rs.getString("id"));
					rs2 = pstmt.executeQuery();
					if(rs2.next())
						list[1].add(rs2.getString(1));
				}
				if(rs.getString("hashTag") != null) {
					list[2].add(rs.getString("hashTag"));
				}
			}
			
			conn.commit();
			return list;
		} catch (Exception e) {
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
		return null;
	}

	public int follow(String id, String selectedId) {	// id�� follow ������ �˻�
		result = 0;
		try {
			conn = ds.getConnection();
			conn.setAutoCommit(false);
			
			String sql = "select * from " + id + "_follow id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, selectedId);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {	//follow ���̸�
				sql = "delete from " + id + "_follow where id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, selectedId);
				result = pstmt.executeUpdate();
				
				sql = "delete from " + selectedId + "_follow where id_follower = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, id);
				result = pstmt.executeUpdate();
				
				conn.commit();
				return 1;
			} else {	// follow ���� ������
				sql = "insert into " + id + "_follow (id) values (?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, selectedId);
				result = pstmt.executeUpdate();
				
				sql = "insert into " + selectedId + "_follow (id_follower) values (?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, id);
				result = pstmt.executeUpdate();
				conn.commit();
				return 0;
			}
			
		} catch (Exception e) {
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
		return -1;
	}
}
