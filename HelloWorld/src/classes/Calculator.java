package classes;

public class Calculator {
	static double minus(double x, double y ) {
		return x - y;
	}
	
	static double plus(double x, double y) { //static 타입을 정의 해주는것은 절대적으로 변하지 않는 형태의 클래스를 만들기 위함
		return x + y;
	}

	int plus(int x, int y) {
		int result = x + y;
		return result;

	}

	int avg(int a, int b) {
		int sum = plus(a, b);
		int result = sum / 2;
		return result;

	}

	void execute(int a, int b) {
		// int a = 10, b = 20;
		int result = avg(a, b);
		System.out.println("result " + result);

	}

	void println(String str) {
		System.out.println(str);
	}
}
