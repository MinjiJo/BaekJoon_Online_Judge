//GridLayout을 사용하는 프로그램
//주어진 영역을 똑같은 크기의 행과 열로 나누고, 컴포넌트들을 그 크기에 맞게 만들어서
//배치하는 레이아웃
//앞 패키지의 WindowExample.java를 이용하여 이벤트 발생해 보기
//각 버튼을 클릭했을 경우 동물이름을 라벨에 나타나게 해보기
package ex21_5_1_GridLayout;
import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;
class WindowExample2 extends JFrame {
	WindowExample2(){
		super("Zoo Program");
		setLocation(500, 400);
		Container contentPane = getContentPane();
		
		//3행 3열의 GridLayout 생성합니다.
		GridLayout layout = new GridLayout(3, 3);
		
		//contentPane을 3행 3열의 GridLayout로 설정합니다.
		contentPane.setLayout(layout);
		//contentPane.setBackground(Color.pink);
		contentPane.setBackground(new Color(255,128,0));//오레지색
		JButton b1 = new JButton("얼룩말");
		JButton b2 = new JButton("사자");
		JButton b3 = new JButton("코끼리");
		JButton b4 = new JButton("코뿔소");
		JButton b5 = new JButton("펭귄");
		JButton b6 = new JButton("하이에나");
		JLabel label = new JLabel();
		label.setFont(new Font("굴림", Font.BOLD, 40));
		
		//contentPane에 3행 3열의 GridLayout으로 버튼을 추가합니다.
		contentPane.add(b1);
		contentPane.add(b2);
		contentPane.add(b3);
		contentPane.add(b4);
		contentPane.add(b5);
		contentPane.add(b6);
		contentPane.add(label);
		
		ActionListener listener =
				new ConfirmButtonActionListener(
						b1, b2, b3, b4, b5, b6, label);
		
		//리스너를 등록합니다.
		//버튼을 클릭했을 때 이벤트가 발생합니다.
		b1.addActionListener(listener);
		b2.addActionListener(listener);
		b3.addActionListener(listener);
		b4.addActionListener(listener);
		b5.addActionListener(listener);
		b6.addActionListener(listener);
		
		//종료버튼을 클릭했을 경우 윈도우가 닫혀지고 프로그램이 종료 되도록 합니다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//프레임을 적당한 크기로 만드는 메소드입니다.
		pack();
		
		//프레임을 디스플레이합니다.
		setVisible(true);
	}
	
	public static void main(String[] args) {
		WindowExample2 we = new WindowExample2();
	}
}
