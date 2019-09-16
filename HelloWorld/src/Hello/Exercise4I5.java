package Hello;

public class Exercise4I5 {
	public static void main(String[] args) {
		for (int x=1; x<=10; x++) { //첫번째 포문을 통해 인트 x가 숫자 10까지 증가를 하면서 
			for (int y=1; y<=10; y++) { //두번째 포문을 통해 인트 x가 숫자 10까지 증가를 하면서
				if((4*x) + (5*y) == 60) // 인트 4x 와 5y의 값을 60으로 맞추기 위해 서 if 구문을 사용하여 결과를 출력할 수 있도록 한다.
					System.out.println("("+ x + "," + y + ")"); // 결과 출력을 뽑는다.
						}
				}
		}
}