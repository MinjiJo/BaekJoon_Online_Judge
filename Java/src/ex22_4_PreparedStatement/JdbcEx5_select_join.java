//select
package ex22_4_PreparedStatement;
import java.sql.*;
public class JdbcEx5_select_join {
	public static void main(String args[]) {
		// SQL문 작성하기 - 실제값으로 대체될 부분을 ?로 처리합니다.
		StringBuilder sql = new StringBuilder();
		sql.append("select p.name, p.profno, d.dname, p.position "
				+ "from professor p, department d "
				+ "where p.deptno = d.deptno "
				+ "and d.deptno = 203");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = ConnUtil.getConnection();
			
			// PreparedStatement 객체 얻기
			pstmt = conn.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			
			ResultSetMetaData rd = rs.getMetaData();
			for (int i = 1; i <= rd.getColumnCount(); i++) {
				if(i==4) System.out.print("\t");
				System.out.print(rd.getColumnName(i) + "\t");
			}
			/*
			 * System.out.print("PROFNO\tNAME\tENAME\t\tPOSITION\tSAL\tHIREDATE\tAGE\tDEPTNO");
			 */

			while (rs.next()) {
				System.out.print("\n" + rs.getString(1) + "\t");
				System.out.print(rs.getInt(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
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
					conn.close(); //4단계 : DB연결을 끊는다.
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
