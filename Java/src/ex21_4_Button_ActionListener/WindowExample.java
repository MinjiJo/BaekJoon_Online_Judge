//��ư�� Ŭ�������� �̺�Ʈ(����ڳ� ���α׷��� ���� �߻��� �� �ִ� ���)��
//�߻��ϴ� ���α׷��Դϴ�.
package ex21_4_Button_ActionListener;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
public class WindowExample extends JFrame{
	WindowExample(){
		super("Hello Program-��ư �̺�Ʈ");
		
		setPreferredSize(new Dimension(300, 100));
		setLocation(500, 400);
		
		Container contentPane = getContentPane();
		
		JTextField text = new JTextField();
		
		// ��ư�� ǥ���� �ؽ�Ʈ�� ������ �Ķ���ͷ� �Ѱ��ݴϴ�.
		JButton button = new JButton("Ȯ��");
		
		// �󺧿� ǥ���� �ؽ�Ʈ�� ������ �Ķ���ͷ� �Ѱ��ݴϴ�.
		JLabel label = new JLabel("Hello", SwingConstants.CENTER);
		
		// ������Ʈ�� ��ġ�մϴ�.
		contentPane.add(text, BorderLayout.CENTER);
		contentPane.add(button, BorderLayout.EAST);
		contentPane.add(label, BorderLayout.SOUTH);
		
		/*
		 * 3�ܰ�
		 * �̺�Ʈ ������(Event Listener-�̺�Ʈ ������) :
		       �̺�Ʈ�� ó���ϴ� Ŭ����(�̺�Ʈ �ڵ鷯)�� ��ü�� �̺�Ʈ�� �����ϰ� ó���մϴ�.

		 * ���⼭ �̺�Ʈ �ҽ��� button,
		       �̺�Ʈ �ڵ鷯�� ConfirmButtonActionListener,
		       �̺�Ʈ �����ʴ� listener�Դϴ�.
		 */
		// Ȯ�� ��ư ó�� �����ʸ� �����մϴ�.
		ActionListener listener =
				new ConfirmButtonActionListener(text, label);
		
		//�̺�Ʈ �����ʸ� ����մϴ�.
		//��ư�� Ŭ������ �� �̺�Ʈ�� �߻��մϴ�.
		//�̺�Ʈ �ҽ�(Event Source - �̺�Ʈ �߻���) : �̺�Ʈ�� �߻��� ������Ʈ
		//����ڰ� Button�� ������ �� �̺�Ʈ�� �߻��ϰ� Button�� �̺�Ʈ�� �ҽ��� �˴ϴ�.
		button.addActionListener(listener);
		text.addActionListener(listener);
		
		// �����ư�� Ŭ������ ��� �����찡 �������� ���α׷��� ���� �ǵ��� �մϴ�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowExample();
	}
}
