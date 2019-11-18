/*
  DAO(Data Access Object) Ŭ����
  - �����ͺ��̽��� �����Ͽ� ���ڵ��� �߰�, ����, ���� �۾���
        �̷������ Ŭ�����Դϴ�.
  - � Action Ŭ������ ȣ��Ǵ��� �׿� �ش��ϴ� �����ͺ��̽� ���� ó����
    DAO Ŭ�������� �̷������ �˴ϴ�.
*/

package com.naver.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.naver.vo.Member;

public class MemberDAO {
	DataSource ds;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	int result;
	
	public MemberDAO(){
		try {
			Context init = new InitialContext();
			ds =(DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
		} catch (Exception ex) {
			System.out.println("DB ���� ���� : " + ex);
		}
	}
	
	public int insert(Member m) throws SQLException {
		try {
			con = ds.getConnection();
			System.out.println("getConnection");
			
			pstmt = con.prepareStatement("insert into cookie_member(id, pass, name, reg_date) "
													+ "values(?, ?, ?, sysdate)");
			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getPass());
			pstmt.setString(3, m.getName());
			
			result = pstmt.executeUpdate();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			} 
			if (con != null)
				try {
					con.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
			return result;
		}// insert end
	
	public int isId(String id, String pass) {
		try {
			con = ds.getConnection();
			System.out.println("getConnection");
			
			String sql =
					"select id, pass from cookie_member where id = ? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {//���� 1���� row�̹Ƿ� if�� �����. �𸣴� ��쿡�� while �����
				if(rs.getString(2).equals(pass)) {
					result = 1;		//���̵�� ��й�ȣ ��ġ�ϴ� ���
				} else {
					result = 0;		//��й�ȣ�� ��ġ���� �ʴ� ���
				}
			} else {
				result = -1; //���̵� �������� �ʽ��ϴ�.
			}
		} catch(SQLException e){
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			} 
			if (con != null)
				try {
					con.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}return result; 
		} 
	
	public Member member_info(String id) {
		Member m = new Member();
		try {
			con = ds.getConnection();
			
			String sql = "select * from cookie_member "
						+ "where id = ? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {//���� 1���� row�̹Ƿ� if�� �����. �𸣴� ��쿡�� while �����
				m.setId(rs.getString(1));
				m.setPass(rs.getString(2));
				m.setName(rs.getString(3));
				m.setReg_date(rs.getDate(4));
			}
		} catch(SQLException e){
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			} 
			if (con != null)
				try {
					con.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}return m; 
	}
	
	public List<Member> getList() {
		List<Member> list = new ArrayList<Member>();
		try {
			con = ds.getConnection();
			
			String sql = "select * from cookie_member ";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {//���� 1���� row�̹Ƿ� if�� �����. �𸣴� ��쿡�� while �����
				Member m = new Member();
				m.setId(rs.getString("id"));
				m.setPass(rs.getString(2));
				m.setName(rs.getString(3));
				m.setReg_date(rs.getDate(4));
				list.add(m);
			}
		} catch(SQLException e){
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			} 
			if (con != null)
				try {
					con.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}return list; 
	}
}