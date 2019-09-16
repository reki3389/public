package Hello;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		int[] intAry = new int[5]; {
			for(int i=0; i<5; i++) { 
				System.out.println("입력하세요");
			Scanner scanner = new Scanner(System.in);
				intAry[i] = scanner.nextInt() ; {
					System.out.println("입력값"+intAry[i]);
					}
			} 
				System.out.println("끝");
		}
	}
}