package Hello;

import java.util.Scanner;

public class Exercise5I9 {
	public static void main(String[] args) {
		boolean run = true;
		int studentnum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.println("선택> ");
			
			int selectno = scanner.nextInt();
			
			if(selectno == 1) {
				studentnum += scanner.nextInt();
				System.out.println("학생수> "+studentnum);
				scores = new int[studentnum];
			} else if(selectno == 2) {
				for(int i = 0; i<studentnum; i++) {
					scores[i] = scanner.nextInt();
				}
			} else if(selectno == 3) {
				for(int i = 0; i<studentnum; i++)
				System.out.println(scores[i]);
			} else if(selectno == 4) {
				int max;
				max = (scores[i] > studentnum ? 
			} else if(selectno == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
}
