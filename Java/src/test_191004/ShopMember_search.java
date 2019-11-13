package test_191004;

import java.sql.*;

public class ShopMember_search {
	public ShopMember searchUser(String memberId) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ShopMember sm = null;
		String query = "SELECT * FROM SHOPMEMBER WHERE MEMBER_ID=?";
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","test","1234");
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, memberId);
			rset = pstmt.executeQuery();
			if(rset.next()) {
				sm = new ShopMember();
				sm.setMemberId(rset.getString("MEMBER_ID"));
				sm.setMemberPw(rset.getString("MEMBER_PW"));
				sm.setPhone(rset.getString("PHONE"));
				//sm.setGender(rset.getString("GENDER"));
				sm.setGender(rset.getString("gender").charAt(0));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rset.close();
				pstmt.close();
				conn.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return sm;
	}
}
