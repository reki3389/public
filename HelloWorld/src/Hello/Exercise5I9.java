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
			System.out.print("선택> ");
			
			int selectno = scanner.nextInt();
			
			if(selectno == 1) {
				System.out.print("학생수> ");
				studentnum = scanner.nextInt();
				scores = new int[studentnum];
				System.out.println("학생수 : "+ studentnum);
			} else if(selectno == 2) {
				for(int i = 0; i<studentnum; i++) {
					System.out.print("score["+i+"]:");
					scores[i] = scanner.nextInt();
					}
			} else if(selectno == 3) {
				for(int i = 0; i<studentnum; i++) {
				System.out.println("score["+i+"]:"+scores[i]);
				}
			} else if(selectno == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0;
				for(int i = 0; i<scores.length; i++) {
					max = (max < scores[i]) ? scores[i] : max;
					sum += scores[i];
				}
					avg =  (double) sum / studentnum ;
					System.out.println("제일 높은 점수 :"+max);
					System.out.println("평균 점수 :"+avg);
			} else if(selectno == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
}
