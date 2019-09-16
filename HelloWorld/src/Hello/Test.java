package Hello;

public class Test {
public static void main(String[] args) {
		int a = 0;
			for(int i=1; i<=10; i++) {
				if(i%2 != 0) {
				a+=i;
				}
			}
		System.out.println("1부터 10까지 홀수의 합은 : "+a);
	}
}
