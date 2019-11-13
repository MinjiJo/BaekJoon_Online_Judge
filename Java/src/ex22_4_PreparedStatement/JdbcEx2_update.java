//�޿��� 1500���� �ٲپ� �ּ���
package ex22_4_PreparedStatement;
import java.sql.*;
public class JdbcEx2_update {
	public static void main(String[] args) {
		// SQL�� �ۼ��ϱ�
		StringBuilder sql = new StringBuilder();
		sql.append("update professor ");
		sql.append("set sal = ? ");
		sql.append("where profno = ? ");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = ConnUtil.getConnection();
			
			// PreparedStatement ��ü ���
			pstmt = conn.prepareStatement(sql.toString());
			
			// �Ķ���� ����
			// ������ ?(���ε� ����)�� ��ü�� ������ �����ϱ�
			pstmt.setInt(1, 1500);
			pstmt.setInt(2, 9920);
			
			// ���� ����
			int result = pstmt.executeUpdate();
			System.out.println(result + "���� ���� ���� �Ǿ����ϴ�.");
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
