package ex21_1_JFrame1;
import javax.swing.*;
public class WindowExample4 extends JFrame{
	WindowExample4(){
		//����Ŭ������ ������ ���ڰ����� Ÿ�̸� ������ �� �ֽ��ϴ�.
		//super("�̰��� Ÿ��Ʋ���Դϴ�.");
		
		//�޼ҵ带 �̿��� Ÿ��Ʋ ���� ���
		setTitle("�̰���");
		
		//���� �����ϴ� ���Դϴ�.
		JLabel label = new JLabel("Hello, Yeonjin, Sun:)");
		add(label);
		
		//�������� ���÷��̸� �ϸ� �� ���� �ִ� ������Ʈ�鵵 �ڵ����� ���÷��� �˴ϴ�.
		//�����ӿ� ���� �ִ� ������Ʈ���� ũ�⿡ �°� �������� ũ�⸦ �����մϴ�.
		//�������� ������ ũ��� ����� �޼ҵ��Դϴ�.
		pack();
		
		//�������� ���÷����մϴ�.
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowExample4();
	}
}
