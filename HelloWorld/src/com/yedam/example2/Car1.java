package com.yedam.example2;

import com.yedam.example.Tire;
import com.yedam.example.HankookTire;
import com.yedam.example.KumhoTire;

public class Car1 {
	Tire[] tire = { new Tire("앞 왼쪽", 3), new Tire("앞 오른쪽", 3), new Tire("뒤 왼쪽", 3), new Tire("뒤 오른쪽", 3) };

	public int run() {
		System.out.println("[자동차가 달립니다.]");
		for (int i = 0; i < tire.length; i++) {
			if (tire[i].roll() == false) {
				stop();
				return (i + 1);

			}
		}
		return 0;
	}

	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
