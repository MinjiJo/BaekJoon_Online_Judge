package homework_191018;

import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class ReAddActionListener implements ActionListener {
	PreparedStatement pstmt = null;
	Connection conn = null;
	
	JTable table;
	JTextField text1, text2, text3, text4;
	
	ReAddActionListener(JTable table, JTextField text1, JTextField text2, JTextField text3, JTextField text4){
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
		
		int row = table.getSelectedRow();
		
		int num = (int) model.getValueAt(row, 7);
		int level_num = (int) model.getValueAt(row, 8);
		int count_num = (int) model.getValueAt(row,  9);
		
		dao.re_insert(text1.getText(), text2.getText(),
				text3.getText(), text4.getText(), num, level_num, count_num);
		
		for(int i = 0; i < model.getRowCount(); i++) {
			if((int)model.getValueAt(i, 7) == num & (int)model.getValueAt(i, 9) > count_num) {
				model.setValueAt((int)model.getValueAt(i, 9) + 1, i, 9);
			}
		}
		
		for(int i = 0; i < dao.select_max().size(); i++) {
			model.insertRow(row+1, dao.select_max().get(i));
		}
	}
}