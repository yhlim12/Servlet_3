package com.iu.notice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.util.DBConnect;

public class NoticeDAO {
	
	public ArrayList<NoticeDTO> noticeList()throws Exception{
		ArrayList<NoticeDTO> ar = new ArrayList<NoticeDTO>();
		Connection con = DBConnect.getConnect();
		String sql = "select * from notice";
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		while(rs.next()) {
			NoticeDTO noticeDTO = new NoticeDTO();
			noticeDTO.setSeq(rs.getInt("seq"));
			noticeDTO.setTitle(rs.getString("title"));
			noticeDTO.setContext(rs.getString("context"));
			noticeDTO.setName(rs.getString("name"));
			noticeDTO.setD(rs.getDate("d"));
			noticeDTO.setHit(rs.getInt("hit"));
			ar.add(noticeDTO);
		}
		
		rs.close();
		st.close();
		con.close();
		
		return ar;
		
	}
	
	public int noticeAdd(NoticeDTO noticeDTO) throws Exception{
		Connection con = DBConnect.getConnect();
		String sql = "insert into notice values(seq.nextval,?,?,?,sysdate,1)";
		
		PreparedStatement st = con.prepareStatement(sql);
	
		st.setString(1, noticeDTO.getTitle());
		st.setString(2, noticeDTO.getContext());
		st.setString(3, noticeDTO.getName());
		
		
		int result= st.executeUpdate();
		
		
		
		st.close();
		con.close();
		
		return result;
	}
	
	public NoticeDTO noticeSelect(int seq)throws Exception{ 
		NoticeDTO noticeDTO =null;
		Connection con = DBConnect.getConnect(); 
		String sql="select * from notice where seq=?";
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setInt(1,seq);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			noticeDTO = new NoticeDTO();
			noticeDTO.setSeq(rs.getInt("seq"));
			noticeDTO.setTitle(rs.getString("title"));
			noticeDTO.setContext(rs.getString("context"));
			noticeDTO.setName(rs.getString("name"));
			noticeDTO.setD(rs.getDate("d"));
			noticeDTO.setHit(rs.getInt("hit"));
			
		}
		
		rs.close();
		st.close();
		con.close();
		
		return noticeDTO;
	 
	}
	
	public int noticeMod(NoticeDTO noticeDTO)throws Exception{
		Connection con = DBConnect.getConnect();
		String sql ="UPDATE notice set title=?, context=?, name=? where seq=?";
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, noticeDTO.getTitle());
		st.setString(2, noticeDTO.getContext());
		st.setString(3, noticeDTO.getName());
		st.setInt(4, noticeDTO.getSeq());
		
		int result = st.executeUpdate();
		st.close();
		con.close();
		
		return result;
		
	}
	
	public int noticeDelete(int seq) throws Exception{
		Connection con = DBConnect.getConnect();
		String sql="delete notice where seq=?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, seq);
		
		int result=st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
	}
	 
}
