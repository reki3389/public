package classes;

import java.util.Scanner;

public class CarcExample {
	public static void main(String[] args) {
		Calculator cal = new  Calculator();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		cal.execute(a, b);
}
}