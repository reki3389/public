package Hello;

import java.util.Arrays;
import java.util.Scanner;

public class TestScore {
	static Scanner sc = new Scanner(System.in);
	static student[] stuAry = new student[100];

	public static void main(String[] args) {
		totalist();

	}

	public static void totalist() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("학생 성적 등록 ");
			System.out.println("1.학생성적등록| 2.전체리스트 | 3.학생번호조회 | 4.전체통계 | 5.총점기준정렬 | 6.종료");
			int menu = sc.nextInt();
			sc.hasNextLine();
			if (menu == 1) {
				write();
			} else if (menu == 2) {
				getlist();
			} else if (menu == 3) {
				getstulist();
			} else if (menu == 4) {
				getavglist();
			} else if (menu == 5) {
				getallavglist();
			} else if (menu == 6) {
				System.out.println("종료");
				break;
			}
		}
		System.out.println("끝");
	}

	public static void write() {
		System.out.println("학생성정 등록 ");
		System.out.print("학생 번호 : ");
		int stunum = sc.nextInt();
		sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("국어 : ");
		int korean = sc.nextInt();
		System.out.print("영어 : ");
		int english = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		int sum = korean + english + math;
		int avg = (korean + english + math) / 3;
		student stu = new student(stunum, name, korean, english, math, sum, avg);
		for (int i = 0; i < stuAry.length; i++) {
			if (stuAry[i] == null) {
				stuAry[i] = stu;
				break;
			}
		}
	}

	public static void getlist() {
		System.out.println("전체 학생 조회");
		for (int i = 0; i < stuAry.length; i++) {
			if (stuAry[i] != null) {
				System.out.println(stuAry[i].getStunum() + ", " + stuAry[i].getName() + ", " + stuAry[i].getMath()
						+ ", " + stuAry[i].getKorean() + ", " + stuAry[i].getEnglish() + ", " + stuAry[i].getSum()
						+ ", " + stuAry[i].getAvg());
			}
		}
	}

	public static void getstulist() {
		System.out.print("학생 번호 조회 : ");
		int stunum = sc.nextInt();
		for (int i = 0; i < stuAry.length; i++) {
			if (stuAry[i] != null && stuAry[i].getStunum() == stunum) {
				System.out.println(stuAry[i].getStunum() + ", " + stuAry[i].getName() + ", " + stuAry[i].getMath()
						+ ", " + stuAry[i].getKorean() + ", " + stuAry[i].getEnglish() + ", " + stuAry[i].getSum()
						+ ", " + stuAry[i].getAvg());
			}
		}

	}

	public static void getavglist() {
		System.out.println("전체 점수 ");
		int ab = 0;
		int ac = 0;
		int count = 0;
		for (int i = 0; i < stuAry.length; i++) {
			if (stuAry[i] != null) {
				ab += stuAry[i].getAvg();
				count++;
			}

			ac = ab / count;
		}
		System.out.println("평균 : " + ac);
	}

	public static void getallavglist() {
		student[] sumAry = new student[100];
		int count = 0;
		for (int i = 0; i < stuAry.length; i++) {
			for (int y = i + 1; y < stuAry.length; y++) {
				if (stuAry[i] != null) {
					System.out.println("학생 " + stuAry[i].getStunum());
					sumAry[i] = new student();
					sumAry[i].setStunum(stuAry[i].getStunum());
					sumAry[i].setName(stuAry[i].getName());
					sumAry[i].setKorean(stuAry[i].getEnglish()+stuAry[i].getKorean()+stuAry[i].getMath());
					
					count++;
				}
			}
			count--;
			for(int y = 0; y < count; y++) {
				for(int c = 0; c< count; c++) {
					student student = null;
					if(sumAry[i].getKorean() > sumAry[i + 1].getKorean()) {
						student = sumAry[i];
						sumAry[i] = sumAry[i * 1];
						sumAry[i + 1] = student;
					}
				}
			}
			for (student s : sumAry) {
				if(s != null)
					System.out.println(s.getStunum() + " / " + s.getName() + " / " + s.getKorean());
			}
		}
		System.out.println();
	}
}
