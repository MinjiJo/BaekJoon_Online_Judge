//Ȯ�� ��ư�� ó���ϴ� ������ Ŭ����
//ConfirmButtonActionListener Ŭ������
//actionPerformed�޼ҵ�� JDK���̺귯���� �̺�Ʈ ó�� ��⿡ ����
//�ڵ����� ȣ��ȴ�.
package ex21_5_2_GridLayout_Arrangement;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ConfirmButtonActionListener implements ActionListener {//1�ܰ�
	JButton b[] = new JButton[6];
	JLabel label;
	
	ConfirmButtonActionListener(JButton[] b, JLabel label){
		for(int i = 0; i < b.length; i++)
			this.b[i] = b[i];
		this.label = label;
	}
	
	//2�ܰ�
	@Override
	//��ư�� Ŭ������ ��� �ؾ��� ���� ����մϴ�.
	//��ư�� Ŭ���ϸ� �ڵ����� JVM�� ���� ȣ��˴ϴ�.
	public void actionPerformed(ActionEvent e) {
		String name = "";
		for(int i = 0; i < b.length; i++) {
			if(e.getSource() == b[i]) {
				name = b[i].getText();
			}
			
			//�󺧿� ������ �ؽ�Ʈ�� �ٲٴ� �޼ҵ��Դϴ�.
			label.setText("Hello, " + name);
		}
	}
}
