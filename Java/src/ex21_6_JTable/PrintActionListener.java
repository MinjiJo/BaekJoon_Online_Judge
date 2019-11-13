package ex21_6_JTable;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
public class PrintActionListener implements ActionListener{
	JTable table;
	
	PrintActionListener(JTable table){
		this.table = table;
	}
	
	//��� ��ư Ŭ���� �߻��ϴ� �̺�Ʈ ó�� �޼ҵ��Դϴ�.
	public void actionPerformed(ActionEvent e) {
		
		//���̺��� ��(���̺��� ������ ����� ��ü)�� �����ɴϴ�.
		TableModel model = table.getModel();
		
		//���� ���� ���� �����ɴϴ�.
		int rowNum = model.getRowCount();
		
		//���� ���� ���� �����ɴϴ�.
		int colNum = model.getColumnCount();
		
		//���� �� ��ŭ �ݺ��մϴ�.
		//getColumnName(col) : col��° �÷� �̸��� �����ɴϴ�.
		for (int col = 0; col < colNum; col++) {
			String colName = model.getColumnName(col);
			System.out.print(colName + "\t");
		}
		System.out.println("\n------------------------");
		
		//getValueAt(row, col):row��, col���� ��ġ�� ���� �����ɴϴ�.
		for (int row = 0; row < rowNum; row++) {
			for (int col = 0; col < colNum; col++) {
				Object obj = model.getValueAt(row, col);
				System.out.print(obj + "\t");
			}
			System.out.println();
		}
		System.out.println("========================");
	}	
}
