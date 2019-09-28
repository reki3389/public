package Hello;

import java.util.Scanner;

public class Baseballgame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int strike[] = new int[3]; // 문제의 배열의 길이 3 선언
		int first = strike[0]; //각 배열의 길이 공간에 int 타입의 이름을 선언
		int second = strike[1];
		int third = strike[2];

		for (int i = 0; i < strike.length; i++) { // for문을 통해 랜덤 함수를 선언하고 strike 배열에 각각 넣어줌.
			strike[i] = (int) (Math.random() * 9) + 1;
		}
		
		boolean run1 = true; // while문에 사용 할 불린 함수를 생성
		while (run1) { // while문을 실행
			if (strike[0] == strike[1] || strike[0]== strike[2] || strike[1] == strike[2]){  //strike 배열의 중복을 걸러내기 위해 1=1 1=2 1=3 2=3 같은 내용을 걸러서
				for (int i = 0; i < strike.length; i++) { // 다시한번 for문을 돌려서 숫자를 생성
					strike[i] = (int) (Math.random() * 9) + 1; // 
				}
			} // 같은 수가 나오면 계속 돌다가 각각 다른 수가 나오면 
			run1 = false; // 종료
		} 
		
		boolean run = true; // 이제 입력된 값과 생성된 값을 비교하기 위해서 while문 작성을 위한 불린함수 작성
		while (run) { //while 문 실행

			int a = 0; // 스트라이크를 담은 int 함수의 변수 a
			int b = 0; // 볼을 담는 int 함수의 변수 b
			int first1[] = new int[3]; //입력하는 숫자를 담을 배열의 공간 3개 선언

			for (int y = 0; y < first1.length; y++) { //for문을 통해 입력하는 배열의 길이만큼 숫자를 입력받음.
				first1[y] = sc.nextInt();
			}

			for (int u = 0; u < strike.length; u++) {
				if (first1[u] == strike[u]) {
					a += 1;
				}
				for (int z = 0; z < strike.length; z++) {
					if (first1[u] != strike[u] && first1[u] == strike[z]) {
						b += 1;

					}
				}

			}
			if (a == 3) {
				System.out.println("strike 아웃 입니다.");
				break;
			}
			for (int e = 0; e <= 3; e++) {
				if (e == a) {
					System.out.println(a + "스트라이크");
				}
				if (e == b) {
					System.out.println(b + "ball");
				}
			}
		}
		System.out.println("종료입니다.");
	}
}
