package _10.dbpost;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DAO {
	private DataSource ds; // DataSource ds �� ����ġ��Ĺ�� �����ϴ� DBCP(DB Connection Pool) �̴�.
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public DAO() {
		try {
			Context init = new InitialContext();
			ds = (DataSource) init.lookup("java:/comp/env/jdbc/OracleDB");
		} catch (Exception ex) {
			System.out.println("DB ���� ����: " + ex);
			return;
		}
	}
	
	public int insert(VO vo) {
		int result = 0;//�ʱⰪ
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
		//JSON ���·� �����͸� ����ϴ�.
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
				sb.deleteCharAt(sb.length()-1);//�� ������ �޸��� �����մϴ�.
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
