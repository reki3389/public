package Hello;

import java.util.Scanner;

public class AccountExample {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.입금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------");
			int menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				createAccount();
			} else if (menu == 2) {
				getAccountlist();
			} else if (menu == 3) {
				deposit();
			} else if (menu == 4) {
				withdraw();
			} else if (menu == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	// 계좌이스턴스 만드는 메소드.
	public static void createAccount() {
		System.out.print("계좌번호 입력 : ");
		String accountNo = sc.nextLine();
		System.out.print("사용자명 입력 : ");
		String accountName = sc.nextLine();
		System.out.print("첫 계좌금액 : ");
		int accountBalance = sc.nextInt();
		Account accnt = new Account(accountNo, accountName, accountBalance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = accnt;
				break;
			}
		}
	}

	// 계좌 리스트 조회하는 메소드.
	public static void getAccountlist() {
		System.out.println("getAccountlist");
		for (Account a : accountArray) {
			if (a != null)
				System.out.println("계좌번호 : " + a.getAno() + ", 소유자 : " + a.getOwner() + ", 잔액 : " + a.getBalance());
		}
	}

	// 입금.
	public static void deposit() {
		System.out.print("계좌번호 입력 : ");
		String accntNo = sc.nextLine();
		System.out.print("입금액 : ");
		int accntBalance = sc.nextInt();
		for (Account accnt : accountArray) {
			if (accnt != null && accnt.getAno().contentEquals(accntNo)) {
				accnt.setBalance(accntBalance);
			}
		}
	}

	// 출금.
	public static void withdraw() {
		System.out.print("계좌번호 입력 : ");
		String accntNo = sc.nextLine();
		System.out.print("출금액 : ");
		int accntBalance = sc.nextInt();
		for (Account accnt : accountArray) {
			if (accnt != null && accnt.getAno().contentEquals(accntNo)) {
				accnt.setBalance(-accntBalance);
			}

		}
		for (Account a : accountArray) {
			if (a != null)
				System.out.println("현재 잔액 : "+a.getBalance());
		}
	}

	public static Account findAccount(String ano) {
		return null;
	}
}
