//데이터베이스의 테이블로부터 조건에 맞는 데이터를 입력받아 처리하는 프로그램
//arguments탭에 "디지털 TV"라고 입력하세요
package ex22_2_select_statement_argument;
import java.sql.*;
public class JDBCExample2_Oracle1_column_name {
	public static void main(String args[]) {
		if (args.length != 1) {
			System.out.println("상품명 입력하세요");
			return;
		}
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//1단계 : JDBC 드라이버를 로드한다.
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			
			//2단계 : DB에 연결한다.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");
			
			/* 데이터베이스에 있는 테이블의 데이터를 읽어오기 위해 Statement 객체가 필요
			 2단계에서 얻은 Connection 객체에 대해 createStatement 메소드를
			 호출해서 얻습니다.
			 */
			stmt = conn.createStatement();
			
			/*
			   Statement 타입은 java.sql 패키지에 속하는 인터페이스 이름으로
			   select문을 실행하는 executeQuery라는 메소드가 있습니다.
			   이 메소드에 파라미터로 select 문장을 넘겨주어야 합니다.
			   이 메소드는 파라미터로 넘겨준 select 문을 데이터 베이스로
			   보내서 실행하고 그 결과로 ResultSet 객체를 리턴합니다.
			 */
			//String arg = args[0];
			String select_sql =
					"select code, name, price, maker "
					+ "from goodsinfo "
					+ "where name = '" + args[0] + "'";
			
			rs = stmt.executeQuery(select_sql);
			
			System.out.println("번호   상품코드 \t  상품명\t\t\t가격	제조사");
			System.out.println("--------------------------------------------------------");
			
			/*
			 ResultSet 객체로부터 select문의 실행 결과를 얻기 위해서는 먼저
			 next() 메소드를 호출해야 합니다.
			 rs.next() - 실행 결과의 다음 행 위치로 이동하는 메소드로 결과값은
			 boolean으로 실제로 행을 읽어 왔는지 여부입니다.
			 */
			int i = 0;
			while (rs.next()) {//더 이상 읽을 데이터가 없을 때까지 반복
				//getString("code") : 컬럼 code 값을 String 형으로 리턴하는 메소드
				String code = rs.getString(1);  //rs.getString("상품코드");
				String name = rs.getString(2);  //rs.getString("상품명");
				
				//getInt("price") : 컬럼 price 값을 int 형으로 리턴하는 메소드
				int price = rs.getInt(3); 		//rs.getString("가격");
				String maker = rs.getString(4); //rs.getString("제조사");
				
				System.out.printf("%-5d%-7s\t %-10s \t %10d \t %-5s \n", ++i, code, name, price, maker);
			}
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다.");
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			try {
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if (conn != null)
					conn.close(); //4단계 : DB연결을 끊는다.
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}