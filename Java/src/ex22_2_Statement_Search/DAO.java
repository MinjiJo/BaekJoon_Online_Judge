package ex22_2_Statement_Search;

import java.sql.*;
import java.util.*;

public class DAO {
	Statement stmt = null;
	Connection conn = null;
	
	ArrayList<Emp> search(String[] searchs){
		String sql = "select * from emp ";
		String field[] = {"empno","ename","job","mgr","hiredate",
							"sal","comm","deptno"};
		
		//empno, mgr, sal, comm, deptno는 '없어도 됨
		for(int i = 0 ; i < searchs.length; i++) {
			if(searchs[i] != null) {
				String single = "";
				if(i==1 || i==2 || i==4) //ename, job, hiredate는 ' 필요함
					single="'";
				if(sql.contains("where"))
					sql += " and ";
				else
					sql += "where ";
				
				sql += field[i] + "=" + single + searchs[i] + single;
			}
		}
		
		System.out.println(sql.toString());
		
		ArrayList<Emp> arrst = new ArrayList<Emp>();
		try {
			//1단계 : JDBC 드라이버를 로드한다.
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			
			//2단계 : DB에 연결한다.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");
			
			//PreparedStatement 객체 얻기
			stmt = conn.createStatement();
			
			//쿼리 실행
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Emp st = new Emp();
				st.setEmpno(rs.getInt(1));//조회 결과 첫번째 칼럼 값을 가져옵니다.
										  //SQL의 결과 null인 경우 0을 리턴
				st.setEname(rs.getString(2));//if the value is SQL NULL, the value returned is null
				st.setJob(rs.getString(3));
				st.setMgr(rs.getInt(4));
				st.setHiredate(rs.getDate(5));
				st.setSal(rs.getInt(6));
				st.setComm(rs.getInt(7));
				st.setDeptno(rs.getInt(8));
				arrst.add(st);
			}
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다.");
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return arrst;
	}
}
