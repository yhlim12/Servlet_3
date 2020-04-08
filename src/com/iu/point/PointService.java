package com.iu.point;

import java.util.ArrayList;

public class PointService {
	private PointDAO pointDAO;
	
	public PointService() {
		this.pointDAO = new PointDAO();
	}
	//4. intsert
	public int pointAdd(PointDTO pointDTO)throws Exception{
		pointDTO.setTotal(pointDTO.getKor()+pointDTO.getEng()+pointDTO.getMath());
		pointDTO.setAvg(pointDTO.getTotal()/3.0);
		int result = pointDAO.pointAdd(pointDTO);
		return result;
	}
	//3. delete
	public int pointDelete(int num) throws Exception{
		return pointDAO.pointDelete(num);
	}
	
	//2. select
	public PointDTO pointSelect(int num) throws Exception{
		return pointDAO.pointSelect(num);
	}
	
	//1. List
	public ArrayList<PointDTO> pointList() throws Exception{
		return pointDAO.pointList();
	}
}
