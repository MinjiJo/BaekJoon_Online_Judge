//GridLayout을 사용하는 프로그램
//주어진 영역을 똑같은 크기의 행과 열로 나누고, 컴포넌트들을 그 크기에 맞게 만들어서
//배치하는 레이아웃
//앞 패키지의 WindowExample.java를 이용하여 이벤트 발생해 보기
//각 버튼을 클릭했을 경우 동물이름을 라벨에 나타나게 해보기
package ex21_5_2_GridLayout_Arrangement;
import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;
class WindowExample extends JFrame {
	WindowExample(){
		super("Zoo Program");
		setLocation(500, 400);
		Container contentPane = getContentPane();
		
		//3행 3열의 GridLayout 생성합니다.
		GridLayout layout = new GridLayout(3, 3);
		
		//contentPane을 3행 3열의 GridLayout로 설정합니다.
		contentPane.setLayout(layout);
		
		JButton b[] = new JButton[6];
		String name[]= {"얼룩말","사자","코끼리","코뿔소","펭귄","하이에나"};
		for(int i = 0; i < name.length; i++) {
			b[i] = new JButton(name[i]);
			
		}
		
		//ContentPane에 3행 3열의 GridLayout으로 버튼을 추가합니다.
		for(int i = 0; i < name.length; i++) {
			contentPane.add(b[i]);
		}
		
		//contentPane.setBackground(Color.pink);
		contentPane.setBackground(new Color(255,128,0));//오렌지색
		JLabel label = new JLabel();
		label.setFont(new Font("굴림", Font.BOLD, 40));
		
		contentPane.add(label);
		
		ActionListener listener =
				new ConfirmButtonActionListener(
						b, label);
		
		//리스너를 등록합니다.
		//버튼을 클릭했을 때 이벤트가 발생합니다.
		for(int i = 0; i < name.length; i++) {
			b[i].addActionListener(listener);
		}
		
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
