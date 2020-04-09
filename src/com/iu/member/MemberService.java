package com.iu.member;

public class MemberService {
	private MemberDAO memberDAO;
	
	public MemberService() {
		memberDAO = new MemberDAO();
	}
	
	public MemberDTO memberLogin(MemberDTO memberDTO)throws Exception{
		return memberDAO.memberLogin(memberDTO);
	}
	
	public int memberJoin(MemberDTO memberDTO) throws Exception{
		int result =memberDAO.memberJoin(memberDTO);
		return result;
		
	}
}
