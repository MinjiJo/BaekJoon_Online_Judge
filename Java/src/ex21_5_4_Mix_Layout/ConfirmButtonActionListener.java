//Ȯ�� ��ư�� ó���ϴ� ������ Ŭ����
//ConfirmButtonActionListener Ŭ������
//actionPerformed�޼ҵ�� JDK���̺귯���� �̺�Ʈ ó�� ��⿡ ����
//�ڵ����� ȣ��ȴ�.
package ex21_5_4_Mix_Layout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ConfirmButtonActionListener implements ActionListener {//1�ܰ�
	JTextField text1, text2, text3;
	
	ConfirmButtonActionListener(JTextField text1, JTextField text2, JTextField text3){
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
	}
	
	//2�ܰ�
	@Override
	//��ư�� Ŭ������ ��� �ؾ��� ���� ����մϴ�.
	//��ư�� Ŭ���ϸ� �ڵ����� JVM�� ���� ȣ��˴ϴ�.
	public void actionPerformed(ActionEvent e) {
		System.out.println("�̸� : " + text1.getText());
		System.out.println("�ּ� : " + text2.getText());
		System.out.println("��ȭ��ȣ : " + text3.getText());
	}
}
