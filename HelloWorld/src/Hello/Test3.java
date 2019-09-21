package Hello;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += n + a[i];
			
		}System.out.println(sum);
		
	}
}
