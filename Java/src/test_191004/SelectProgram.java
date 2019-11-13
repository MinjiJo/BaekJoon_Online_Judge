package test_191004;

import java.sql.*;
import java.util.ArrayList;

public class SelectProgram {
	public ArrayList<EntProgram> selectProgram(){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		String query = "SELECT * FROM ENT_PROGRAM";
		ArrayList<EntProgram> list = null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			list = new ArrayList<EntProgram>();
			if(rset.next()) {
				EntProgram ep = new EntProgram();
				ep.setProName(rset.getString("PRO_NAME"));
				ep.setProCompany(rset.getString("PRO_COMPANY"));
				ep.setProCompany(rset.getString("PRO_RATING"));
				ep.setProCompany(rset.getString("PRO_END"));
				list.add(ep);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rset.close();
				stmt.close();
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}
