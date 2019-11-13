//GridLayout�� ����ϴ� ���α׷�
//�־��� ������ �Ȱ��� ũ���� ��� ���� ������, ������Ʈ���� �� ũ�⿡ �°� ����
//��ġ�ϴ� ���̾ƿ�
//�� ��Ű���� WindowExample.java�� �̿��Ͽ� �̺�Ʈ �߻��� ����
//�� ��ư�� Ŭ������ ��� �����̸��� �󺧿� ��Ÿ���� �غ���
package ex21_5_2_GridLayout_Arrangement;
import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;
class WindowExample extends JFrame {
	WindowExample(){
		super("Zoo Program");
		setLocation(500, 400);
		Container contentPane = getContentPane();
		
		//3�� 3���� GridLayout �����մϴ�.
		GridLayout layout = new GridLayout(3, 3);
		
		//contentPane�� 3�� 3���� GridLayout�� �����մϴ�.
		contentPane.setLayout(layout);
		
		JButton b[] = new JButton[6];
		String name[]= {"��踻","����","�ڳ���","�ڻԼ�","���","���̿���"};
		for(int i = 0; i < name.length; i++) {
			b[i] = new JButton(name[i]);
			
		}
		
		//ContentPane�� 3�� 3���� GridLayout���� ��ư�� �߰��մϴ�.
		for(int i = 0; i < name.length; i++) {
			contentPane.add(b[i]);
		}
		
		//contentPane.setBackground(Color.pink);
		contentPane.setBackground(new Color(255,128,0));//��������
		JLabel label = new JLabel();
		label.setFont(new Font("����", Font.BOLD, 40));
		
		contentPane.add(label);
		
		ActionListener listener =
				new ConfirmButtonActionListener(
						b, label);
		
		//�����ʸ� ����մϴ�.
		//��ư�� Ŭ������ �� �̺�Ʈ�� �߻��մϴ�.
		for(int i = 0; i < name.length; i++) {
			b[i].addActionListener(listener);
		}
		
		//�����ư�� Ŭ������ ��� �����찡 �������� ���α׷��� ���� �ǵ��� �մϴ�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//�������� ������ ũ��� ����� �޼ҵ��Դϴ�.
		pack();
		
		//�������� ���÷����մϴ�.
		setVisible(true);
	}
	
	public static void main(String[] args) {
		WindowExample we = new WindowExample();
	}
}
