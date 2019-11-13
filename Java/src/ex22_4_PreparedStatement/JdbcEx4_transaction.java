//처음 실행 - db 반영됨
//두번 실행 - db 취소됨
package ex22_4_PreparedStatement;
import java.sql.*;
public class JdbcEx4_transaction {
	public static void main(String args[]) {
		//transaction : 논리적인 작업 단위
		//insert, delete, update 등의 작업들을 하나의 논리적인 작업단위로
		//묶어서 쿼리 실행시 모든 작업이 정상 처리 된 경우에는 commit을 실행해서
		//db에 반영하고 쿼리 실행 중 하나라도 정상처리 되지 않는 경우
		//rollback을 실행해서 작업단위내의 모든 작업을 취소한다.
		
		//SQL문 작성하기
		StringBuilder sql1 = new StringBuilder();
		sql1.append("insert into department ");
		sql1.append("values(?,?,?,?)");
		
		StringBuilder sql2 = new StringBuilder();
		sql2.append("update department ");
		sql2.append("set dname = ?, loc = ? ");
		sql2.append("where deptno = ? ");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//////// transaction 시작 ////////
			//하나의 논리적인 작업 단위 시작
			conn = ConnUtil.getConnection();
			
			//autoCommit기능 비활성화 시키기
			conn.setAutoCommit(false);
			
			//--------- 1번 작업 시작 ---------//
			// PreparedStatement 객체 얻기
			pstmt = conn.prepareStatement(sql1.toString());
			// 파라미터 셋팅
			// 쿼리의 ?(바인딩 변수)에 대체될 실제값 지정하기
			pstmt.setInt(1, 250);
			pstmt.setString(2, "핵물리학과");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "9호관");
			pstmt.executeUpdate();
			pstmt.close();
			//--------- 1번 작업 종료 ---------//
			
			//--------- 2번 작업 시작 ---------//
			// PreparedStatement 객체 얻기
			pstmt = conn.prepareStatement(sql2.toString());
			// 파라미터 셋팅
			// 쿼리의 ?(바인딩 변수)에 대체될 실제값 지정하기
			pstmt.setString(1, "세라믹공학과");
			pstmt.setString(2, "8호관");
			pstmt.setInt(3, 250);
			pstmt.executeUpdate();
			//--------- 2번 작업 종료 ---------//
			
			//쿼리가 정상적으로 실행된 경우 db에 반영
			conn.commit();
			System.out.println("db에 반영됨 . . . . . .");
		} catch (SQLException se) {
			try {
				System.out.println(se.getMessage());
				conn.rollback();
				System.out.println("db 반영이 취소됨 . . . . . .");
			} catch(SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
