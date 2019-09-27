package com.yedam.example2;

import com.yedam.example.HankookTire;
import com.yedam.example.KumhoTire;

public class CarExample {
	public static void main(String[] args) {
		Car1 car1 = new Car1();
		for (int i = 0; i < 15; i++) {
			int problamLocation = car1.run();
			switch(problamLocation) {
			case 1:
				System.out.println("앞 왼쪽 Hankook 타이어로 교체.");
				car1.tire[0] = new HankookTire("앞 왼쪽", 14);
				break;
			case 2:
				System.out.println("앞 오른쪽 Kumho 타이어로 교체.");
				car1.tire[1] = new KumhoTire("앞 오른쪽", 14);
				break;
			case 3:
				System.out.println("뒤 왼쪽 Hankook 타이어로 교체.");
				car1.tire[2] = new HankookTire("뒤 왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤 오른쪽 Kumho 타이어로 교체.");
				car1.tire[3] = new KumhoTire("뒤 오른쪽", 14);
				break;
			}
			System.out.println("--------------------------------");
		}
	}
}