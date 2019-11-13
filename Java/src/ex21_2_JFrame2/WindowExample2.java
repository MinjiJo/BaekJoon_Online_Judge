package ex21_2_JFrame2;
import java.awt.*;
import javax.swing.*;
public class WindowExample2 extends JFrame{
	WindowExample2(){
		//Ÿ��Ʋ�� �ִ� ������ �����մϴ�.
		super("Hello Program");
		
		//�������� ũ�⸦ �ٲߴϴ�.
		setPreferredSize(new Dimension(300, 100));
		
		//�������� ��ġ�� �����մϴ�.
		setLocation(500, 400);
		
		// �����ӿ� �ִ� content pane�� �����ɴϴ�.
		Container contentPane = getContentPane();
		
		// �ؽ�Ʈ ���ڸ� �����մϴ�.
		JTextField text = new JTextField();
		
		// ��ư�� ǥ���� �ؽ�Ʈ�� ������ �Ķ���ͷ� �Ѱ��ݴϴ�.
		JButton button = new JButton("Ȯ��");
		
		// �󺧿� ǥ���� �ؽ�Ʈ�� ������ �Ķ���ͷ� �Ѱ��ݴϴ�.
		JLabel label = new JLabel("Hello", SwingConstants.CENTER);
		
		// ������Ʈ�� ��ġ�մϴ�.
		contentPane.add(text, BorderLayout.CENTER);
		contentPane.add(button, BorderLayout.EAST);
		contentPane.add(label, BorderLayout.SOUTH);
		
		// �����ư�� Ŭ������ ��� �����찡 �������� ���α׷��� ���� �ǵ��� �մϴ�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// �������� ������ ũ��� ����� �޼ҵ��Դϴ�.
		pack();
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowExample2();
	}
}
