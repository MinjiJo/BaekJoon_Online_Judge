//GridLayout�� ����ϴ� ���α׷�
//�־��� ������ �Ȱ��� ũ���� ��� ���� ������, ������Ʈ���� �� ũ�⿡ �°� ����
//��ġ�ϴ� ���̾ƿ�
//�� ��Ű���� WindowExample.java�� �̿��Ͽ� �̺�Ʈ �߻��� ����
//�� ��ư�� Ŭ������ ��� �����̸��� �󺧿� ��Ÿ���� �غ���
package ex21_5_1_GridLayout;
import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;
class WindowExample2 extends JFrame {
	WindowExample2(){
		super("Zoo Program");
		setLocation(500, 400);
		Container contentPane = getContentPane();
		
		//3�� 3���� GridLayout �����մϴ�.
		GridLayout layout = new GridLayout(3, 3);
		
		//contentPane�� 3�� 3���� GridLayout�� �����մϴ�.
		contentPane.setLayout(layout);
		//contentPane.setBackground(Color.pink);
		contentPane.setBackground(new Color(255,128,0));//��������
		JButton b1 = new JButton("��踻");
		JButton b2 = new JButton("����");
		JButton b3 = new JButton("�ڳ���");
		JButton b4 = new JButton("�ڻԼ�");
		JButton b5 = new JButton("���");
		JButton b6 = new JButton("���̿���");
		JLabel label = new JLabel();
		label.setFont(new Font("����", Font.BOLD, 40));
		
		//contentPane�� 3�� 3���� GridLayout���� ��ư�� �߰��մϴ�.
		contentPane.add(b1);
		contentPane.add(b2);
		contentPane.add(b3);
		contentPane.add(b4);
		contentPane.add(b5);
		contentPane.add(b6);
		contentPane.add(label);
		
		ActionListener listener =
				new ConfirmButtonActionListener(
						b1, b2, b3, b4, b5, b6, label);
		
		//�����ʸ� ����մϴ�.
		//��ư�� Ŭ������ �� �̺�Ʈ�� �߻��մϴ�.
		b1.addActionListener(listener);
		b2.addActionListener(listener);
		b3.addActionListener(listener);
		b4.addActionListener(listener);
		b5.addActionListener(listener);
		b6.addActionListener(listener);
		
		//�����ư�� Ŭ������ ��� �����찡 �������� ���α׷��� ���� �ǵ��� �մϴ�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//�������� ������ ũ��� ����� �޼ҵ��Դϴ�.
		pack();
		
		//�������� ���÷����մϴ�.
		setVisible(true);
	}
	
	public static void main(String[] args) {
		WindowExample2 we = new WindowExample2();
	}
}
