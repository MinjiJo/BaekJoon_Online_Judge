package ex21_5_4_Mix_Layout;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
public class WindowExample extends JFrame {
	WindowExample(){
		super("연락처 프로그램");
		
		//윈도우의 크기를 바꿉니다.
		setPreferredSize(new Dimension(400, 250));
		
		//윈도우의 위치를 지정합니다.
		setLocation(500, 400);
		
		//프레임에 있는 content pane을 가져옵니다.
		Container contentPane = getContentPane();
		
		//패널을 생성합니다. 기본 레이아웃 : FlowLayout
		JPanel panel = new JPanel();
		//패널을 3행 2열의 GridLayout로 설정합니다.
		panel.setLayout(new GridLayout(4,2));
		
		//세 개의 TextField 생성합니다.
		JTextField text1 = new JTextField();
		JTextField text2 = new JTextField();
		JTextField text3 = new JTextField();
		
		//패널에 라벨을 추가합니다.
		panel.add(new JLabel("이름"));
		//패널에 text1 컴포넌트를 추가합니다.
		panel.add(text1);
		
		//패널에 라벨을 추가합니다.
		panel.add(new JLabel("주소"));
		//패널에 text2 컴포넌트를 추가합니다.
		panel.add(text2);
		
		//패널에 라벨을 추가합니다.
		panel.add(new JLabel("전화번호"));
		//패널에 text3 컴포넌트를 추가합니다.
		panel.add(text3);
		
		//contentPane 위에 패널을 BorderLayout.CENTER에 추가합니다.
		contentPane.add(panel, BorderLayout.CENTER);
		
		JButton button = new JButton("입력");
		
		//contentPane 위에 입력 버튼을 BorderLayout.SOUTH에 추가합니다.
		contentPane.add(button, BorderLayout.SOUTH);
		
		ActionListener listener = 
				new ConfirmButtonActionListener(text1, text2, text3);

		button.addActionListener(listener);
		
		//종료버튼을 클릭했을 경우 윈도우가 닫혀지고 프로그램이 종료되도록 합니다.
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
