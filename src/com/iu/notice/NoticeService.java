package com.iu.notice;

import java.util.ArrayList;

public class NoticeService {
	private NoticeDAO noticeDAO;
	
	public NoticeService() {
		this.noticeDAO = new NoticeDAO();
	}
	
	public ArrayList<NoticeDTO> noticeList() throws Exception{
		return noticeDAO.noticeList();
	}
	
	public int noticeAdd(NoticeDTO noticeDTO) throws Exception{
		int result = noticeDAO.noticeAdd(noticeDTO);
		return result;
	}
	
	public NoticeDTO noticeSelect(int seq) throws Exception{
		return noticeDAO.noticeSelect(seq);
	}
	
	public int noticeMod(NoticeDTO noticeDTO) throws Exception{
		int result = noticeDAO.noticeMod(noticeDTO);
		return result;
	}
	
	public int noticeDelete(int seq)throws Exception{
		return noticeDAO.noticeDelete(seq);
	}
	
}
