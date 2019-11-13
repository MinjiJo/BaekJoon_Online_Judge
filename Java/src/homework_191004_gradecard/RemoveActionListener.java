package homework_191004_gradecard;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class RemoveActionListener implements ActionListener{
	PreparedStatement pstmt = null;
	Connection conn = null;
	
	JTable table;


	RemoveActionListener(JTable table) {
		this.table = table;
	}

	public void actionPerformed(ActionEvent e) {
		//선택한 행을 구해옵니다.
		int row = table.getSelectedRow();
		System.out.println("선택된 행 = " + row);
		if(row == -1)//선택된 행이 없을 때
			return;
		DefaultTableModel model =
				(DefaultTableModel) table.getModel();
		model.removeRow(row);
		delete(table.getSelectedColumn());
	}
	
	public void delete(int no) {
		StringBuilder sql = new StringBuilder();
		sql.append("delete from gradecard where no = ? ");
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
	}
}
