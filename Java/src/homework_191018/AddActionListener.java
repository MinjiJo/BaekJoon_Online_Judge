package homework_191018;

import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class AddActionListener implements ActionListener {
	PreparedStatement pstmt = null;
	Connection conn = null;
	
	JTable table;
	JTextField text1, text2, text3, text4;
	
	AddActionListener(JTable table, JTextField text1, JTextField text2, JTextField text3, JTextField text4){
		this.table = table;
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
		this.text4 = text4;
	}
	
	public void actionPerformed(ActionEvent e) {
		DefaultTableModel model = 
				(DefaultTableModel) table.getModel();
		DAO dao = new DAO();
		
		dao.insert(text1.getText(), text2.getText(),
				text3.getText(), text4.getText());
		
		for(int i = 0; i < dao.select_max().size(); i++) {
			model.insertRow(0, dao.select_max().get(i));
		}
	}
}