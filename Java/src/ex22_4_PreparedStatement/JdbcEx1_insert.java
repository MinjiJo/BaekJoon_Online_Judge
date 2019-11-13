//insert
package ex22_4_PreparedStatement;
import java.sql.*;
public class JdbcEx1_insert {
	public static void main(String args[]) {
		//SQL�� �ۼ��ϱ� - ���������� ��ü�� �κ��� ?�� ó���մϴ�.
		StringBuilder sql = new StringBuilder();
		sql.append("insert into professor ");
		sql.append("values(?, ?, ?, ?, ?, sysdate, ?, ?)");
		
		Connection conn = null;
		
		//SQL������ �̸� �����ϵǰ� ����ð� ���� �μ����� ���� ������ Ȯ���� �� �ֽ��ϴ�.
		//��, SQL������ Ʋ�� �̸� ������ ���� ���� ���߿� �����մϴ�.
		//������ ?�� ��ġ�˴ϴ�.
		
		PreparedStatement pstmt = null;
		
		try {
			conn = ConnUtil.getConnection();
			
			//PreparedStatement ��ü ���
			pstmt = conn.prepareStatement(sql.toString());
			/*
			  �Ķ���� ����
			 - ������ ?(���ε� ����)�� ��ü�� ������ �����ϱ�
			 - �Է� �Ű�����(��ġȦ��) : SQL������ ? ���ڷ� ǥ�õ� �Է� �׸��� ����ŵ�ϴ�.
			 - �Է� �Ű������� Ÿ���� �������̸� setInt()�� ȣ��
			 - setInt()�� ù��° �Ű� ������ ?�� ������ ���ڷ� ��Ÿ���ϴ�.
			 - �ι�° �Ű� ������ ������ ���Դϴ�.
			 */
			pstmt.setInt(1,  9920); //prefno
			
			//�Է� �Ű������� Ÿ���� ���ڿ��̸� setString()�� ȣ��
			pstmt.setString(2, "ȫ�浿");		//name
			pstmt.setString(3, "gildong");	//ename
			pstmt.setString(4, "���ӱ���");	//position
			pstmt.setInt(5, 450);	//sal
			pstmt.setInt(6, 40);	//age
			pstmt.setInt(7, 203);	//deptno
			
			//���� ����
			int result = pstmt.executeUpdate();
			System.out.println(result + "���� ���� �߰� �Ǿ����ϴ�.");
		} catch(SQLException se) {
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
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}