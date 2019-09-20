package Hello;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int push = sc.nextInt(); //입력받는 돈을 받는 함수 이름 push
		
		int money = push; //입력받는 함수의 변수를 설정해준다.
		int ex1 = money/50000; //입력받은 수를 5만으로 나누어주면 갯수가 나온다.
		int ex2 = (money%50000)/10000; //오만을 나눈 나머지에 만을 나눠주면 만원의 갯수가 나오고
		int ex3 = (money%10000)/5000; //만을 나눠준 나머지를 오천을 나눠주면 오천원의 갯수가 나온다
		int ex4 = (money%5000)/1000; //오천을 나눈 나머지를 가지고 천으로 나누면 천원의 갯수가 나온다
		int ex5 = (money%1000)/500; // 그리고 천으로 나눈 나머지를 가지고 오백을 나누면 오백원의 갯수가 나온다.
		int ex6 = (money%500)/100; // 오백을 나눈 나머지를 가지고 백을 나누면 백원의 갯수가 나온다.
		int ex7 = (money%100)/10; // 백을 나눈 나머지를 가지고 십을 나누면 십원의 갯수가 나온다.
		
		System.out.println("오만원권 :"+ex1);
		System.out.println("만원권 :"+ex2);
		System.out.println("오천원권 :"+ex3);
		System.out.println("천원권 :"+ex4);
		System.out.println("오백원 :"+ex5);
		System.out.println("백원 :"+ex6);
		System.out.println("십원 :"+ex7);
		
				
	}
}
