//GridLayout�� ����ϴ� ���α׷�
package ex21_5_1_GridLayout;
import java.awt.*;
import javax.swing.*;
class WindowExample extends JFrame {
	WindowExample(){
		super("Zoo Program");
		setLocation(400, 500);
		setPreferredSize(new Dimension(500, 600));
		Container contentPane = getContentPane();
		
		//3�� 2���� GridLayout �����մϴ�.
		GridLayout layout = new GridLayout(3, 2);
		
		//contentPane�� 3�� 2���� GridLayout�� �����մϴ�.
		contentPane.setLayout(layout);
		
		//contentPane�� 3�� 2���� GridLayout���� ��ư�� �߰��մϴ�.
		contentPane.add(new JButton("��踻"));
		contentPane.add(new JButton("����"));
		contentPane.add(new JButton("�ڳ���"));
		contentPane.add(new JButton("�ڻԼ�"));
		contentPane.add(new JButton("���"));
		contentPane.add(new JButton("���̿���"));
		
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
