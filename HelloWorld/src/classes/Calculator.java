package classes;

public class Calculator {
	int plus(int x, int y) {
		int result = x + y;
		return result;
		
	}
	int avg(int a, int b) {
		int sum = plus(a, b);
		double result = (double) sum/2;
		return result;
		
	}
	void execute(int a, int b) {
		//int a = 10, b = 20;
		int result = avg(a, b);
		System.out.println("result "+result);
		
	}
	void println(String str) {
		System.out.println(str);
	}
}
