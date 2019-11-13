//FlowLayout ����ϴ� ���α׷�
//�¿��� ��� ������Ʈ�� �迭�ϴٰ� ���� ���ڶ�� ���� �ٲ㼭 ��� �迭�ϴ� ���̾ƿ�
//�����̳��� ũ�Ⱑ ����Ǹ� ������Ʈ���� ��ġ�� ���ϰ� ũ��� �����˴ϴ�.
package ex21_5_3_FlowLayout;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JButton;
public class WindowExample extends JFrame{
	WindowExample(){
		super("Fruit Basket Program");
		setLocation(500, 400);
		Container contentPane = getContentPane();
		
		//FlowLayout��ü �����մϴ�.
		FlowLayout layout = new FlowLayout();
		
		//ContentPane�� FlowLayout���� �����մϴ�.
		contentPane.setLayout(layout);
		
		//ContentPane�� FlowLayout���� ��ư�� �߰��մϴ�.
		contentPane.add(new JButton("���"));
		contentPane.add(new JButton("���ξ���"));
		contentPane.add(new JButton("������"));
		contentPane.add(new JButton("����"));
		contentPane.add(new JButton("����"));
		contentPane.add(new JButton("������"));

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
