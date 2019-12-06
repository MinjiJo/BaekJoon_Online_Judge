package net.info.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import net.info.db.UserId_post;

public class UserId_postDAO {
	private Connection conn;
	private DataSource ds;
	private ResultSet rs;
	private PreparedStatement pstmt;
	int result;
	
	public UserId_postDAO() {
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
				e.printStackTrace();
			}
		}
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public int countItemNum(String id) {
		try {
			conn = ds.getConnection();
			String sql = "select nvl(max(itemNum),0)+1 from "+id+"_post";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			if(rs.next())
				return rs.getInt(1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
		return 0;
	}

	public boolean addItem(UserId_post uid) { //result=1, ture 반환
		result = 0;
		try {
			conn = ds.getConnection();
			String sql = "insert into " + uid.getId() + "_post (id, itemNum, openLevel, pic_url, dataText, posted_time, location, hashTag)"
					+ " values(?, ?, ?, ?, ?, sysdate, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uid.getId());
			pstmt.setInt(2, uid.getItemNum());
			pstmt.setInt(3, uid.getLevel());
			pstmt.setString(4, uid.getPic_url());
			pstmt.setString(5, uid.getDataText());
			pstmt.setString(6, uid.getLocation());
			pstmt.setString(7, uid.getHashTag());
			result = pstmt.executeUpdate();
			
			if(result == 1)
				return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return false;
	}
	
	public List<UserId_post> getList(String id){
		List<UserId_post> list=new ArrayList<UserId_post>();
		try {
			conn = ds.getConnection();
			String sql = "select * from "+id+"_post";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				UserId_post member=new UserId_post();
				member.setId(id);
				member.setItemNum(rs.getInt("itemNum"));
				member.setLevel(rs.getInt("openLevel"));
				member.setPic_url(rs.getString("pic_url"));
				member.setDataText(rs.getString("dataText"));
				member.setPosted_time(rs.getDate("posted_time"));
				member.setLocation(rs.getString("location"));
				member.setHashTag(rs.getString("hashTag"));
				list.add(member);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return list;
	}

	public List<UserId_post> newsFeed(String id) {
		List<UserId_post> list = new ArrayList<UserId_post>();
		List<String> all_id = new ArrayList<String>();
		Queue<String> follow_id = new LinkedList<String>();
		Queue<String> follow_hashTag = new LinkedList<String>();
		try {
			conn = ds.getConnection();
			conn.setAutoCommit(false);
			String sql = "select id, hashTag from "+id+"_Follow";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				if(rs.getString(1) != null) {
					follow_id.add(rs.getString(1));
				}
				if(rs.getString(2) != null) {
					follow_hashTag.add(rs.getString(2));
				}
			}
			
//			select c.*
//			from (select rownum r, b.* 
//					from (select *
//							from (select * from show1_post
//									union
//									select * from show2_post where openLevel < 3
//									union
//									select * from show3_post where openLevel < 3
//									union 
//									select * from show4_post
//									where hashtag like '%#여기여기%' and openLevel = 1
//									union 
//									select * from show2_post
//									where hashtag like '%#여기여기%' and openLevel = 1
//									) a
//							order by a.posted_time
//						) b
//					) c
//			where c.r < 12;
			
			sql = "select id from All_users";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				all_id.add(rs.getString(1));
			}
			
			sql = "select c.* "
				+ " from (select rownum r, b.* "
						+ " from (select a.* "
								+ " from ( select * from " + id + "_post"
										+ " union ";
			while(!follow_id.isEmpty()) {
				sql += "select * from "+follow_id.poll()+"_post where openlevel < 3 union ";
			}
			while(!follow_hashTag.isEmpty()) {
				for(int i=0; i<all_id.size(); i++) {
					sql += "select * from "+all_id.get(i)+"_post where hashtag like '%" + follow_hashTag.peek() +  "%' and openLevel = 1 union ";
				}
				follow_hashTag.poll();
			}
			sql = sql.substring(0, sql.length()-6);
			sql +=			 			") a "
								+ "order by a.posted_time desc "
						+ ")b"
					+ ") c"
				+ " where c.r<20";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			/*id varchar2(20),
			 *itemNum number(5) primary key,"
					+ "openLevel number(1),"
					+ "pic_url varchar2(50) not null,"
					+ "dataText varchar2(4000) default '',"
					+ "posted_time date default sysdate,"
					+ "alter_time date,"
					+ "location varchar2(50),"
					+ "hashTag varchar2(600))";
			 */
			
			while(rs.next()) {
				UserId_post uid = new UserId_post();
				uid.setId(rs.getString("id"));
				uid.setItemNum(rs.getInt("itemNum"));
				uid.setLevel(rs.getInt("openLevel"));
				uid.setPic_url(rs.getString("pic_url"));
				uid.setDataText(rs.getString("dataText"));
				uid.setPosted_time(rs.getDate("posted_Time"));
				uid.setAlter_time(rs.getDate("Alter_Time"));
				uid.setLocation(rs.getString("location"));
				uid.setHashTag(rs.getString("hashTag"));
				list.add(uid);
			}
			conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}finally {
			close();
		}
		return list;
	}

	public boolean deletePost(String id, int itemNum) {
		try {
			conn = ds.getConnection();
			conn.setAutoCommit(false);
			String sql = "select hashtag from " + id + "_post where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String[] hashTags = rs.getString(1).split(" ");
				for(String hashTag : hashTags) {
					sql = "update hashtags set usingCount = usingCount - 1 where hashTag = ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, hashTag);
					pstmt.executeUpdate();
				}
			}
			
			
			sql = "delete from " + id + "_post where itemNum = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, itemNum);
			result = pstmt.executeUpdate();
			
			if(result == 1) {
				conn.commit();
				return true;
			}
		} catch(Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {
			close();
		}
		return false;
	}

	public boolean modifyPost(UserId_post uid) {
		result = 0;
		try {
			conn = ds.getConnection();
			String sql = "update " + uid.getId() + "_post "
					+ "set openLevel = ?, dataText = ?, alter_time = sysdate, location = ?, hashTag = ? "
					+ "where itemNum = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, uid.getLevel());
			pstmt.setString(2, uid.getDataText());
			pstmt.setString(3, uid.getLocation());
			pstmt.setString(4, uid.getHashTag());
			pstmt.setInt(5, uid.getItemNum());
			result = pstmt.executeUpdate();
			
			if(result == 1)
				return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return false;
	}
	
	
}
