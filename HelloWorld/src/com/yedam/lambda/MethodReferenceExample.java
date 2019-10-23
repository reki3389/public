package com.yedam.lambda;

import java.util.function.IntBinaryOperator;

class Calculator {
	static int staticSum(int x, int y) {
		return x + y;
	}
	int instanceSum(int x, int y) {
		return x + y;
	}
}
public class MethodReferenceExample {
	public static void main(String[] args) {
		int a = 10;
		int b = 20, result = 0;
		Calculator.staticSum(a, b);
		
		Calculator cal = new Calculator();
		cal.instanceSum(a, b);
		
		IntBinaryOperator oper; // static 메소드.
		oper = Calculator :: staticSum;
		result = oper.applyAsInt(a, b);
		System.out.println("정적 메소드 참조 :" + result);
		oper = cal::instanceSum; // intance 메소드.
		result = oper.applyAsInt(b, a);
		System.out.println("인스턴스메소드 참조 : " + result);
		
	}
}
