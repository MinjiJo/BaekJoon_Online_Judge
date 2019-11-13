package ex21_1_JFrame1;
import javax.swing.*;
public class WindowExample4 extends JFrame{
	WindowExample4(){
		//슈퍼클래스의 생성자 인자값으로 타이를 설정할 수 있습니다.
		//super("이곳은 타이틀바입니다.");
		
		//메소드를 이용한 타이틀 설정 방법
		setTitle("이곳은");
		
		//라벨을 생성하는 식입니다.
		JLabel label = new JLabel("Hello, Yeonjin, Sun:)");
		add(label);
		
		//프레임을 디스플레이를 하면 그 위에 있는 컴포넌트들도 자동으로 디스플레이 됩니다.
		//프레임에 속해 있는 컴포넌트들의 크기에 맞게 프레임의 크기를 조정합니다.
		//프레임을 적당한 크기로 만드는 메소드입니다.
		pack();
		
		//프레임을 디스플레이합니다.
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowExample4();
	}
}
