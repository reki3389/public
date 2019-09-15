package Hello;

import java.util.Scanner; // 스캐너 함수를 지정해준다.
public class Exercise4I7 {
	public static void main(String[] args) {
		boolean run = true; // 참의 경우에서 계속 출력이 되게끔 한다.
		
		int balance = 0; // 총 잔고를 선언 해준다.
		
		Scanner input = new Scanner(System.in); //스캐너 함수를 사용하여 인풋을 넣어주는 함수를 작성한다. 
		
		while(run) { //while 문을 통해 밑의 출력문들을 출력해준다.
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			System.out.print("선택> ");
			
			int a = input.nextInt(); // 인트 a의 값은 인풋 값을 측정한다.
			
			if(a == 1) { // if문으로 a는 1과 같다는 선언을 해주면 1을 넣었을때 밑의 출력문이 나오고  예금액이 출력된다.
				System.out.print("예금액> "); 
				balance += input.nextInt();// 출력된 예금액의 금액을 대입연산자 += 를 통해 밸런스에 금액을 증가해준다.
				System.out.println("잔액> " + balance);
			} else if(a == 2) { // 2를 a와 같다는 선언을 통해 2를 입력하면
				System.out.print("출금액> "); // 출금액이 나오고 
				balance -= input.nextInt(); // 밸런스에 있는 숫자를 인풋받은 숫자를 -= 대입연산자를 통해 금액을 가감해준다.
				System.out.println("잔액> " + balance);
			} else if(a == 3) { // 3을 a와 같다는 선언을 통해 3을 입력하면
				System.out.println("잔고>"+balance); // 현재 밸런스를 표시해준다.
			} else if(a == 4) { // 4번을 통해 run = false라는 값을 통해 연산을 종료한다.
			  run = false; 
			  break;
			}
		}
		System.out.println("프로그램 종료"); // 4번을 입력시 연산은 종료되고 최종적인 출력값 프로그램 종료라는 글을 내놓는다.
	}
	
}
