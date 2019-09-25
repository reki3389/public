package com.yedam;

public class DMDCellPhoneExample {
	public static void main(String[] args) {
		DMBCellPhone DMBcell = new DMBCellPhone("S10", "white", 10);
		System.out.println("model: " + DMBcell.model); //부모필드
		System.out.println("color: " + DMBcell.color); //부모필드 
		System.out.println("channel: " + DMBcell.channel); //자신필드
		DMBcell.powerOn();//부모메소드
		DMBcell.turnOnDMB(); //자신메소드
		DMBcell.turnOffDMB();
		DMBcell.powerOff();
	}
}
