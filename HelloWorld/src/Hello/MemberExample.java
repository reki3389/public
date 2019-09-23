package Hello;

import java.util.Scanner;

public class MemberExample {
	public static void main(String[] args) {

		Member m1 = new Member();
		m1.setName("woosung");
		m1.setId("reki");
		m1.setPassword("1234");
		m1.setAge(33);

		Member m2 = new Member("관리자", "admin");
		m2.setPassword("123");
		m2.setAge(33);

		Member m3 = new Member("사용자1", "user1", "user123", 10);

		Member[] memberAry = { m1, m2, m3 };
		Scanner sc = new Scanner(System.in);
		System.out.print("조회할 아이디 입력 : ");
		String name = sc.nextLine();
		for (Member m : memberAry) {
			if (m.getName().equals(name))
				System.out.println("아이디 :" + m.getId() + ", " +"패스워드 :" + m.getPassword() + ", " + "나이 :" + m.getAge());
		}
	}
}
