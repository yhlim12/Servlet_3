package com.iu.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iu.util.DBConnect;

public class MemberDAO {
	
	/*
	 * public MemberDTO memberMypage(MemberDTO memberDTO) throws Exception{
	 * Connection con = DBConnect.getConnect(); String
	 * sql="select * from member where id=?"; PreparedStatement st =
	 * con.prepareStatement(sql);
	 * 
	 * st.setString(1, memberDTO.getId()); ResultSet rs = st.executeQuery();
	 * if(rs.next()) { memberDTO.setName(rs.getString("name")); } }
	 */
	
	public MemberDTO memberLogin(MemberDTO memberDTO) throws Exception{
		
		Connection con = DBConnect.getConnect();
		String sql="select * from member where id=? and password=?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, memberDTO.getId());
		st.setString(2, memberDTO.getPassword());
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			memberDTO.setName(rs.getString("name"));
			memberDTO.setEmail(rs.getString("email"));
			memberDTO.setPhone(rs.getString("phone"));
			memberDTO.setAge(rs.getInt("age"));
		}else {
			memberDTO = null;
		}
		rs.close();
		st.close();
		con.close();
		
		return memberDTO;
	}
	
	
	public int memberJoin(MemberDTO memberDTO) throws Exception{
		Connection con = DBConnect.getConnect();
		String sql="insert into member values(?,?,?,?,?,?)";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, memberDTO.getId());
		st.setString(2, memberDTO.getPassword());
		st.setString(3, memberDTO.getName());
		st.setString(4, memberDTO.getPhone());
		st.setString(5, memberDTO.getEmail());
		st.setInt(6, memberDTO.getAge());
		
		int result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
		
	}
}
