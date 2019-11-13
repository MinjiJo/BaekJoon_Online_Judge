package ex22_4_PreparedStatement_Student_transaction;

import java.sql.*;
import java.util.ArrayList;

public class DAO {
	PreparedStatement pstmt = null;
	Connection conn = null;

	int insert(String name, int kor, int math, int eng) {
		StringBuilder sql = new StringBuilder();
		int tot = kor + math + eng;
		float avg = tot / 3f;
		sql.append("insert into student(no, name, kor, math, eng, tot, avg, grade) "
				+ "values(student_seq.nextval, ?, ?, ?, ?, ?, ?, " 
				+ "(select grade from hakjum "
				+ "where ? between lowscore and hiscore))");

		int result = 0;
		try {
			conn = ConnUtil.getConnection();

			// PreparedStatement 객체 얻기
			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, name);

			// 입력 매개변수의 타입이 문자열이면 setString()을 호출
			pstmt.setInt(2, kor);
			pstmt.setInt(3, math);
			pstmt.setInt(4, eng);
			pstmt.setInt(5, tot);
			pstmt.setFloat(6, avg);
			pstmt.setFloat(7, avg);

			// 쿼리 실행
			result = pstmt.executeUpdate();
			System.out.println("db에 반영됨 . . . . . .");
		} catch (SQLException se) {
			System.out.println(se.getMessage());
			se.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		return result;
	}

	Student select(int no) {
		StringBuilder sql = new StringBuilder();
		sql.append("select * from student where no = ? ");
		Student st = null;
		try {
			conn = ConnUtil.getConnection();

			// PreparedStatement 객체 얻기
			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setInt(1, no);

			// 쿼리 실행
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				st = new Student();
				st.setNo(rs.getInt("no"));
				st.setName(rs.getString("name"));
				st.setKor(rs.getInt("kor"));
				st.setMath(rs.getInt("math"));
				st.setEng(rs.getInt("eng"));
				st.setTot(rs.getInt("tot"));
				st.setAvg(rs.getFloat("avg"));
				st.setGrade(rs.getString("grade"));
			}
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if (conn != null)
					conn.close(); // 4단계 : DB연결을 끊는다.
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return st;
	}

	ArrayList<Student> selectAll() {
		StringBuilder sql = new StringBuilder();
		sql.append("select * from student order by no ");
		ArrayList<Student> arrst = new ArrayList<Student>();
		try {
			conn = ConnUtil.getConnection();

			// PreparedStatement 객체 얻기
			pstmt = conn.prepareStatement(sql.toString());

			// 쿼리 실행
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Student st = new Student();
				st.setNo(rs.getInt("no"));
				st.setName(rs.getString("name"));
				st.setKor(rs.getInt("kor"));
				st.setMath(rs.getInt("math"));
				st.setEng(rs.getInt("eng"));
				st.setTot(rs.getInt("tot"));
				st.setAvg(rs.getFloat("avg"));
				st.setGrade(rs.getString("grade"));
				arrst.add(st);
			}
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if (conn != null)
					conn.close(); // 4단계 : DB연결을 끊는다.
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return arrst;
	}

	int delete(int no) {
		StringBuilder sql = new StringBuilder();
		sql.append("delete from student where no = ? ");
		int result = -1;
		try {
			conn = ConnUtil.getConnection();
			
			//PreparedStatement 객체 얻기
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, no);

			result = pstmt.executeUpdate();
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		return result;
	}

	int update(int no, String name, int kor, int math, int eng) {
		StringBuilder sql = new StringBuilder();
		int tot = kor + math + eng;
		float avg = tot / 3f;
		sql.append("update student "
				+ "set name = ?, kor = ?, math = ?, eng = ?, tot = ?, avg = ?, "
				+ "		grade = (select grade from hakjum"
				+ "				where ? between lowscore and hiscore)"
				+ "where no = ? ");

		int result = -1;
		try {
			conn = ConnUtil.getConnection();
			
			//PreparedStatement 객체 얻기
			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, name);
			pstmt.setInt(2, kor);
			pstmt.setInt(3, math);
			pstmt.setInt(4, eng);
			pstmt.setInt(5, no);
			pstmt.setFloat(6, avg);
			pstmt.setFloat(7, avg);
			pstmt.setInt(8, no);
			
			//쿼리 실행
			result = pstmt.executeUpdate();

		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		return result;
	}
}
