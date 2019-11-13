//버튼을 클릭했을때 이벤트(사용자나 프로그램에 의해 발생할 수 있는 사건)가
//발생하는 프로그램입니다.
package ex21_4_Button_ActionListener;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
public class WindowExample extends JFrame{
	WindowExample(){
		super("Hello Program-버튼 이벤트");
		
		setPreferredSize(new Dimension(300, 100));
		setLocation(500, 400);
		
		Container contentPane = getContentPane();
		
		JTextField text = new JTextField();
		
		// 버튼에 표시할 텍스트를 생성자 파라미터로 넘겨줍니다.
		JButton button = new JButton("확인");
		
		// 라벨에 표시할 텍스트를 생성자 파라미터로 넘겨줍니다.
		JLabel label = new JLabel("Hello", SwingConstants.CENTER);
		
		// 컴포넌트를 배치합니다.
		contentPane.add(text, BorderLayout.CENTER);
		contentPane.add(button, BorderLayout.EAST);
		contentPane.add(label, BorderLayout.SOUTH);
		
		/*
		 * 3단계
		 * 이벤트 리스너(Event Listener-이벤트 감지기) :
		       이벤트를 처리하는 클래스(이벤트 핸들러)의 객체로 이벤트를 감지하고 처리합니다.

		 * 여기서 이벤트 소스는 button,
		       이벤트 핸들러는 ConfirmButtonActionListener,
		       이벤트 리스너는 listener입니다.
		 */
		// 확인 버튼 처리 리스너를 생성합니다.
		ActionListener listener =
				new ConfirmButtonActionListener(text, label);
		
		//이벤트 리스너를 등록합니다.
		//버튼을 클릭했을 때 이벤트가 발생합니다.
		//이벤트 소스(Event Source - 이벤트 발생지) : 이벤트가 발생한 컴포넌트
		//사용자가 Button을 눌렀을 때 이벤트가 발생하고 Button은 이벤트의 소스가 됩니다.
		button.addActionListener(listener);
		text.addActionListener(listener);
		
		// 종료버튼을 클릭했을 경우 윈도우가 닫혀지고 프로그램이 종료 되도록 합니다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowExample();
	}
}
