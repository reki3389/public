package Hello;

import java.util.Scanner;

public class MemberExample2 {
	private static Member[] idlist = new Member[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------");
			System.out.println("1.계정생성 | 2.전체리스트 | 3.id조회 | 4.종료 ");
			System.out.println("-----------------------------------");
			int menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				createMember();
			} else if (menu == 2) {
				getMemberList();
			} else if (menu == 3) {
				idserching();
			} else if (menu == 4) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	// 맴버 생성 메소드.
	public static void createMember() {
		System.out.print("name 입력 : ");
		String name = sc.nextLine();
		System.out.print("id 입력 : ");
		String id = sc.nextLine();
		System.out.print("password 입력 : ");
		String password = sc.nextLine();
		System.out.print("age 입력 : ");
		int age = sc.nextInt();
		Member idtool = new Member(name, id, password, age);
		for (int i = 0; i < idlist.length; i++) {
			if (idlist[i] == null) {
				idlist[i] = idtool;
				break;
			}
		}
	}

	// 맴버 조회 리스트
	public static void getMemberList() {
		for (Member a : idlist) {
			if (a != null)
				System.out.println("이름:" + a.getName() + ", id:" + a.getId() + ", password:" + a.getPassword()
						+ ", 나이: " + a.getAge());
		}
	}

	// id조회
	public static void idserching() {
		System.out.print("id 입력: ");
		String id = sc.nextLine();
		System.out.print("password 입력: ");
		String password = sc.nextLine();
		boolean isid = false, ispassword = false;
		String name = null;
		int age = 0;
		for (Member idtool : idlist) {
			if (idtool != null && idtool.getId().equals(id)) {
				if (idtool.getPassword().equals(password)) {
					isid = true;
					ispassword = true;
					age = idtool.getAge();
					name = idtool.getName();
					break;
				} else {
					isid = true;
					ispassword = false;
					break;
				}
			} else {
				isid = false;
				ispassword = false;
				
			}
		}
		if (isid == true && ispassword == true) {
			System.out.println("이름 : " + name + ", 나이 : " + age);
		} else if (isid == true && ispassword == false) {
			System.out.println("패스워드가 틀립니다.");
		} else if (isid == false && ispassword == false) {
			System.out.println("존재하지 않는 아이디 입니다.");
		}
	}
}
