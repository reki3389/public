package com.yedam.lambda;

@FunctionalInterface // 람다식 정의
interface MyInterface {
	int print(int a, int b); // 펑셔널 인터페이스 가 하나만 있어야 한다는 관점은 람다식의 정의..
}// 기존에 구현된 인터페이스 자체의 파라메터타입 및 리턴타입은 익명구현시 변경이 안된다.


//class MyInterfaceClass implements MyInterface {

//	@Override
//	public int print(int a, int b) {
//		return a + b;
//	}
//
//}

public class LambdaBasicExample {
	public static void main(String[] args) {
		MyInterface mi = new MyInterface();
		int result = mi.print(4, 9);
			System.out.println(result);
		
		 mi = (a, b) -> { return a * b; }; // 이것이 람다식 표현이다.
		
		result = mi.print(3, 5);
		System.out.println(result);
		
		mi = new MyInterface() {
			
			@Override
			public int print(int a, int b) {
				// TODO 자동 생성된 메소드 스텁
				return a-b;
			}
		};
		
		result = mi.print(4, 5);
		System.out.println(result);
		
		MyInterface mi3 = (a, b) -> { 
			return 
					8 / 4; System.out.println("결과값은 " + mi3.print(8, 4));
		};
	}
}