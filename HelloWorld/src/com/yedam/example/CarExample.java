package com.yedam.example;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		for (int i = 0; i < 15; i++) {
			int problamLocation = car.run();
			switch(problamLocation) {
			case 1:
				System.out.println("앞 왼쪽 Hankook 타이어로 교체.");
				car.frontLeft = new HankookTire("앞 왼쪽", 16);
				break;
			case 2:
				System.out.println("앞 오른쪽 Kumho 타이어로 교체.");
				car.frontRight = new KumhoTire("앞 오른쪽", 16);
				break;
			case 3:
				System.out.println("뒤 왼쪽 Hankook 타이어로 교체.");
				car.backLeft = new HankookTire("뒤 왼쪽", 16);
				break;
			case 4:
				System.out.println("뒤 오른쪽 Kumho 타이어로 교체.");
				car.backRight = new KumhoTire("뒤 오른쪽", 16);
				break;
			}
			System.out.println("--------------------------------");
		}
	}
}