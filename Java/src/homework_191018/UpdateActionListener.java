package homework_191018;

import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class UpdateActionListener implements ActionListener {
	PreparedStatement pstmt = null;
	Connection conn = null;
	
	JTable table;
	
	UpdateActionListener(JTable table){
		this.table = table;
	}
	
	public void actionPerformed(ActionEvent e) {
		DefaultTableModel model = 
				(DefaultTableModel) table.getModel();
		DAO dao = new DAO();
		
		int row = table.getSelectedRow();
		int num = (int) model.getValueAt(row, 0);
		String name = (String) model.getValueAt(row, 1);
		String pass = (String) model.getValueAt(row, 2);
		String title = (String) model.getValueAt(row, 3);
		String content = (String) model.getValueAt(row, 4);

		dao.update(name, pass, title, content, num);
	}
}