package dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import model.Member;
/*
	** mybatis �����ӿ�ũ�� �ٽ� ������Ʈ
	   1) SqlSession : ���� SQL�� �����ϴ� ��ü�� �� ��ü�� SQL�� ó���ϱ� ����
	   				   JDBC����̹��� ����մϴ�.
	   2) SqlSessionFactory : SqlSession ��ü�� �����մϴ�.
	   3) SqlSessionFactoryBuilder : ���̹�Ƽ�� ���� ������ ������ ����
	   							SqlSessionFactory �� �����մϴ�.
	   4) mybatis ���� ���� : ������ ���̽� ���� ����, Ʈ����� ����,
	   					   mybatis ���� ���� ���� ���� ������ �����ϰ� �ֽ��ϴ�.
	   					   SqlSessionFactory �� ���� �� ����մϴ�.
	   5) SQL ���� ���� : SQL���� ��� �ִ� ���Ϸ� SqlSession ��ü�� �����մϴ�.
	** SqlSession�� �ֿ� �޼���
	   1) selectList() : select ���� �����մϴ�.
	   					�� ��ü(Value Object) ����� ��ȯ�մϴ�.
	   					���� ����� List<E>�� ��ȯ�մϴ�.
	   					����� ������ �� List�� ��ȯ�մϴ�.
	   2) selectOne() : select ���� �����մϴ�.
	   					�ϳ��� �� ��ü�� ��ȯ�մϴ�.
	   					��������� ������ null�� ��ȯ�մϴ�.
	   3) insert() : insert���� �����մϴ�. ��ȯ���� �Է��� �������� �����Դϴ�.
	   4) update() : update���� �����մϴ�. ��ȯ���� ������ �������� �����Դϴ�.
	   5) delete() : delete���� �����մϴ�. ��ȯ���� ������ �������� �����Դϴ�.
 */
public class MemberDao_���� {
	private SqlSession getSession() {
		SqlSession session = null;
		Reader reader = null;
		try {
			/*
			 * sqlMapConfig.xml�� �о���� ���� Resources Ŭ������ ����մϴ�.
			 * getResourceAsReader() �޼��带
			 * �̿��ϸ� �ڹ� Ŭ���� ��ο� �ִ� ������ �Է� ��Ʈ���� �ս��� ���� �� �ֽ��ϴ�.
			 */
			reader = Resources.getResourceAsReader("sqlMapConfig.xml");
			
			/*
			 * SqlSessionFactoryBuilder : ���̹�Ƽ�� ���� ������ ������ ����
			 							  SqlSessionFactory�� �����մϴ�.
			 * build()�� ���� SqlSessionFactory ��ü�� �����մϴ�. 
			   build()�� �Ű����� ������ ���̹�Ƽ�� ���� ������ �Է� ��Ʈ���� �Ѱ��־�� �մϴ�.			 	
			     ���̹�Ƽ�� ���� ������ ���� �ڹ� Ŭ���� ���(CLASSPATH)�� �Ӵϴ�. 
			 */
			SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(reader);
			/*
			 * SqlSessionFactory�� ���ؼ� SqlSession ��ü�� �����մϴ�.
			   1. openSession(boolean)�� �Ű����� ����
			      true�� �����ϸ� �ڵ� Ŀ���� �����ϴ� SqlSession��ü�� ��ȯ�մϴ�.
			   2. �⺻���� false�� ��� �ڵ� Ŀ���� ���� �ʾ� ����
			      commit()�� ȣ���մϴ�.
			      try {
			      	session.commit();	//Ʈ����� Ŀ��
			      } catch() {
			      	session.rollback();	//Ʈ����� �ѹ�
			      } finally {
			      	session.close();	//���� �� Ʈ����� ����
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
		int result = 0; // ���̵� ���� ���
		SqlSession session = null;
		try {
			session = getSession();
			/*
			 * ù��° �Ű����� "select"�� SQL ���� ���Ͽ���
			 * namespace�� "Member1"�̰� ���̵� "select"�� ���ǵ� �±��� ���̵��Դϴ�.
			 * "Member1.select" :
			 			Member.xml(SQL�� ����� ���� ����)���� namespace��
			 			"Member1"�̰� ���̵� "select"�� �±׸� ã���ϴ�.
			 *
			 * �ι�° �Ű����� : SQL���� ������ �� �Է� �Ű� ������ ���� ������ ��ü�Դϴ�.
			 * member.getId()�� �ڷ����� parameterType�� ��ġ�ؾ� �մϴ�.
			 * <select id="select" parameterType="String" resultType="Member">
			 * select * from member22 where id = #{inputid} </select>
			 * */			
			//��ȸ����� ���� ��� mem�� null �Դϴ�.
			Member mem = (Member) session.selectOne("Member1.select", member.getId());
			if (mem != null) {
				if (mem.getId().equals(member.getId())) {
					result = -1; // ���̵�� ���� ����� �ٸ� ���
					if (mem.getPassword().equals(member.getPassword())) {
						result = 1; // ���̵�� ����� ���� ���
					}
				}
			} else {
				System.out.println("chk() ��� = null");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close(); // SqlSession�� �ݾ� �ڿ��� �����մϴ�.
		}
		return result;
	}

	public int insert(Member mem) {
		// TODO Auto-generated method stub
		return 0;
	}

}
