package _10.dbpost;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

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
	
	public JsonArray getList() {
		JsonArray jsonArray = new JsonArray();
		
		try {
			conn = ds.getConnection();
			
			String sql = "select * from products order by id";
			pstmt = conn.prepareStatement(sql);
			
			System.out.println(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				JsonObject jsonObject = new JsonObject();
				jsonObject.addProperty("id", rs.getInt(1));
				jsonObject.addProperty("name", rs.getString(2));
				jsonObject.addProperty("modelnumber", rs.getString(3));
				jsonObject.addProperty("series", rs.getString(4));
				jsonArray.add(jsonObject);
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
		} return jsonArray;
	}
}