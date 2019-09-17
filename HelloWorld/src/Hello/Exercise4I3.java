package Hello;

public class Exercise4I3 {
	public static void main(String[] args) {
		int a = 0; // a라는 명령을 0으로 주고
		for(int i=0; i<=100; i+=3) { //for문을 이용해서 0부터 시작하여 100까지 카운트 하면서 += 복합대입 연사자를 통해 3의 배수를 체크 한다.
			a+=i; //그 3의 배수의 합을 출력하기 위해 += 복합대입연산자를 사용한다.
		}System.out.println("3의 배수의 합:"+a); // a를 출력한다.
	}
}