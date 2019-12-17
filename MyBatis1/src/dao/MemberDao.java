package dao;

import java.io.IOException;
import java.io.Reader;
import java.sql.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import model.DateSet;
import model.Emp;
import model.Member;

public class MemberDao {
	private SqlSession getSession() {
		SqlSession session = null;
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader("sqlMapConfig.xml");
			SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(reader);
			session = sf.openSession(true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return session;
	}

	public int chk(Member member) {
		int result = 0; // 아이디가 없는 경우
		SqlSession session = null;
		try {
			session = getSession();
			
			//조회결과가 없는 경우 mem은 null 입니다.
			Member mem = (Member) session.selectOne("select", member.getId());
			if (mem != null) {
				if (mem.getId().equals(member.getId())) {
					result = -1; // 아이디는 같고 비번이 다른 경우
					if (mem.getPassword().equals(member.getPassword())) {
						result = 1; // 아이디와 비번이 같은 경우
					}
				}
			} else {
				System.out.println("chk() 결과 = null");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close(); // SqlSession을 닫아 자원을 해제합니다.
		}
		return result;
	}

	public int insert(Member member) {
		int result = 0;
		SqlSession session = null;
		try {
			session = getSession();
			result = session.insert("Member1.insert", member);
			//result = session.insert("insert", member);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close(); // SqlSession 을 닫아 자원을 해제합니다.
		}
		return result;
	}

	public List<Member> list() {
		List<Member> list = null;
		SqlSession session = null;
		try {
			session = getSession();
			list = session.selectList("Member1.list");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close(); // SqlSession 을 닫아 자원을 해제합니다.
		} return list;
	}

	public Member select(String id) {
		Member mem = null;
		SqlSession session = null;
		try {
			session = getSession();
			mem = (Member) session.selectOne("select", id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close(); // SqlSession을 닫아 자원을 해제합니다.
		}
		return mem;
	}
	
	public int update(Member mem) {
		int result = 0;
		SqlSession session = null;
		try {
			session = getSession();
			result = session.update("update", mem);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close(); // SqlSession을 닫아 자원을 해제합니다.
		}
		return result;
	}
	
	public int delete(String id) {
		int result = 0;
		SqlSession session = null;
		try {
			session = getSession();
			result = session.delete("delete", id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close(); // SqlSession을 닫아 자원을 해제합니다.
		}
		return result;
	}
	
	public List<Emp> empList(DateSet date) {
		List<Emp> list = null;
		SqlSession session = null;
		try {
			session = getSession();
			list = session.selectList("Member1.empList", date);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close(); // SqlSession 을 닫아 자원을 해제합니다.
		} return list;
	}
}