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
		
		//empno, mgr, sal, comm, deptno�� '��� ��
		for(int i = 0 ; i < searchs.length; i++) {
			if(searchs[i] != null) {
				String single = "";
				if(i==1 || i==2 || i==4) //ename, job, hiredate�� ' �ʿ���
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
			//1�ܰ� : JDBC ����̹��� �ε��Ѵ�.
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			
			//2�ܰ� : DB�� �����Ѵ�.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");
			
			//PreparedStatement ��ü ���
			stmt = conn.createStatement();
			
			//���� ����
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Emp st = new Emp();
				st.setEmpno(rs.getInt(1));//��ȸ ��� ù��° Į�� ���� �����ɴϴ�.
										  //SQL�� ��� null�� ��� 0�� ����
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
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�.");
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
