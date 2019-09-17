package Hello;

public class Hello {
	public static void main(String[] args) {
		byte a = 127;
		a = (byte)(a + 1);
		System.out.println("result: " + a);
		int num1 = 10;
		num1++;
		
		int a1 = 5, b = 7;
		num1 = a1++ + ++b;
		System.out.println(a1 +", " + b);
		System.out.println("num1 : " + num1);
		
		if(3>5)
		System.out.println("ok");
		else
		System.out.println("no");
	}
}
