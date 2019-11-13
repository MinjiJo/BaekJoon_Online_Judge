package ex21_7_DefaultTableModel;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
public class AddActionListener implements ActionListener{
	JTable table;
	JTextField text1, text2, text3;
	
	AddActionListener(JTable table, JTextField text1, JTextField text2, JTextField text3){
		this.table = table;
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
	}
	
	//추가 버튼을 클릭했을 때 처리하는 메소드입니다.
	public void actionPerformed(ActionEvent e) {
		DefaultTableModel model = 
				(DefaultTableModel) table.getModel();
		
		Object arr[] = {text1.getText(), text2.getText(),
						text3.getText()};
		
		model.addRow(arr);
	}
}
