package net.member.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import net.member.db.Member;

public class MemberDAO {
	private DataSource ds; // DataSource ds �� ����ġ��Ĺ�� �����ϴ� DBCP(DB Connection Pool) �̴�.
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	int result;

	public MemberDAO() {
		try {
			Context init = new InitialContext();
			ds = (DataSource) init.lookup("java:/comp/env/jdbc/OracleDB");
		} catch (Exception ex) {
			System.out.println("DB ���� ����: " + ex);
			return;
		}
	}
	
	public int isId(String id) {
		try {
			conn = ds.getConnection();
			System.out.println("getConnection");
			
			String sql = "select id from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				result = 0;	//DB�� �ش� id�� �ֽ��ϴ�.
			} else {
				result = -1; //DB�� �ش� id�� �����ϴ�.
			}
		} catch(SQLException e) {
			e.printStackTrace();
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
		} return result;
	}
	
	public int isId(String id, String pass) {
		try {
			conn = ds.getConnection();
			System.out.println("getConnection");
			
			String sql = "select id, password from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				if(rs.getString(2).equals(pass)) {
					result = 1;	//���̵�� ��й�ȣ ��ġ�ϴ� ���
				} else {
					result = 0;	//��й�ȣ�� ��ġ���� �ʴ� ���
				}
			} else {
				result = -1; //���̵� �������� �ʽ��ϴ�.
			}
		} catch(SQLException e) {
			e.printStackTrace();
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
		} return result;
	}
	
	public int insert(Member m) {
		int result = 0;//�ʱⰪ
		try {
			conn = ds.getConnection();
			String sql = "insert into member "
					+ "values(?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getPass());
			pstmt.setString(3, m.getName());
			pstmt.setInt(4, m.getAge());
			pstmt.setString(5, m.getGender());
			pstmt.setString(6, m.getEmail());
			result = pstmt.executeUpdate();
			
		//primary key �������� �������� ��� �߻��ϴ� ����
		} 
		/*catch() {
			return -1;
		} 
		*/
		catch(SQLException e){
			e.printStackTrace();
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
		} return result;
	}
}
