//���̺� ���� �߰�/�����ϴ� ������ ���α׷�
//���̺��� �߰��� DefaultTableModel Ŭ������ addRow �޼ҵ��
//insertRow �޼ҵ带 ȣ���Ѵ�.
//���̺� �ִ� Ư�� ���� �����ϱ� ���ؼ��� DefaultTableModel Ŭ������
//removeRow �޼ҵ带 ����Ѵ�.
package ex21_7_DefaultTableModel;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
class WindowExample extends JFrame {
	WindowExample(){
		super("������ ��� ���α׷�");
		setPreferredSize(new Dimension(400, 200));
		setLocation(500, 400);
		Container contentPane = getContentPane();
		
		//���̺� �����ؼ� contentPage�� �߰��մϴ�.
		String colNames[] = { "�̸�", "����", "����" };
		DefaultTableModel model =
				new DefaultTableModel(colNames, 0);
		
		JTable table = new JTable(model);
		
		//contentPane�� JScrollPane�� BorderLayout.CENTER�� ��ġ�մϴ�.
		contentPane.add(new JScrollPane(table),
									BorderLayout.CENTER);
		
		//�г�, TextField, Button �����մϴ�.
		JPanel panel = new JPanel();
		JTextField text1 = new JTextField(6);
		JTextField text2 = new JTextField(3);
		JTextField text3 = new JTextField(2);
		JButton button1 = new JButton("add");
		JButton button2 = new JButton("delete");
		
		//�гο� ������ ���� ������Ʈ���� �߰��մϴ�.
		//JPanel�� �⺻���̾ƿ��� Flowlayout �Դϴ�.
		panel.add(new JLabel("�̸�"));
		panel.add(text1);
		panel.add(new JLabel("����"));
		panel.add(text2);
		panel.add(new JLabel("����"));
		panel.add(text3);
		panel.add(button1);
		panel.add(button2);
		
		button1.addActionListener(
				new AddActionListener(table, text1, text2, text3));
		button2.addActionListener(new RemoveActionListener(table));
		
		//�г��� contentPane�� BorderLayout.SOUTH���� ��ġ�մϴ�.
		contentPane.add(panel, BorderLayout.SOUTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		WindowExample we = new WindowExample();
	}
}
