package homework_191004_gradecard;

import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.*;

public class ParticipantList extends JFrame {
	private static final long serialVersionUID = 1L;

	ParticipantList() {
		super("참가자 명단 프로그램-수정");

		setPreferredSize(new Dimension(800, 300));
		setLocation(500, 400);

		Container contentPane = getContentPane();
		JPanel panel = new JPanel();

		String colNames[] = { "번호", "이름", "국어", "영어", "수학", "총점", "평균", "등급" };
		DefaultTableModel model = new DefaultTableModel(colNames, 0);

		/*
		 * for (int i = 0; i < select().size(); i++) { model.addRow(select().get(i)); }
		 */

		JTable table = new JTable(model);

		JScrollPane scrollPane = new JScrollPane(table);
		contentPane.add(scrollPane, BorderLayout.CENTER);

		JTextField text1 = new JTextField(6);
		JTextField text2 = new JTextField(3);
		JTextField text3 = new JTextField(3);
		JTextField text4 = new JTextField(3);
		JButton b1 = new JButton("추가");
		JButton b2 = new JButton("삭제");
		JButton b3 = new JButton("변경");

		panel.add(new JLabel("이름"));
		panel.add(text1);
		panel.add(new JLabel("국어"));
		panel.add(text2);
		panel.add(new JLabel("영어"));
		panel.add(text3);
		panel.add(new JLabel("수학"));
		panel.add(text4);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);

		b1.addActionListener(new AddActionListener(table, text1, text2, text3, text4));
		b2.addActionListener(new RemoveActionListener(table));
		b3.addActionListener(new AlterActionListener(table, text1, text2, text3, text4));
		contentPane.add(panel, BorderLayout.SOUTH);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		ParticipantList pl = new ParticipantList();
	}

	public ArrayList<Gradecard> select() {
		PreparedStatement pstmt = null;
		Connection conn = null;

		StringBuilder sql = new StringBuilder();
		sql.append("select * from gradecard order by no");
		ArrayList<Gradecard> arrst = new ArrayList<Gradecard>();
		try {
			conn = ConnUtil.getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Gradecard gc = new Gradecard();
				gc.setNo(rs.getInt("no"));
				gc.setName(rs.getString("name"));
				gc.setKor(rs.getInt("kor"));
				gc.setMath(rs.getInt("math"));
				gc.setEng(rs.getInt("eng"));
				gc.setTot(rs.getInt("tot"));
				gc.setAvg(rs.getFloat("avg"));
				gc.setGrade(rs.getString("grade"));
				arrst.add(gc);
			}
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			try {
				if (conn != null)
					conn.close(); // 4단계 : DB연결을 끊는다.
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return arrst;
	}
}