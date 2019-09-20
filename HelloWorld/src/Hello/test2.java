package Hello;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] money = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 1}; // 종류
		int[] result = new int[9]; //갯수

		int push = sc.nextInt(); //금액입력

		for (int i = 0; i < money.length; i++) {
			result[i] = push / money[i];
			push = push%money[i];
			System.out.println(money[i]+"원 갯수 = "+result[i]);
			}
		}
	}
