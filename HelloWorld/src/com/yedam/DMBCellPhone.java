package com.yedam;

public class DMBCellPhone extends CellPhone {
	int channel;

	public DMBCellPhone(int channel) {
		super();
		this.channel = channel;
	}

	public DMBCellPhone() {
		super();

	}
	
	public DMBCellPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;

	}
	
	void turnOnDMB() {
		System.out.println("채널" + channel + "번 방송수신을 시작합니다.");
	}
	void changeCannel(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 변경합니다.");
	}
	void turnOffDMB() {
		System.out.println("DMB 방송을 종료합니다.");
	}
}
