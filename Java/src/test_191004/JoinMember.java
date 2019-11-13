package test_191004;

import java.sql.*;

public class JoinMember {
	public int joinMember(User u) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "INSERT INTO USER_TBL VALUES(?,?,?,?)";
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","test","1234");
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, u.getUserId());
			pstmt.setString(2, u.getUserPw());
			pstmt.setString(3, u.getUserName());
			pstmt.setDate(4, u.getEnrolldate());
			result = pstmt.executeUpdate();
			if(result>0) {
				conn.commit();
			}else {
				conn.rollback();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}
