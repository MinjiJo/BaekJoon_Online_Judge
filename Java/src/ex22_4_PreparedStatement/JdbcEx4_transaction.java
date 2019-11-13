//ó�� ���� - db �ݿ���
//�ι� ���� - db ��ҵ�
package ex22_4_PreparedStatement;
import java.sql.*;
public class JdbcEx4_transaction {
	public static void main(String args[]) {
		//transaction : ������ �۾� ����
		//insert, delete, update ���� �۾����� �ϳ��� ������ �۾�������
		//��� ���� ����� ��� �۾��� ���� ó�� �� ��쿡�� commit�� �����ؼ�
		//db�� �ݿ��ϰ� ���� ���� �� �ϳ��� ����ó�� ���� �ʴ� ���
		//rollback�� �����ؼ� �۾��������� ��� �۾��� ����Ѵ�.
		
		//SQL�� �ۼ��ϱ�
		StringBuilder sql1 = new StringBuilder();
		sql1.append("insert into department ");
		sql1.append("values(?,?,?,?)");
		
		StringBuilder sql2 = new StringBuilder();
		sql2.append("update department ");
		sql2.append("set dname = ?, loc = ? ");
		sql2.append("where deptno = ? ");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//////// transaction ���� ////////
			//�ϳ��� ������ �۾� ���� ����
			conn = ConnUtil.getConnection();
			
			//autoCommit��� ��Ȱ��ȭ ��Ű��
			conn.setAutoCommit(false);
			
			//--------- 1�� �۾� ���� ---------//
			// PreparedStatement ��ü ���
			pstmt = conn.prepareStatement(sql1.toString());
			// �Ķ���� ����
			// ������ ?(���ε� ����)�� ��ü�� ������ �����ϱ�
			pstmt.setInt(1, 250);
			pstmt.setString(2, "�ٹ����а�");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "9ȣ��");
			pstmt.executeUpdate();
			pstmt.close();
			//--------- 1�� �۾� ���� ---------//
			
			//--------- 2�� �۾� ���� ---------//
			// PreparedStatement ��ü ���
			pstmt = conn.prepareStatement(sql2.toString());
			// �Ķ���� ����
			// ������ ?(���ε� ����)�� ��ü�� ������ �����ϱ�
			pstmt.setString(1, "����Ͱ��а�");
			pstmt.setString(2, "8ȣ��");
			pstmt.setInt(3, 250);
			pstmt.executeUpdate();
			//--------- 2�� �۾� ���� ---------//
			
			//������ ���������� ����� ��� db�� �ݿ�
			conn.commit();
			System.out.println("db�� �ݿ��� . . . . . .");
		} catch (SQLException se) {
			try {
				System.out.println(se.getMessage());
				conn.rollback();
				System.out.println("db �ݿ��� ��ҵ� . . . . . .");
			} catch(SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
