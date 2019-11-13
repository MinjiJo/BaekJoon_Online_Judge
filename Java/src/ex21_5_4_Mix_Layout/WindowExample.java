package ex21_5_4_Mix_Layout;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
public class WindowExample extends JFrame {
	WindowExample(){
		super("����ó ���α׷�");
		
		//�������� ũ�⸦ �ٲߴϴ�.
		setPreferredSize(new Dimension(400, 250));
		
		//�������� ��ġ�� �����մϴ�.
		setLocation(500, 400);
		
		//�����ӿ� �ִ� content pane�� �����ɴϴ�.
		Container contentPane = getContentPane();
		
		//�г��� �����մϴ�. �⺻ ���̾ƿ� : FlowLayout
		JPanel panel = new JPanel();
		//�г��� 3�� 2���� GridLayout�� �����մϴ�.
		panel.setLayout(new GridLayout(4,2));
		
		//�� ���� TextField �����մϴ�.
		JTextField text1 = new JTextField();
		JTextField text2 = new JTextField();
		JTextField text3 = new JTextField();
		
		//�гο� ���� �߰��մϴ�.
		panel.add(new JLabel("�̸�"));
		//�гο� text1 ������Ʈ�� �߰��մϴ�.
		panel.add(text1);
		
		//�гο� ���� �߰��մϴ�.
		panel.add(new JLabel("�ּ�"));
		//�гο� text2 ������Ʈ�� �߰��մϴ�.
		panel.add(text2);
		
		//�гο� ���� �߰��մϴ�.
		panel.add(new JLabel("��ȭ��ȣ"));
		//�гο� text3 ������Ʈ�� �߰��մϴ�.
		panel.add(text3);
		
		//contentPane ���� �г��� BorderLayout.CENTER�� �߰��մϴ�.
		contentPane.add(panel, BorderLayout.CENTER);
		
		JButton button = new JButton("�Է�");
		
		//contentPane ���� �Է� ��ư�� BorderLayout.SOUTH�� �߰��մϴ�.
		contentPane.add(button, BorderLayout.SOUTH);
		
		ActionListener listener = 
				new ConfirmButtonActionListener(text1, text2, text3);

		button.addActionListener(listener);
		
		//�����ư�� Ŭ������ ��� �����찡 �������� ���α׷��� ����ǵ��� �մϴ�.
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
