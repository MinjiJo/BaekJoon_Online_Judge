package ex21_7_DefaultTableModel;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
public class RemoveActionListener implements ActionListener{
	JTable table;
	
	public RemoveActionListener(JTable table){
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
	}
}
