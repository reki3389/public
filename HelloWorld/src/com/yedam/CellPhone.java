package com.yedam;

public class CellPhone {
	String model;
	String color;
	
	
	public CellPhone() {
		super();
	}
	
	public CellPhone(String model, String color) { //super라는 뜻은 부모에 관련된 데이터를 가져오겠다는 뜻
		super();
		this.model = model;
		this.color = color;
	}
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	void bell() {
		System.out.println("벨을 울립니다.");
	}
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
