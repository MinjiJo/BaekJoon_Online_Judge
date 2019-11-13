//select
package ex22_4_PreparedStatement;
import java.sql.*;
public class JdbcEx1_select {
	public static void main(String args[]) {
		// SQL�� �ۼ��ϱ� - ���������� ��ü�� �κ��� ?�� ó���մϴ�.
		StringBuilder sql = new StringBuilder();
		sql.append("select * from professor ");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnUtil.getConnection();
			
			// PreparedStatement ��ü ���
			pstmt = conn.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			
			ResultSetMetaData rd = rs.getMetaData();
			for (int i = 1; i <= rd.getColumnCount(); i++) {
				if(i==7) System.out.print("\t");
				System.out.print(rd.getColumnName(i) + "\t");
			}
			/*
			 * System.out.print("PROFNO\tNAME\tENAME\t\tPOSITION\tSAL\tHIREDATE\tAGE\tDEPTNO");
			 */
			System.out.println("\n-------------------------------------------------------------------------------------");

			while (rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t\t");
				System.out.print(rs.getInt(5) + "\t");
				System.out.print(rs.getString(6) + "\t");
				System.out.print(rs.getInt(7) + "\t");
				System.out.print(rs.getInt(8) + "\t");
			}
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			try {
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if (conn != null)
					conn.close(); //4�ܰ� : DB������ ���´�.
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
