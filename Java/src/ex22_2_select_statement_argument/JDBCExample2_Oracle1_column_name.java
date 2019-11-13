//�����ͺ��̽��� ���̺�κ��� ���ǿ� �´� �����͸� �Է¹޾� ó���ϴ� ���α׷�
//arguments�ǿ� "������ TV"��� �Է��ϼ���
package ex22_2_select_statement_argument;
import java.sql.*;
public class JDBCExample2_Oracle1_column_name {
	public static void main(String args[]) {
		if (args.length != 1) {
			System.out.println("��ǰ�� �Է��ϼ���");
			return;
		}
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//1�ܰ� : JDBC ����̹��� �ε��Ѵ�.
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			
			//2�ܰ� : DB�� �����Ѵ�.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");
			
			/* �����ͺ��̽��� �ִ� ���̺��� �����͸� �о���� ���� Statement ��ü�� �ʿ�
			 2�ܰ迡�� ���� Connection ��ü�� ���� createStatement �޼ҵ带
			 ȣ���ؼ� ����ϴ�.
			 */
			stmt = conn.createStatement();
			
			/*
			   Statement Ÿ���� java.sql ��Ű���� ���ϴ� �������̽� �̸�����
			   select���� �����ϴ� executeQuery��� �޼ҵ尡 �ֽ��ϴ�.
			   �� �޼ҵ忡 �Ķ���ͷ� select ������ �Ѱ��־�� �մϴ�.
			   �� �޼ҵ�� �Ķ���ͷ� �Ѱ��� select ���� ������ ���̽���
			   ������ �����ϰ� �� ����� ResultSet ��ü�� �����մϴ�.
			 */
			//String arg = args[0];
			String select_sql =
					"select code, name, price, maker "
					+ "from goodsinfo "
					+ "where name = '" + args[0] + "'";
			
			rs = stmt.executeQuery(select_sql);
			
			System.out.println("��ȣ   ��ǰ�ڵ� \t  ��ǰ��\t\t\t����	������");
			System.out.println("--------------------------------------------------------");
			
			/*
			 ResultSet ��ü�κ��� select���� ���� ����� ��� ���ؼ��� ����
			 next() �޼ҵ带 ȣ���ؾ� �մϴ�.
			 rs.next() - ���� ����� ���� �� ��ġ�� �̵��ϴ� �޼ҵ�� �������
			 boolean���� ������ ���� �о� �Դ��� �����Դϴ�.
			 */
			int i = 0;
			while (rs.next()) {//�� �̻� ���� �����Ͱ� ���� ������ �ݺ�
				//getString("code") : �÷� code ���� String ������ �����ϴ� �޼ҵ�
				String code = rs.getString(1);  //rs.getString("��ǰ�ڵ�");
				String name = rs.getString(2);  //rs.getString("��ǰ��");
				
				//getInt("price") : �÷� price ���� int ������ �����ϴ� �޼ҵ�
				int price = rs.getInt(3); 		//rs.getString("����");
				String maker = rs.getString(4); //rs.getString("������");
				
				System.out.printf("%-5d%-7s\t %-10s \t %10d \t %-5s \n", ++i, code, name, price, maker);
			}
		} catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�.");
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
					conn.close(); //4�ܰ� : DB������ ���´�.
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}