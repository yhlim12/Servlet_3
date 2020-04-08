package com.iu.point;

public class PointDTO {
	
	//DTO(Data Transfer Object)
	//VO(Value Object)
	
	
	//변수의 접근제어자 private
	//변수의 데이터타입과 변수명은 Table의 Column과 일치
	//Getter //Setter
	//생성자가 여러개 있어도 되지만 default생성자는 꼭 필요
	
	private String name;
	private int num;
	private int kor;
	private int eng;
	private int math;
	private int total;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	private double avg;
	
	
}
