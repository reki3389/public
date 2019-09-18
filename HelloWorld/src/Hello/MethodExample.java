package Hello;

import java.util.Scanner;

public class MethodExample {
	public static void main(String[] args) {
		int[] intAry = {2, 3, 4, 5, 6};
		int sum = 0;
		sum = sum2(intAry);
		System.out.println("합은 : " + sum);
	
	}
		public static int sum2(int[] ary) {
			int sum = 0;
			for(int i=0; i<ary.length; i++) {
				sum += ary[i];
			}
			return sum;
		}
}
		
		
		
		
		
		
//		
//		Scanner yourtall = new Scanner(System.in);
//		
//		System.out.println(args[0]);
//		int a = 50;
//		showname();
//		showage(a);
//		showme(200, 100);
//		int result = sum(4, 5);
//		System.out.println(args[1]);
//		System.out.println("결과값: "+ result);
//		System.out.println();
//		
//		double result1  = divide(10, 2);
//		System.out.println(result1);
//		
//		int result2 = minus(10, 2);
//		System.out.println(result2);
//		
//		int result3 = multi(10, 2);
//		System.out.println(result3);
//		System.out.println();
//		
//		System.out.print("당신의 키를 입력하세요 : ");
//		double taller = yourtall.nextInt();
//		double result4 = tall(taller);
//
//		System.out.println("당신의 적정 몸무게는 "+result4+"kg 입니다.");
//		
//	}
//	
//	public static double tall (double a) {
//		return (a - 100) * 0.9;
//	}
//	
//	
//	public static double divide (double c, double d) {
//		return c / d;
//	}
//	
//	public static int minus(int e, int f) {
//		return e - f;
//	}
//	
//	public static int multi(int g, int h) {
//		return g * h;
//	}
//	
//	
//	
//	
//	
//	public static int sum(int a, int b) {
//		return a + b;
//	}
//	
//	public static void showme(double height, double weight) {
//		System.out.println("I am "+height+"cm and "+weight+"kg");
//	}
//	
//	public static void showage(int age) {
//		System.out.println("I am "+age+" years old.");
//	}
//	
//	public static void showname() {
//		System.out.println("Hello, my name is kwon.");
//	}
//	
//	
//	
//}
