//�����ͺ��̽��� ���̺� �����͸� �����ϴ� ���α׷�
//executeUpdate �޼��� ���
package ex22_3_insert_delete_update;
import java.sql.*;
class JDBCExample6_Oracle_update {
	public static void main(String args[]) {
		//4		10004		���ڻ���			180000		����Ŭ
		if (args.length != 2) {
			System.out.println("������� ��ǰ�ڵ带 �Է��ϼ���");
			return;
		}
		Connection conn = null;
		Statement stmt = null;
		try {
			//1�ܰ� : JDBC ����̹��� �ε��Ѵ�.
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			
			//2�ܰ� : DB�� �����Ѵ�.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");
			
			//PreparedStatement ��ü ���
			stmt = conn.createStatement();
			
			/*
			 * INSERT, UPDATE, DELETE ���� �����ϴ� �޼���� executeUpdate()�Դϴ�.
			   executeUpdate()�� ���ϰ��� INSERT, UPDATE, DELETE
			       ����� row�� ���Դϴ�.
			 1. ���� �����͸� �Է��ϴ� ���
			 	insert into goodsinfo
			 	values('A1000', '������ TV', 350000, 'LG')
			 2. ������ �̿��ؼ� �Է��ϴ� ���
			 	insert into goodsinfo (code, name, price, maker)
			 	values('args[0]', 'args[1]', 'args[2]', 'args[3]')
			 */
			//delete from goodsinfo where code = 'args[0]'
			
			String up_sql
			= "update goodsinfo "
			+ "set maker = '" + args[0] + "'"
			+ "where code = '"+ args[1] + "'";
			System.out.println(up_sql);
			
			int rowNum = stmt.executeUpdate(up_sql);
			System.out.println(rowNum + "���� �����Ǿ����ϴ�.");
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
	}
}
