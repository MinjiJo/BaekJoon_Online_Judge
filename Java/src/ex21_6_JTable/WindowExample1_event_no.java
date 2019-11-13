//JTable - 표를 이용한 프로그램
//이벤트 미적용
package ex21_6_JTable;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class WindowExample1_event_no extends JFrame{
	WindowExample1_event_no(){
		super("참가자 명단 프로그램");
		
		//윈도우의 크기를 바꿉니다.
		setPreferredSize(new Dimension(300, 300));
		
		//윈도우의 위치를 지정합니다.
		setLocation(100, 100);
		
		//프레임에 있는 content pane을 가져옵니다.
		Container contentPane = getContentPane();
		
		//컬럼 이름이 있는 1차원 배열
		String colNames[] = { "이름", "나이", "성별" };
		
		//데이터 항목이 있는 2차원 배열
		Object data[][] = { {"김철수", 24, '남'},
							{"이순희", 21, '여'},
							{"박지영", 26, '여'}};
		
		/*
		 javax.swing.JTable.JTable(Object[][] rowData,
		 						   Object[] columnNames)
			첫번째 파라미터 : 2차원 배열(데이터 항목)
			두번째 파라미터 : 1차원 배열(컬럼 이름)
			JTable 생성합니다.
		 */
		JTable table = new JTable(data, colNames);
		
		//테이블이 올려진 ScrollPane을 생성합니다.
		JScrollPane scrollPane = new JScrollPane(table);
		
		//contentPane에 scrollPane을 BorderLayout.CENTER에 배치합니다.
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		//버튼을 생성합니다.
		JButton button = new JButton("출력");
		
		//new PrintActionListener(table) : 리스너 생성
		//출력 버튼 처리 리스너를 등록합니다.
		button.addActionListener(new PrintActionListener(table));
		
		//contentPane에 버튼을 BorderLayout.SOUTH에 배치합니다.
		contentPane.add(button, BorderLayout.SOUTH);
		
		//종료버튼을 클릭했을 경우 윈도우가 닫혀지고 프로그램이 종료 되도록 합니다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//프레임을 적당한 크기로 만드는 메소드입니다.
		pack();
		
		//프레임을 디스플레이합니다.
		setVisible(true);
	}
	
	public static void main(String[] args) {
		WindowExample1_event_no we = new WindowExample1_event_no();
	}
}
