package homework_191004_gradecard;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class AddActionListener implements ActionListener{
	PreparedStatement pstmt = null;
	Connection conn = null;
	
	JTable table;
	JTextField text1, text2, text3, text4;
	
	AddActionListener(JTable table, JTextField text1, JTextField text2, JTextField text3, JTextField text4){
		this.table = table;
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
		this.text4 = text4;
	}
	
	//추가 버튼을 클릭했을 때 처리하는 메소드입니다.
	public void actionPerformed(ActionEvent e) {
		DefaultTableModel model = 
				(DefaultTableModel) table.getModel();
		Gradecard s = new Gradecard();
		
		insert(text1.getText(), text2.getText(),
				text3.getText(), text4.getText());
		
		Object arr[] = {s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),
						s.getTot(),s.getAvg(),s.getGrade()};
		
		model.addRow(arr);
	}
	
	public void insert(String name, String kor, String math, String eng) {
		StringBuilder sql = new StringBuilder();
		int tot = Integer.parseInt(kor)+Integer.parseInt(math)+Integer.parseInt(eng);
		float avg = tot / 3f;
		sql.append("insert into gradecard(no, name, kor, math, eng, tot, avg, grade) "
				+ "values(gradecard_seq.nextval, ?, ?, ?, ?, ?, ?, " 
				+ "(select grade from grade "
				+ "where ? between lowscore and hiscore))");

		try {
			conn = ConnUtil.getConnection();

			// PreparedStatement 객체 얻기
			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, name);
			pstmt.setInt(2, Integer.parseInt(kor));
			pstmt.setInt(3, Integer.parseInt(math));
			pstmt.setInt(4, Integer.parseInt(eng));
			pstmt.setInt(5, tot);
			pstmt.setFloat(6, avg);
			pstmt.setFloat(7, avg);

			// 쿼리 실행
			int result = pstmt.executeUpdate();
			System.out.println(result + "줄 db에 반영됨 . . . . . .");
		} catch (SQLException se) {
			System.out.println(se.getMessage());
			se.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}