package homework_191018;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class CRUD extends JFrame {
	private static final long serialVersionUID = 1L;

	CRUD(){
		super("�Խ��� ���α׷�");
		
		setPreferredSize(new Dimension(1100, 300));
		setLocation(500, 400);

		Container contentPane = getContentPane();
		JPanel panel = new JPanel();
		
		String colNames[] = {"�۹�ȣ","�ۼ���","��й�ȣ","����","����","���ϸ�","�������ϸ�","������ȣ","�亯 ����","�亯����","��ȸ��","��¥"};
		DefaultTableModel model = new DefaultTableModel(colNames, 0);
		
		JTable table = new JTable(model);
		
		table.getColumn("����").setPreferredWidth(120);
		table.getColumn("����").setPreferredWidth(120);

		DAO dao = new DAO();
		for(int i = 0; i < dao.selectAll().size(); i++) {
			model.addRow(dao.selectAll().get(i));
		}
		
		JScrollPane scrollPane = new JScrollPane(table);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JTextField text1 = new JTextField(6);
		JTextField text2 = new JTextField(4);
		JTextField text3 = new JTextField(20);
		JTextField text4 = new JTextField(20);
		JButton b1 = new JButton("�߰�");
		JButton b2 = new JButton("����");
		JButton b3 = new JButton("����");
		JButton b4 = new JButton("�亯");

		panel.add(new JLabel("�ۼ���"));
		panel.add(text1);
		panel.add(new JLabel("��й�ȣ"));
		panel.add(text2);
		panel.add(new JLabel("����"));
		panel.add(text3);
		panel.add(new JLabel("����"));
		panel.add(text4);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		
		b1.addActionListener(new AddActionListener(table,text1,text2,text3,text4));
		b2.addActionListener(new DeleteActionListener(table));
		b3.addActionListener(new UpdateActionListener(table));
		b4.addActionListener(new ReAddActionListener(table,text1,text2,text3,text4));
		contentPane.add(panel, BorderLayout.SOUTH);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		CRUD tl = new CRUD();
	}
}