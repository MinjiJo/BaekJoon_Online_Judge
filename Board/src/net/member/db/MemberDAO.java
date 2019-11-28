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

import net.member.db.Member;

public class MemberDAO {
	private DataSource ds; // DataSource ds �� ����ġ��Ĺ�� �����ϴ� DBCP(DB Connection Pool) �̴�.
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	int result;

	// �����ڿ��� JNDI ���ҽ��� �����Ͽ� Connection ��ü�� ���ɴϴ�.
	public MemberDAO() {
		try {
			Context init = new InitialContext();
			ds = (DataSource) init.lookup("java:/comp/env/jdbc/OracleDB");
		} catch (Exception ex) {
			System.out.println("DB ���� ����: " + ex);
			return;
		}
	}

	public int isId(String id) {
		try {
			conn = ds.getConnection();
			System.out.println("getConnection");

			String sql = "select id from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				result = 0; // DB�� �ش� id�� �ֽ��ϴ�.
			} else {
				result = -1; // DB�� �ش� id�� �����ϴ�.
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

	public int isId(String id, String pass) {
		try {
			conn = ds.getConnection();
			System.out.println("getConnection");

			String sql = "select id, password from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				if (rs.getString(2).equals(pass)) {
					result = 1; // ���̵�� ��й�ȣ ��ġ�ϴ� ���
				} else {
					result = 0; // ��й�ȣ�� ��ġ���� �ʴ� ���
				}
			} else {
				result = -1; // ���̵� �������� �ʽ��ϴ�.
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

	public int insert(Member m) {
		int result = 0;// �ʱⰪ
		try {
			conn = ds.getConnection();
			String sql = "insert into member " + "values(?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getPass());
			pstmt.setString(3, m.getName());
			pstmt.setInt(4, m.getAge());
			pstmt.setString(5, m.getGender());
			pstmt.setString(6, m.getEmail());
			result = pstmt.executeUpdate();

			// primary key �������� �������� ��� �߻��ϴ� ����
		}
		/*
		 * catch() { return -1; }
		 */
		catch (SQLException e) {
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

	public Member member_info(String id) {
		Member m = null;
		try {
			conn = ds.getConnection();
			String sql = "select * from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				m = new Member();
				m.setId(rs.getString("id"));
				m.setPass(rs.getString("password"));
				m.setName(rs.getString("name"));
				m.setAge(rs.getInt("age"));
				m.setGender(rs.getString("gender"));
				m.setEmail(rs.getString("email"));
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
		return m;
	}

	public int update(Member member) {
		int result = 0;// �ʱⰪ
		try {
			conn = ds.getConnection();
			String sql = "update member " + "set id = ?, password = ?, name = ?, age = ?, gender = ?, email = ? "
					+ "where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPass());
			pstmt.setString(3, member.getName());
			pstmt.setInt(4, member.getAge());
			pstmt.setString(5, member.getGender());
			pstmt.setString(6, member.getEmail());
			pstmt.setString(7, member.getId());
			result = pstmt.executeUpdate();
		}
		// primary key �������� �������� ��� �߻��ϴ� ����
		/*
		 * catch() { return -1; }
		 */
		catch (SQLException e) {
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

	public List<Member> getList() {
		List<Member> list = new ArrayList<Member>();
		try {
			conn = ds.getConnection();
			String sql = "select * from member " 
						+ "where id != 'admin'";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			/*
			 * create table member( id varchar2(15), password varchar2(10), name
			 * varchar2(15), age Number, gender varchar2(5), email varchar2(30), PRIMARY
			 * KEY(id) );
			 */
			while (rs.next()) {
				Member m = new Member();
				m.setId(rs.getString("id"));
				m.setPass(rs.getString("password"));
				m.setName(rs.getString("name"));
				m.setAge(rs.getInt("age"));
				m.setGender(rs.getString("gender"));
				m.setEmail(rs.getString("email"));
				list.add(m);
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
		return list;
	}// getList end

	public List<Member> getList(int page, int limit) {
		// page : ������
		// limit : ������ �� ����� ��
		String list_sql = "select * " 
				+ "from (select rownum rnum, b.* " 
						+ "from (select * from member "
								+ "where id != 'admin' "
								+ "order by id ) b" 
						+ ") " 
				+ "where rnum>=? and rnum<=?";

		List<Member> list = new ArrayList<Member>();
		// �� �������� 10���� ����� ��� 1������, 2������, 3������, 4������ ...
		int startrow = (page - 1) * limit + 1; // �б� ������ row ��ȣ(1 11 21 31 ...
		int endrow = startrow + limit - 1; // ���� ������ row ��ȣ(10 20 30 40 ...
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(list_sql);
			pstmt.setInt(1, startrow);
			pstmt.setInt(2, endrow);
			rs = pstmt.executeQuery();

			// DB���� ������ �����͸� VO��ü�� ����ϴ�.
			while (rs.next()) {
				Member m = new Member();
				m.setId(rs.getString("id"));
				m.setPass(rs.getString("password"));
				m.setName(rs.getString("name"));
				m.setAge(rs.getInt("age"));
				m.setGender(rs.getString("gender"));
				m.setEmail(rs.getString("email"));
				list.add(m);
			}
			return list; // ���� ���� ��ü�� ������ ����Ʈ�� ȣ���� ������ �������ϴ�.
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
	}// getBoardList�޼���
	
	public int getListCount() {
		try {
			conn = ds.getConnection();
			System.out.println("getConnection");

			String sql = "select count(id) from member "
						+ "where id != 'admin'";;
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
	
	public int delete(String id) {
		try {
			conn = ds.getConnection();
			String sql = "delete from member "
						+ "where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			result = pstmt.executeUpdate();
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
}