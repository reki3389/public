package Hello;

import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] intAry = new int[5]; {
			for(int i = 0; i < intAry.length; i++) {
				System.out.print("입력값:");
				intAry[i] = sc.nextInt();
		}
		
		int maxvalue = 0 ;
			for(int i = 0; i< intAry.length; i++) {
				maxvalue = (maxvalue > intAry[i] ? maxvalue : intAry[i] );  
			}
			System.out.println("제일 큰값 "+maxvalue);
		}
		sc.close();
	}
}
	


