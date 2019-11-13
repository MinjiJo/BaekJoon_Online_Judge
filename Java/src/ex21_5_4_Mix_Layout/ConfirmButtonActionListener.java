//확인 버튼을 처리하는 리스너 클래스
//ConfirmButtonActionListener 클래스의
//actionPerformed메소드는 JDK라이브러리의 이벤트 처리 모듈에 의해
//자동으로 호출된다.
package ex21_5_4_Mix_Layout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ConfirmButtonActionListener implements ActionListener {//1단계
	JTextField text1, text2, text3;
	
	ConfirmButtonActionListener(JTextField text1, JTextField text2, JTextField text3){
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
	}
	
	//2단계
	@Override
	//버튼을 클릭했을 경우 해야할 일을 기술합니다.
	//버튼을 클릭하면 자동으로 JVM에 의해 호출됩니다.
	public void actionPerformed(ActionEvent e) {
		System.out.println("이름 : " + text1.getText());
		System.out.println("주소 : " + text2.getText());
		System.out.println("전화번호 : " + text3.getText());
	}
}
