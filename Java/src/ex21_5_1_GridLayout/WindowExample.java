//GridLayout을 사용하는 프로그램
package ex21_5_1_GridLayout;
import java.awt.*;
import javax.swing.*;
class WindowExample extends JFrame {
	WindowExample(){
		super("Zoo Program");
		setLocation(400, 500);
		setPreferredSize(new Dimension(500, 600));
		Container contentPane = getContentPane();
		
		//3행 2열의 GridLayout 생성합니다.
		GridLayout layout = new GridLayout(3, 2);
		
		//contentPane을 3행 2열의 GridLayout로 설정합니다.
		contentPane.setLayout(layout);
		
		//contentPane에 3행 2열의 GridLayout으로 버튼을 추가합니다.
		contentPane.add(new JButton("얼룩말"));
		contentPane.add(new JButton("사자"));
		contentPane.add(new JButton("코끼리"));
		contentPane.add(new JButton("코뿔소"));
		contentPane.add(new JButton("펭귄"));
		contentPane.add(new JButton("하이에나"));
		
		//종료버튼을 클릭했을 경우 윈도우가 닫혀지고 프로그램이 종료 되도록 합니다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//프레임을 적당한 크기로 만드는 메소드입니다.
		pack();
		
		//프레임을 디스플레이합니다.
		setVisible(true);
	}
	
	public static void main(String[] args) {
		WindowExample we = new WindowExample();
	}
}
