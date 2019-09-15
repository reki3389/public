// 1번문제 조건문 (if문, switch문), 반목문 (for문, while문, do-while문)
// 2번문제  2번 switch문에서 사용할 수 있는 변수의 타입은 int, double이 될 수 있다. X double은 실수 타입이므로 switch문에서 사용 불가

package Hello;

public class Exercise4I3 {
	public static void main(String[] args) {
		int a = 0;
		for(int i=0; i<=100; i+=3) {
			//if(i%3==0) //i를 3으로 나눈 값이 0으로 떨어지는 수를 찾는다.
				a+=i; } //a는 0이므로 i의 값이 100까지 카운트 될동안 3으로 나눈값이 0으로 떨어지는 숫자를 체크해서 += 대입연산자를 이용하여 총 값을 구한다.
				System.out.println(a); //그래서 3의 배수의 합은 a로 나온다.
		}
	}
