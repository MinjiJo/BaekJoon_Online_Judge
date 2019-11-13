package ex21_2_JFrame2;
import java.awt.*;
import javax.swing.*;
public class WindowExample extends JFrame{
	WindowExample(){
		//Ÿ��Ʋ�� �ִ� ������ �����մϴ�.
		super("Hello Java Program");
		
		//�������� ��ġ�� �����մϴ�.
		setLocation(100, 100);//(x��ǥ, y��ǥ)
		
		//�������� ũ�⸦ �ٲߴϴ�.
		//java.awt.Dimension(int width, int height)-�ʺ�, ����
		setPreferredSize(new Dimension(800, 500));
		
		//�� ��° �Ķ���ͷ� ���� ���ڿ��� �߾ӿ� ǥ���ϵ��� �մϴ�.
		JLabel label = new JLabel("�ȳ��ϼ��� �ڹٴ�", SwingConstants.CENTER);
		label.setFont(new Font("����", Font.BOLD, 40));
		
		//�����ӿ� �ִ� content pane�� �����ɴϴ�.
		Container contentPane = getContentPane();
		
		//���� content pane���� �÷������ϴ�.
		contentPane.add(label);
		
		//�����ư�� Ŭ������ ��� �����찡 �������� ���α׷��� ���� �ǵ��� �մϴ�.
		//setDefaultCloseOperation-���� ��ư�� ������ �� �ؾ� �� ���� �����ϴ� �޼ҵ�
		//EXIT_ON_CLOSE:�ݱ� ��ư�� Ŭ������ �� ���α׷� ����(exit)�϶�� �ǹ��Դϴ�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//�����ӿ� �����ִ� ������Ʈ���� ũ�⿡ �°� �������� ũ�⸦ �����մϴ�.
		//�������� ������ ũ��� ����� �޼ҵ��Դϴ�.
		pack();
		
		//�������� ���÷����մϴ�.
		//�������� ���÷��� �ϸ� �� ���� �ִ� ������Ʈ�鵵 �ڵ����� ���÷��� �˴ϴ�.
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowExample();
	}
}
