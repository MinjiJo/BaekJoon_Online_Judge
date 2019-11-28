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
	private DataSource ds; // DataSource ds 는 아파치톰캣이 제공하는 DBCP(DB Connection Pool) 이다.
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	int result;

	public BoardDAO() {
		try {
			Context init = new InitialContext();
			ds = (DataSource) init.lookup("java:/comp/env/jdbc/OracleDB");
		} catch (Exception ex) {
			System.out.println("DB 연결 실패: " + ex);
			return;
		}
	}

	public boolean boardInsert(BoardBean b) {
		boolean result = false;// 초기값
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

			// 원문의 경우 BOARD_RE_LEV, BOARD_RE_SEQ 필드 값은 0입니다.
			pstmt.setInt(6, 0); // BOARD_RE_LEV 필드
			pstmt.setInt(7, 0); // BOARD_RE_SEQ 필드
			pstmt.setInt(8, 0); // BOARD_READCOUNT 필드

			int result2 = pstmt.executeUpdate();
			if (result2 == 1) {
				System.out.println("데이터 삽입이 완료되었습니다.");
				result = true;
			}
			
		} catch (SQLException ex) {
			System.out.println("boardInsert() 에러: " + ex);
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
	
	// 글 목록 보기
	public List<BoardBean> getBoardList(int page, int limit) {
		// page : 페이지
		// limit : 페이지 당 목록의 수
		// BOARD_RE_REF desc, BOARD_RE_SEQ asc에 의해 정렬한 것을
		// 조건절에 맞는 rnum의 범위 만큼 가져오는 쿼리문입니다.
		String board_list_sql = 
				  "select * "
				+ "from (select rownum rnum, b.* "
				+ 		"from (select * from board " 
				+ 				"order by BOARD_RE_REF desc, " 
				+ 						"BOARD_RE_SEQ asc) b"
				+ 				") "
				+ "where rnum>=? and rnum<=?";
		
		List<BoardBean> list = new ArrayList<BoardBean>();
		//한 페이지당 10개씩 목록인 경우 1페이지, 2페이지, 3페이지, 4페이지 ...
		int startrow = (page - 1) * limit + 1;	//읽기 시작할 row 번호(1 11 21 31 ...
		int endrow = startrow + limit - 1;	//읽을 마지막 row 번호(10 20 30 40 ...
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(board_list_sql);
			pstmt.setInt(1, startrow);
			pstmt.setInt(2, endrow);
			rs = pstmt.executeQuery();
			
			//DB에서 가져온 데이터를 VO객체에 담습니다.
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
				list.add(board);	//값을 담은 객체를 리스트에 저장합니다.
			}
			return list; //값을 담을 객체를 저장한 리스트를 호출한 곳으로 가져갑니다.
		} catch (SQLException ex) {
			System.out.println("getBoardList() 에러 : " + ex);
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
	}//getBoardList메서드
	
	//조회수 업데이트 - 글번호에 해당하는 조회수를 1 증가합니다.
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
			System.out.println("setReadCountUpdate() 에러: " + ex);
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
				board.setBOARD_RE_REF(rs.getInt("BOARD_RE_REF"));//답변 달 때 필요
				board.setBOARD_RE_LEV(rs.getInt("BOARD_RE_LEV"));//답변 달 때 필요
				board.setBOARD_RE_SEQ(rs.getInt("BOARD_RE_SEQ"));//답변 달 때 필요
				//board.setBOARD_READCOUNT(rs.getInt("BOARD_READCOUNT"));
				//board.setBOARD_DATE(rs.getDate("BOARD_DATE"));
			}
			return board;
		} catch (SQLException ex) {
			System.out.println("getDetail() 에러: " + ex);
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
	}//getDetail() 메서드
	
	public int boardReply(BoardBean board) {
		//board 테이블의 board_num 필드의 최대값을 구해와서 글을 등록할 때
		//글 번호를 순차적으로 지정하기 위함입니다.
		//또한 DB에 저장한 후 다시 보여주기위해 board_num 필드의 값을 리턴합니다.
		String board_max_sql = "select max(board_num) from board";
		String sql = "";
		int num = 0;
		/*
		 * 답변을 할 원문 글 그룹 번호입니다.
		 * 답변을 달게 되면 답변 글은 이 번호와 같은 관련글 번호를 갖게 처리되면서
		 * 같은 그룹에 속하게 됩니다. 글 목록에서 보여줄 때 하나의 그룹으로 묶여서 출력됩니다.
		 */
		int re_ref = board.getBOARD_RE_REF();
		System.out.println("re_Ref=" + re_ref);
		/*
		 * 답글의 깊이를 의미합니다.
		 * 원문에 대한 답글이 출력될 때 한 번 들여쓰기 처리가 되고
		 * 답글에 대한 답글은 들여쓰기가 두 번 처리되게 합니다.
		 * 원문인 경우에는 이 값이 0이고 원문의 답글은 1, 답글의 답글은 2가 됩니다.
		 */
		int re_lev = board.getBOARD_RE_LEV();
		
		//같은 관련 글 중에서 해당 글이 출력되는 순서입니다.
		int re_seq = board.getBOARD_RE_SEQ();
		
		try {
			conn = ds.getConnection();
			//트랜잭션을 이용하기 위해서 setAutoCommit을 false로 설정합니다.
			conn.setAutoCommit(false);
			
			pstmt = conn.prepareStatement(board_max_sql);
			rs = pstmt.executeQuery();
			if(rs.next())
				num = rs.getInt(1) + 1;
			
			System.out.println(num);
			//BOARD_RE_REF, BOARD_RE,SEQ 값을 확인하여 원문 글에
			//다른 답글이 있으면
			//다른 답글들의 BOARD_RE_SEQ값을 1씩 증가시킵니다.
			//현재 글을 다른 답글보다 앞에 출력되게 하기 위해서입니다.
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
			//등록할 답변 글의 BOARD_RE_LEV, BOARD_RE_SEQ 값을 원문 글보다 1씩
			//증가시킵니다.
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
			pstmt.setString(6, ""); //답변에는 파일을 업로드하지 않습니다.
			pstmt.setInt(7, re_ref);
			pstmt.setInt(8, re_lev);
			pstmt.setInt(9, re_seq);
			pstmt.setInt(10, 0); //BOARD_READCOUNT(조회수)는 0
			int result2 = pstmt.executeUpdate();
			
			if (result1 >= 0 && result2 == 1) {
				conn.commit(); // commit합니다.
				conn.setAutoCommit(true);// 다시 true로 설정합니다.
			} else {
				conn.rollback();
				System.out.println("rollback()");
			}
		} catch (SQLException ex) {
			System.out.println("boardReply() 에러 : " + ex);
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
	}// boardReply() 메서드 end
	
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
			System.out.println("isBoardWriter() 에러 : " + ex);
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
			System.out.println("boardModify() 에러 : " + ex);
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
				
				//쿼리 실행 후 삭제된 로우(레코드)갯수가 반환됩니다.
				int result = pstmt.executeUpdate();
				System.out.println(result + "개 삭제되었습니다.");
				if(result>=1)
					return true;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
			System.out.println("boardDelete() 에러: " + ex);
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