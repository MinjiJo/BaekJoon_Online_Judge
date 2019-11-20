package _10.dbpost;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DAO {
	private DataSource ds; // DataSource ds 는 아파치톰캣이 제공하는 DBCP(DB Connection Pool) 이다.
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public DAO() {
		try {
			Context init = new InitialContext();
			ds = (DataSource) init.lookup("java:/comp/env/jdbc/OracleDB");
		} catch (Exception ex) {
			System.out.println("DB 연결 실패: " + ex);
			return;
		}
	}
	
	public int insert(VO vo) {
		int result = 0;//초기값
		try {
			conn = ds.getConnection();
			String sql = "insert into products(id, name, modelnumber, series) "
					+ "values((select nvl(max(id),0)+1 from products),?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getModelnumber());
			pstmt.setString(3, vo.getSeries());
			result = pstmt.executeUpdate();
		} catch(SQLException e){
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
	
	public String getList() {
		//JSON 형태로 데이터를 만듭니다.
		StringBuffer sb = new StringBuffer();
		try {
			conn = ds.getConnection();
			String sql = "select * from products order by id";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			int i = 0;
			while(rs.next()) {
				i++;
				if(i==1)sb.append("[");
				sb.append("{\"id\":\"" + rs.getInt(1) + "\", ");
				sb.append("\"name\":\"" + rs.getString(2) + "\", ");
				sb.append("\"modelnumber\":\"" + rs.getString(3) + "\", ");
				sb.append("\"series\":\"" + rs.getString(4) + "\"},");
			}
			if(i!=0) {
				sb.deleteCharAt(sb.length()-1);//맨 마지막 콤마를 제거합니다.
				sb.append("]");
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
		} return sb.toString();
	}
}
