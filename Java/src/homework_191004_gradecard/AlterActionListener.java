package homework_191004_gradecard;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
public class AlterActionListener implements ActionListener {
	JTable table;
	JTextField text1, text2, text3, text4;
	
	AlterActionListener(JTable table, JTextField text1, JTextField text2, JTextField text3, JTextField text4){
		this.table = table;
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
		this.text4 = text4;
	}
	
	public void actionPerformed(ActionEvent e) {
		DefaultTableModel model = 
				(DefaultTableModel) table.getModel();
		
		Object arr[] = {text1.getText(), text2.getText(),
						text3.getText(), text4.getText()};
		
		model.addRow(arr);
	}
	
}
