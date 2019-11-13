package ex21_2_JFrame2;
import java.awt.*;
import javax.swing.*;
public class WindowExample2 extends JFrame{
	WindowExample2(){
		//타이틀이 있는 프레임 생성합니다.
		super("Hello Program");
		
		//윈도우의 크기를 바꿉니다.
		setPreferredSize(new Dimension(300, 100));
		
		//윈도우의 위치를 지정합니다.
		setLocation(500, 400);
		
		// 프레임에 있는 content pane을 가져옵니다.
		Container contentPane = getContentPane();
		
		// 텍스트 상자를 생성합니다.
		JTextField text = new JTextField();
		
		// 버튼에 표시할 텍스트를 생성자 파라미터로 넘겨줍니다.
		JButton button = new JButton("확인");
		
		// 라벨에 표시할 텍스트를 생성자 파라미터로 넘겨줍니다.
		JLabel label = new JLabel("Hello", SwingConstants.CENTER);
		
		// 컴포넌트를 배치합니다.
		contentPane.add(text, BorderLayout.CENTER);
		contentPane.add(button, BorderLayout.EAST);
		contentPane.add(label, BorderLayout.SOUTH);
		
		// 종료버튼을 클릭했을 경우 윈도우가 닫혀지고 프로그램이 종료 되도록 합니다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 프레임을 적당한 크기로 만드는 메소드입니다.
		pack();
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowExample2();
	}
}
