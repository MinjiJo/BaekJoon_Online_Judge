package ex21_2_JFrame2;
import java.awt.*;
import javax.swing.*;
public class WindowExample extends JFrame{
	WindowExample(){
		//타이틀이 있는 프레임 생성합니다.
		super("Hello Java Program");
		
		//윈도우의 위치를 지정합니다.
		setLocation(100, 100);//(x좌표, y좌표)
		
		//윈도우의 크기를 바꿉니다.
		//java.awt.Dimension(int width, int height)-너비, 높이
		setPreferredSize(new Dimension(800, 500));
		
		//두 번째 파라미터로 라벨의 문자열을 중앙에 표시하도록 합니다.
		JLabel label = new JLabel("안녕하세요 자바님", SwingConstants.CENTER);
		label.setFont(new Font("굴림", Font.BOLD, 40));
		
		//프레임에 있는 content pane을 가져옵니다.
		Container contentPane = getContentPane();
		
		//라벨을 content pane위에 올려놓습니다.
		contentPane.add(label);
		
		//종료버튼을 클릭했을 경우 윈도우가 닫혀지고 프로그램이 종료 되도록 합니다.
		//setDefaultCloseOperation-종료 버튼을 눌렀을 때 해야 할 일을 지시하는 메소드
		//EXIT_ON_CLOSE:닫기 버튼을 클릭했을 때 프로그램 종료(exit)하라는 의미입니다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//프레임에 속해있는 컴포넌트들의 크기에 맞게 프레임의 크기를 조정합니다.
		//프레임을 적당한 크기로 만드는 메소드입니다.
		pack();
		
		//프레임을 디스플레이합니다.
		//프레임을 디스플레이 하면 그 위에 있는 컴포넌트들도 자동으로 디스플레이 됩니다.
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowExample();
	}
}
