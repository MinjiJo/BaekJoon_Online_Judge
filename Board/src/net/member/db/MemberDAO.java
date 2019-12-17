package net.member.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
	private Connection conn;
	private DataSource ds;
	private ResultSet rs;
	private PreparedStatement pstmt;
	int result;
	
	public MemberDAO() {
		try {
			Context init = new InitialContext();
			ds = (DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public int join(Member member) {
		try {
			conn = ds.getConnection();
			
			String sql = "insert into member values(?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPass());
			pstmt.setString(3, member.getName());
			pstmt.setInt(4, member.getAge());
			pstmt.setString(5, member.getGender());
			pstmt.setString(6, member.getEmail());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return result;
	}
	
	public int isId(String parameter) {
		try {
			conn = ds.getConnection();
			
			String sql = "select id from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, parameter);
			
			rs = pstmt.executeQuery();
			
			if(rs.next())
				return 0;	//DB에 데이터 있음
			else
				return -1;	//DB에 데이터 없음
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return 1;
	}

	public int isId(String parameter, String parameter2) {
		try {
			conn = ds.getConnection();
			
			String sql = "select id, password from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, parameter);
			
			rs = pstmt.executeQuery();
				
			if(rs.next()) {
				if(rs.getString(2).equals(parameter2)) {
					return 0;
				}else {
					return -2;
				}
			}else
				return -1;	//DB에 데이터 없음
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return 0;
	}

	public Member profile(String id) {
		Member member = new Member();;
		try {
			conn = ds.getConnection();
			
			String sql = "select * from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
				
			if(rs.next()) {
				member.setId(rs.getString(1));
				member.setPass(rs.getString(2));
				member.setName(rs.getString(3));
				member.setAge(rs.getInt(4));
				member.setGender(rs.getString(5));
				member.setEmail(rs.getString(6));
			}else {
				return null;	//DB에 데이터 없음
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return member;
	}

	public boolean updateProfile(Member member) {
		int res = 0;
		try {
			conn = ds.getConnection();
			
			String sql = "update member set name = ?, gender = ?, email = ?, password = ? where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getName());
			pstmt.setString(2, member.getGender());
			pstmt.setString(3, member.getEmail());
			pstmt.setString(4, member.getPass());
			pstmt.setString(5, member.getId());
			
			res = pstmt.executeUpdate();
				
			if(res == 1) {
				return true;
			}else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return false;
	}

	public boolean deleteMember(String id) {
		try {
			conn = ds.getConnection();
			
			String sql = "delete from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			int res = pstmt.executeUpdate();
				
			if(res == 1) {
				return true;
			}else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return false;
	}

	public int getListCount() {
		int count=0;
		try {
			conn = ds.getConnection();
			
			String sql = "select count(*) from member";
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next())
				count = rs.getInt(1);
			
		} catch(Exception e) {
			System.out.println("리스트 최대 사이즈 계산 중 오류 : " + e);
			e.printStackTrace();
		} finally {
			close();
		}
		return count;
	}

	public List<Member> getMemberList(int page, int limit) {
		List<Member> list = new ArrayList<Member>();
		try {
			conn = ds.getConnection();
			
			String sql = "select * "
					+ 	" from (select rownum rnum, m.* "
					+ 			" from member m "
					+ 			" ) "
					+ " where rnum >= ? and rnum <= ? and id != 'admin'";
			
			pstmt = conn.prepareStatement(sql);
			int startrow = (page - 1) * limit + 1;
			int endrow = startrow + limit - 1;
			pstmt.setInt(1, startrow);
			pstmt.setInt(2, endrow);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Member member = new Member();
				member.setId(rs.getString(2));
				member.setPass(rs.getString(3));
				member.setName(rs.getString(4));
				member.setAge(rs.getInt(5));
				member.setGender(rs.getString(6));
				member.setEmail(rs.getString(7));
				list.add(member);
			}
			return list;
		} catch(Exception e) {
			System.out.println("리스트 출력 중 오류 : " + e);
			e.printStackTrace();
		} finally {
			close();
		}
		return null;
	}
}
