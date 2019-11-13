//데이터베이스의 테이블에 데이터를 삭제하는 프로그램
//executeUpdate 메서드 사용
package ex22_3_insert_delete_update;
import java.sql.*;
class JDBCExample5_Oracle_delete {
	public static void main(String args[]) {
		//"A1000" "고급 핸드폰" 100 "LG"
		if (args.length != 1) {
			System.out.println("상품코드 입력하세요");
			return;
		}
		Connection conn = null;
		Statement stmt = null;
		try {
			//1단계 : JDBC 드라이버를 로드한다.
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			
			//2단계 : DB에 연결한다.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");
			
			//PreparedStatement 객체 얻기
			stmt = conn.createStatement();
			
			/*
			 * INSERT, UPDATE, DELETE 문을 실행하는 메서드는 executeUpdate()입니다.
			   executeUpdate()의 리턴값은 INSERT, UPDATE, DELETE
			       수행된 row의 수입니다.
			 1. 직접 데이터를 입력하는 경우
			 	insert into goodsinfo
			 	values('A1000', '디지털 TV', 350000, 'LG')
			 2. 변수를 이용해서 입력하는 경우
			 	insert into goodsinfo (code, name, price, maker)
			 	values('args[0]', 'args[1]', 'args[2]', 'args[3]')
			 */
			//delete from goodsinfo where code = 'args[0]'
			String del_sql
			= "delete from goodsinfo "
			+ "where code = '"
			+ args[0] + "'";
			System.out.println(del_sql);
			int rowNum = stmt.executeUpdate(del_sql);
			System.out.println(rowNum + "행이 삭제되었습니다.");
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
	}
}
