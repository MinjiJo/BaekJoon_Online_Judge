package net.board.db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDAO {
	private DataSource ds; // DataSource ds �� ����ġ��Ĺ�� �����ϴ� DBCP(DB Connection Pool) �̴�.
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	int result;

	public BoardDAO() {
		try {
			Context init = new InitialContext();
			ds = (DataSource) init.lookup("java:/comp/env/jdbc/OracleDB");
		} catch (Exception ex) {
			System.out.println("DB ���� ����: " + ex);
			return;
		}
	}

	public boolean boardInsert(BoardBean b) {
		boolean result = false;// �ʱⰪ
		try {
			conn = ds.getConnection();
			String sql = "insert into board(BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,"
					+ "BOARD_CONTENT,BOARD_FILE,BOARD_RE_REF," 
					+ "BOARD_RE_LEV,BOARD_RE_SEQ,BOARD_READCOUNT,"
					+ "BOARD_DATE) " 
					+ "values((select nvl(max(BOARD_NUM),0)+1 from board),?,?,?,"
					+ "?,?,(select nvl(max(BOARD_NUM),0)+1 from board)," 
					+ "?,?,?," 
					+ "sysdate)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getBOARD_NAME());
			pstmt.setString(2, b.getBOARD_PASS());
			pstmt.setString(3, b.getBOARD_SUBJECT());
			pstmt.setString(4, b.getBOARD_CONTENT());
			pstmt.setString(5, b.getBOARD_FILE());

			// ������ ��� BOARD_RE_LEV, BOARD_RE_SEQ �ʵ� ���� 0�Դϴ�.
			pstmt.setInt(6, 0); // BOARD_RE_LEV �ʵ�
			pstmt.setInt(7, 0); // BOARD_RE_SEQ �ʵ�
			pstmt.setInt(8, 0); // BOARD_READCOUNT �ʵ�

			int result2 = pstmt.executeUpdate();
			if (result2 == 1) {
				System.out.println("������ ������ �Ϸ�Ǿ����ϴ�.");
				result = true;
			}
			
		} catch (SQLException ex) {
			System.out.println("boardInsert() ����: " + ex);
			ex.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (pstmt != null) {
					pstmt.close();
					pstmt = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public int getListCount() {
		try {
			conn = ds.getConnection();
			System.out.println("getConnection");

			String sql = "select count(BOARD_NUM) from board";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				result = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (pstmt != null) {
					pstmt.close();
					pstmt = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	// �� ��� ����
	public List<BoardBean> getBoardList(int page, int limit) {
		// page : ������
		// limit : ������ �� ����� ��
		// BOARD_RE_REF desc, BOARD_RE_SEQ asc�� ���� ������ ����
		// �������� �´� rnum�� ���� ��ŭ �������� �������Դϴ�.
		String board_list_sql = 
				  "select * "
				+ "from (select rownum rnum, b.* "
				+ 		"from (select * from board " 
				+ 				"order by BOARD_RE_REF desc, " 
				+ 						"BOARD_RE_SEQ asc) b"
				+ 				") "
				+ "where rnum>=? and rnum<=?";
		
		List<BoardBean> list = new ArrayList<BoardBean>();
		//�� �������� 10���� ����� ��� 1������, 2������, 3������, 4������ ...
		int startrow = (page - 1) * limit + 1;	//�б� ������ row ��ȣ(1 11 21 31 ...
		int endrow = startrow + limit - 1;	//���� ������ row ��ȣ(10 20 30 40 ...
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(board_list_sql);
			pstmt.setInt(1, startrow);
			pstmt.setInt(2, endrow);
			rs = pstmt.executeQuery();
			
			//DB���� ������ �����͸� VO��ü�� ����ϴ�.
			while (rs.next()) {
				BoardBean board = new BoardBean();				
				board.setBOARD_NUM(rs.getInt("BOARD_NUM"));
				board.setBOARD_NAME(rs.getString("BOARD_NAME"));
				board.setBOARD_PASS(rs.getString("BOARD_PASS"));
				board.setBOARD_SUBJECT(rs.getString("BOARD_SUBJECT"));
				board.setBOARD_CONTENT(rs.getString("BOARD_CONTENT"));
				//board.setBOARD_FILE(rs.getString("BOARD_FILE"));
				//board.setBOARD_RE_REF(rs.getInt("BOARD_RE_REF"));
				board.setBOARD_RE_LEV(rs.getInt("BOARD_RE_LEV"));
				//board.setBOARD_RE_SEQ(rs.getInt("BOARD_RE_SEQ"));
				board.setBOARD_READCOUNT(rs.getInt("BOARD_READCOUNT"));
				board.setBOARD_DATE(rs.getDate("BOARD_DATE"));
				list.add(board);	//���� ���� ��ü�� ����Ʈ�� �����մϴ�.
			}
			return list; //���� ���� ��ü�� ������ ����Ʈ�� ȣ���� ������ �������ϴ�.
		} catch (SQLException ex) {
			System.out.println("getBoardList() ���� : " + ex);
			ex.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (pstmt != null) {
					pstmt.close();
					pstmt = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}//getBoardList�޼���
	
	//��ȸ�� ������Ʈ - �۹�ȣ�� �ش��ϴ� ��ȸ���� 1 �����մϴ�.
	public void setReadCountUpdate(int num) {
		String sql = "update board "
				+ "set BOARD_READCOUNT =  BOARD_READCOUNT + 1 "
				+ "where BOARD_NUM = ?";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
		} catch (SQLException ex) {
			System.out.println("setReadCountUpdate() ����: " + ex);
			ex.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (pstmt != null) {
					pstmt.close();
					pstmt = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public BoardBean getDetail(int num) {
		BoardBean board = null;
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(
						"select * "
					  + "from board "
					  + "where BOARD_NUM = ?");
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				board = new BoardBean();
				board.setBOARD_NUM(rs.getInt("BOARD_NUM"));
				board.setBOARD_NAME(rs.getString("BOARD_NAME"));
				//board.setBOARD_PASS(rs.getString("BOARD_PASS"));
				board.setBOARD_SUBJECT(rs.getString("BOARD_SUBJECT"));
				board.setBOARD_CONTENT(rs.getString("BOARD_CONTENT"));
				board.setBOARD_FILE(rs.getString("BOARD_FILE"));
				board.setBOARD_RE_REF(rs.getInt("BOARD_RE_REF"));//�亯 �� �� �ʿ�
				board.setBOARD_RE_LEV(rs.getInt("BOARD_RE_LEV"));//�亯 �� �� �ʿ�
				board.setBOARD_RE_SEQ(rs.getInt("BOARD_RE_SEQ"));//�亯 �� �� �ʿ�
				//board.setBOARD_READCOUNT(rs.getInt("BOARD_READCOUNT"));
				//board.setBOARD_DATE(rs.getDate("BOARD_DATE"));
			}
			return board;
		} catch (SQLException ex) {
			System.out.println("getDetail() ����: " + ex);
			ex.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (pstmt != null) {
					pstmt.close();
					pstmt = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}//getDetail() �޼���
	
	public int boardReply(BoardBean board) {
		//board ���̺��� board_num �ʵ��� �ִ밪�� ���ؿͼ� ���� ����� ��
		//�� ��ȣ�� ���������� �����ϱ� �����Դϴ�.
		//���� DB�� ������ �� �ٽ� �����ֱ����� board_num �ʵ��� ���� �����մϴ�.
		String board_max_sql = "select max(board_num) from board";
		String sql = "";
		int num = 0;
		/*
		 * �亯�� �� ���� �� �׷� ��ȣ�Դϴ�.
		 * �亯�� �ް� �Ǹ� �亯 ���� �� ��ȣ�� ���� ���ñ� ��ȣ�� ���� ó���Ǹ鼭
		 * ���� �׷쿡 ���ϰ� �˴ϴ�. �� ��Ͽ��� ������ �� �ϳ��� �׷����� ������ ��µ˴ϴ�.
		 */
		int re_ref = board.getBOARD_RE_REF();
		System.out.println("re_Ref=" + re_ref);
		/*
		 * ����� ���̸� �ǹ��մϴ�.
		 * ������ ���� ����� ��µ� �� �� �� �鿩���� ó���� �ǰ�
		 * ��ۿ� ���� ����� �鿩���Ⱑ �� �� ó���ǰ� �մϴ�.
		 * ������ ��쿡�� �� ���� 0�̰� ������ ����� 1, ����� ����� 2�� �˴ϴ�.
		 */
		int re_lev = board.getBOARD_RE_LEV();
		
		//���� ���� �� �߿��� �ش� ���� ��µǴ� �����Դϴ�.
		int re_seq = board.getBOARD_RE_SEQ();
		
		try {
			conn = ds.getConnection();
			//Ʈ������� �̿��ϱ� ���ؼ� setAutoCommit�� false�� �����մϴ�.
			conn.setAutoCommit(false);
			
			pstmt = conn.prepareStatement(board_max_sql);
			rs = pstmt.executeQuery();
			if(rs.next())
				num = rs.getInt(1) + 1;
			
			System.out.println(num);
			//BOARD_RE_REF, BOARD_RE,SEQ ���� Ȯ���Ͽ� ���� �ۿ�
			//�ٸ� ����� ������
			//�ٸ� ��۵��� BOARD_RE_SEQ���� 1�� ������ŵ�ϴ�.
			//���� ���� �ٸ� ��ۺ��� �տ� ��µǰ� �ϱ� ���ؼ��Դϴ�.
			sql = "UPDATE board "
					+ "SET BOARD_RE_SEQ = BOARD_RE_SEQ + 1 "
					+ "WHERE BOARD_RE_REF = ? "
					+ "AND BOARD_RE_SEQ > ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, re_ref);
			pstmt.setInt(2, re_seq);
			System.out.print(sql);
			int result1 = pstmt.executeUpdate();
			System.out.println("result1 = " + result1);
			//����� �亯 ���� BOARD_RE_LEV, BOARD_RE_SEQ ���� ���� �ۺ��� 1��
			//������ŵ�ϴ�.
			re_seq = re_seq + 1;
			re_lev = re_lev + 1;
			
			sql = "insert into board "
					+ "(BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,"
					+ "BOARD_CONTENT,BOARD_FILE,BOARD_RE_REF,"
					+ "BOARD_RE_LEV,BOARD_RE_SEQ,"
					+ "BOARD_READCOUNT,BOARD_DATE) "
					+ "values(?,?,?,?,"
					+ "		  ?,?,?,"
					+ "	   	  ?,?,"
					+ "		  ?,sysdate)";
			                                                                                                   			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setString(2, board.getBOARD_NAME());
			pstmt.setString(3, board.getBOARD_PASS());
			pstmt.setString(4, board.getBOARD_SUBJECT());
			pstmt.setString(5, board.getBOARD_CONTENT());
			pstmt.setString(6, ""); //�亯���� ������ ���ε����� �ʽ��ϴ�.
			pstmt.setInt(7, re_ref);
			pstmt.setInt(8, re_lev);
			pstmt.setInt(9, re_seq);
			pstmt.setInt(10, 0); //BOARD_READCOUNT(��ȸ��)�� 0
			int result2 = pstmt.executeUpdate();
			
			if (result1 >= 0 && result2 == 1) {
				conn.commit(); // commit�մϴ�.
				conn.setAutoCommit(true);// �ٽ� true�� �����մϴ�.
			} else {
				conn.rollback();
				System.out.println("rollback()");
			}
		} catch (SQLException ex) {
			System.out.println("boardReply() ���� : " + ex);
			if (conn != null)
				try {
					conn.rollback();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		} finally {
			try {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (pstmt != null) {
					pstmt.close();
					pstmt = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return num;
	}// boardReply() �޼��� end
	
	public boolean isBoardWriter(int num, String pass) {
		String board_sql = "select * from board "
						 + "where BOARD_NUM = ?";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(board_sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				if(pass.equals(rs.getString("BOARD_PASS"))) {
					return true;
				}
			}
		} catch (SQLException ex) {
			System.out.println("isBoardWriter() ���� : " + ex);
		} finally {
			try {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (pstmt != null) {
					pstmt.close();
					pstmt = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}//isBoardWriter end
	
	public boolean boardModify(BoardBean board) {
		String sql = "update board "
				+ "set BOARD_SUBJECT = ?, BOARD_CONTENT = ? "
				+ "where BOARD_NUM = ?";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getBOARD_SUBJECT());
			pstmt.setString(2, board.getBOARD_CONTENT());
			pstmt.setInt(3, board.getBOARD_NUM());
			int result = pstmt.executeUpdate();
			if(result == 1)
				return true;
		} catch (SQLException ex) {
			System.out.println("boardModify() ���� : " + ex);
			ex.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (pstmt != null) {
					pstmt.close();
					pstmt = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	
	public boolean boardDelete(int num) {
		String select_sql = "select BOARD_RE_REF, BOARD_RE_LEV, BOARD_RE_SEQ "
						  + "from board "
						  + "where BOARD_NUM = ?";
		String board_delete_sql 
				= "delete from board "
				+ "where BOARD_RE_REF = ? "
				+ "and	 BOARD_RE_LEV >= ? "
				+ "and	 BOARD_RE_SEQ >= ? "
				+ "and	 BOARD_RE_SEQ <("
				+ "						nvl((SELECT min(board_re_seq) "
				+ "							FROM BOARD	"
				+ "							WHERE BOARD_RE_REF = ? "
				+ "							AND	  BOARD_RE_LEV = ? "
				+ "							AND	  BOARD_RE_SEQ > ? ), "
				+ "							(SELECT max(board_re_seq) + 1 "
				+ "							 FROM BOARD "
				+ "							 WHERE BOARD_RE_REF = ?))"
				+ "							)";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(select_sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			int re_ref = 0, re_lev = 0, re_seq = 0;
			if(rs.next()) {
				re_ref = rs.getInt("BOARD_RE_REF");
				re_lev = rs.getInt("BOARD_RE_LEV");
				re_seq = rs.getInt("BOARD_RE_SEQ");
				
				pstmt = conn.prepareStatement(board_delete_sql);
				pstmt.setInt(1, re_ref);
				pstmt.setInt(2, re_lev);
				pstmt.setInt(3, re_seq);
				
				pstmt.setInt(4, re_ref);
				pstmt.setInt(5, re_lev);
				pstmt.setInt(6, re_seq);
				
				pstmt.setInt(7, re_ref);
				
				//���� ���� �� ������ �ο�(���ڵ�)������ ��ȯ�˴ϴ�.
				int result = pstmt.executeUpdate();
				System.out.println(result + "�� �����Ǿ����ϴ�.");
				if(result>=1)
					return true;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
			System.out.println("boardDelete() ����: " + ex);
		} finally {
			try {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (pstmt != null) {
					pstmt.close();
					pstmt = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
}