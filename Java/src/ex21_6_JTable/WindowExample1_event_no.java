//JTable - ǥ�� �̿��� ���α׷�
//�̺�Ʈ ������
package ex21_6_JTable;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class WindowExample1_event_no extends JFrame{
	WindowExample1_event_no(){
		super("������ ��� ���α׷�");
		
		//�������� ũ�⸦ �ٲߴϴ�.
		setPreferredSize(new Dimension(300, 300));
		
		//�������� ��ġ�� �����մϴ�.
		setLocation(100, 100);
		
		//�����ӿ� �ִ� content pane�� �����ɴϴ�.
		Container contentPane = getContentPane();
		
		//�÷� �̸��� �ִ� 1���� �迭
		String colNames[] = { "�̸�", "����", "����" };
		
		//������ �׸��� �ִ� 2���� �迭
		Object data[][] = { {"��ö��", 24, '��'},
							{"�̼���", 21, '��'},
							{"������", 26, '��'}};
		
		/*
		 javax.swing.JTable.JTable(Object[][] rowData,
		 						   Object[] columnNames)
			ù��° �Ķ���� : 2���� �迭(������ �׸�)
			�ι�° �Ķ���� : 1���� �迭(�÷� �̸�)
			JTable �����մϴ�.
		 */
		JTable table = new JTable(data, colNames);
		
		//���̺��� �÷��� ScrollPane�� �����մϴ�.
		JScrollPane scrollPane = new JScrollPane(table);
		
		//contentPane�� scrollPane�� BorderLayout.CENTER�� ��ġ�մϴ�.
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		//��ư�� �����մϴ�.
		JButton button = new JButton("���");
		
		//new PrintActionListener(table) : ������ ����
		//��� ��ư ó�� �����ʸ� ����մϴ�.
		button.addActionListener(new PrintActionListener(table));
		
		//contentPane�� ��ư�� BorderLayout.SOUTH�� ��ġ�մϴ�.
		contentPane.add(button, BorderLayout.SOUTH);
		
		//�����ư�� Ŭ������ ��� �����찡 �������� ���α׷��� ���� �ǵ��� �մϴ�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//�������� ������ ũ��� ����� �޼ҵ��Դϴ�.
		pack();
		
		//�������� ���÷����մϴ�.
		setVisible(true);
	}
	
	public static void main(String[] args) {
		WindowExample1_event_no we = new WindowExample1_event_no();
	}
}
