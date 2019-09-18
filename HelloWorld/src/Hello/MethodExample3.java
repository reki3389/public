package Hello;

import java.util.Scanner;

public class MethodExample3 {
	public static void main(String[] args) {
		sub(5);
		sub1(5);
		show(1, 2, 3, 4, 5);
		
		int[] sum = show(2, 2, 4, 5, 1);
		for(int i=0; i<sum.length; i++ ) {
		System.out.println(sum[i]);
		}
		// ==> enhanced for
		for (int a : sum) {
			System.out.println(a);
		}
	}

	public static void sub(int ary) {
		for (int i = 1; i <= ary; i++) {
			for (int y = 0; y < i; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void sub1(int ary1) {
		for (int i = 0; i <= ary1; i++) {
			for (int y = 5; y > i; y--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static int[] show(int... ary) {
			int[] intary = new int[ary.length];
			for(int i = 0; i <intary.length; i++) {
					intary[i] = ary[i]; 
			}
			return intary;
		
	}
}