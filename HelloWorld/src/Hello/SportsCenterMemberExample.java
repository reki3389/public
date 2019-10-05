package Hello;

import java.util.Scanner;

public class SportsCenterMemberExample {
	static SportsCenterMember[] main = new SportsCenterMember[100];

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.회원등록 | 2.회원번호조회 | 3.등록그룹별 리스트 | 4.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택 > ");

			int select = sc.nextInt();
			sc.nextLine();

			if (select == 1) {
				createSportsCenterMember();
			} else if (select == 2) {
				memcheck();
			} else if (select == 3) {
				listcheck();
			} else if (select == 4) {
				run = false;
			}
		}
		System.out.println("종료");
	}

	public static void createSportsCenterMember() {
		System.out.print("회원 번호 입력 : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("이름 등록 : ");
		String name = sc.nextLine();
		System.out.print("과정을 적으세요 : 1.swim | 2.tannis | 3.badminturn : ");
		String kind = sc.nextLine();
		SportsCenterMember mem = new SportsCenterMember(id, name, kind);
		for (int i = 0; i < main.length; i++) {
			if (main[i] == null) {
				main[i] = mem;
				break;
			}
		}

	}

	public static void memcheck() {
		System.out.println("맴버 번호 조회");
		for (int i = 0; i < main.length; i++) {
			if (main[i].id == sc.nextInt()) {
				System.out.println(main[i].id + ", " + main[i].name + ", " + main[i].kind);
			} else {
				System.out.println(" 번호가 다릅니다.");
			}
			break;
		}
	}

	public static void listcheck() {
		System.out.println("등록 그룹별 리스트");
		for (int i = 0; i < main.length; i++) {
			if (main[i].kind == sc.nextLine()) {
				System.out.println(main[i].id + ", " + main[i].name + ", " + main[i].kind);
			} else {
				System.out.println("정확한 그룹명을 넣으세요.");
			}
			
		}
	}
}
