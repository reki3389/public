package classes;

public class Car {
	// 필드(특성)
	String model;
	String color;
	int price;
	int maxSpeed;
	
	
	
	// 메소드(기능)
	void drive() {
		System.out.println(model+"의 최고 스피드는 "+ maxSpeed);
	}
	void stop() {
		System.out.println("멈춥니다.");
	}
	void accelerate() {
		
	}
}
