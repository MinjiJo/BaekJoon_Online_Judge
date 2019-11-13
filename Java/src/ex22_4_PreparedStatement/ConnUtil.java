package ex22_4_PreparedStatement;
import java.sql.*;
public class ConnUtil {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�."
				+ cnfe.getMessage());
		}
	}
	
	public static Connection getConnection() throws SQLException{
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		return DriverManager.getConnection(url, "scott", "tiger");
	}
}
