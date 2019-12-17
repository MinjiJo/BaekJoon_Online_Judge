package dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import model.Member;
/*
	** mybatis 프레임워크의 핵심 컴포넌트
	   1) SqlSession : 실제 SQL을 실행하는 객체로 이 객체는 SQL을 처리하기 위해
	   				   JDBC드라이버를 사용합니다.
	   2) SqlSessionFactory : SqlSession 객체를 생성합니다.
	   3) SqlSessionFactoryBuilder : 마이바티스 설정 파일의 내용을 토대로
	   							SqlSessionFactory 를 생성합니다.
	   4) mybatis 설정 파일 : 데이터 베이스 연결 정보, 트래잭션 정보,
	   					   mybatis 제어 정보 등의 설정 내용을 포함하고 있습니다.
	   					   SqlSessionFactory 를 만들 때 사용합니다.
	   5) SQL 맵퍼 파일 : SQL문을 담고 있는 파일로 SqlSession 객체가 참조합니다.
	** SqlSession의 주요 메서드
	   1) selectList() : select 문을 실행합니다.
	   					값 객체(Value Object) 목록을 반환합니다.
	   					쿼리 결과를 List<E>로 반환합니다.
	   					결과가 없으면 빈 List를 반환합니다.
	   2) selectOne() : select 문을 실행합니다.
	   					하나의 값 객체를 반환합니다.
	   					쿼리결과가 없으면 null을 반환합니다.
	   3) insert() : insert문을 실행합니다. 반환값은 입력한 데이터의 갯수입니다.
	   4) update() : update문을 실행합니다. 반환값은 변경한 데이터의 갯수입니다.
	   5) delete() : delete문을 실행합니다. 반환값은 삭제한 데이터의 갯수입니다.
 */
public class MemberDao_설명 {
	private SqlSession getSession() {
		SqlSession session = null;
		Reader reader = null;
		try {
			/*
			 * sqlMapConfig.xml을 읽어오기 위해 Resources 클래스를 사용합니다.
			 * getResourceAsReader() 메서드를
			 * 이용하면 자바 클래스 경로에 있는 파일의 입력 스트림을 손쉽게 얻을 수 있습니다.
			 */
			reader = Resources.getResourceAsReader("sqlMapConfig.xml");
			
			/*
			 * SqlSessionFactoryBuilder : 마이바티스 설정 파일의 내용을 토대로
			 							  SqlSessionFactory를 생성합니다.
			 * build()를 통해 SqlSessionFactory 객체를 생성합니다. 
			   build()의 매개변수 값으로 마이바티스 설정 파일의 입력 스트림을 넘겨주어야 합니다.			 	
			     마이바티스 설정 파일은 보통 자바 클래스 경로(CLASSPATH)에 둡니다. 
			 */
			SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(reader);
			/*
			 * SqlSessionFactory를 통해서 SqlSession 객체를 생성합니다.
			   1. openSession(boolean)의 매개변수 값을
			      true로 지정하면 자동 커밋을 수행하는 SqlSession객체를 반환합니다.
			   2. 기본값이 false인 경우 자동 커밋이 되지 않아 직접
			      commit()을 호출합니다.
			      try {
			      	session.commit();	//트랜잭션 커밋
			      } catch() {
			      	session.rollback();	//트랜잭션 롤백
			      } finally {
			      	session.close();	//세션 및 트랜잭션 종료
			      }
			 * */
			session = sf.openSession(true);
			// session = sf.openSession();
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
			/*
			 * 첫번째 매개변수 "select"는 SQL 맵퍼 파일에서
			 * namespace가 "Member1"이고 아이디가 "select"로 정의된 태그의 아이디입니다.
			 * "Member1.select" :
			 			Member.xml(SQL이 저장된 맵퍼 파일)에서 namespace가
			 			"Member1"이고 아이디가 "select"인 태그를 찾습니다.
			 *
			 * 두번째 매개변수 : SQL문을 실행할 때 입력 매개 변수에 값을 공급할 객체입니다.
			 * member.getId()의 자료형은 parameterType과 일치해야 합니다.
			 * <select id="select" parameterType="String" resultType="Member">
			 * select * from member22 where id = #{inputid} </select>
			 * */			
			//조회결과가 없는 경우 mem은 null 입니다.
			Member mem = (Member) session.selectOne("Member1.select", member.getId());
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

	public int insert(Member mem) {
		// TODO Auto-generated method stub
		return 0;
	}

}
