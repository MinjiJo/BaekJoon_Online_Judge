package homework_191018;

import java.awt.event.*;
import java.sql.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.*;

public class DeleteActionListener implements ActionListener {
	PreparedStatement pstmt = null;
	Connection conn = null;
	
	JTable table;
	
	DeleteActionListener(JTable table){
		this.table = table;
	}
	
	public void actionPerformed(ActionEvent e) {
		DefaultTableModel model = 
				(DefaultTableModel) table.getModel();
		DAO dao = new DAO();
		
		int row = table.getSelectedRow();
		
		int num = (int) model.getValueAt(row, 0);
		int ref = (int) model.getValueAt(row, 7);
		int level = (int) model.getValueAt(row, 8);
		int count = (int) model.getValueAt(row,  9);
		System.out.println("row: " + row + ", ref: " + ref + ", level: " + level + ", count: " + count);
				
		dao.delete_update(num, ref, count);
		model.removeRow(row);
		
		for(int i = row; i < model.getRowCount(); i++) {
			int num2 = (int) model.getValueAt(i, 0);
			int ref2 = (int) model.getValueAt(i, 7);
			int level2 = (int) model.getValueAt(i, 8);
			int count2 = (int) model.getValueAt(i,  9);
			System.out.println("num2: " + num2 + ", ref2: " + ref2 + ", level2: " + level2 + ", count2: " + count2);
			
			if(ref2 == ref && count2 >= count) {
				if(level2 <= level) {
					break;
				}
				
				dao.delete_update(num2, ref2, count);
				model.removeRow(i);
				
				i--;
			}
		}
		
		
		for(int i = row; i < model.getRowCount(); i++) {
			int num2 = (int) model.getValueAt(i, 0);
			int ref2 = (int) model.getValueAt(i, 7);
			if(ref == ref2) {
				System.out.println("ref: " + ref + ", ref2: " + ref2);
				model.removeRow(i);
				
				for(int j = 0; j < dao.select(num2).size(); j++) {
					model.insertRow(i, dao.select(num2).get(j));
				}
				System.out.println("�ٽ� model�� �߰���");
			} else {
				break;
			}
		}
	}
}