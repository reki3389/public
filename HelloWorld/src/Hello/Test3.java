package Hello;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
//		System.out.println("가격이" + "￦" + "300입니다");
//		가격이 표시되는 이스케이프 문자에 대해 문의 하기 
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int sum = 0;
		double avg = 0.0;
		int max = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1학생수, 2점수입력, 3점수리스트, 4분석, 5종료");
			System.out.println("----------------------------------");
			System.out.print("선택> ");
			
			int SelectNo = sc.nextInt();
			
			if(SelectNo == 1) {
				System.out.print("학생수 : ");
				studentNum += sc.nextInt();
				scores = new int[studentNum];
			}else if(SelectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print(i + ": ");
					scores[i] += sc.nextInt();
				}
			}else if(SelectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println(i+ ":" +scores[i]);
				}
			}else if(SelectNo == 4) {
				for(int i = 0; i <scores.length; i++) {
					max = (max > scores[i]) ? max : scores[i];
					sum += scores[i];
					avg = sum / scores.length;
				}
				System.out.println(avg);
				System.out.println(max);
			}else if(SelectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
