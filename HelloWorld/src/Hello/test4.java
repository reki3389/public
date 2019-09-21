package Hello;

import java.util.Scanner;

public class test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		long sum = 0;
		for(long i = 0; i <= a.length; i++) {
			sum += (long) i;
			
		}System.out.println(sum);
		
	}
}