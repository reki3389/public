package Hello;

public class Exercise4I4 {
	public static void main(String[] args) {
		int sum = 0; // sum 값을 맨처음 0으로 주고
		while (true) { // while문을 통해 참의 값을 뽑으려고 할때
		int num1 = (int) (Math.random()*6) +1; //num1의 주사위의 랜덤 숫자를 뽑아 
		int num2 = (int) (Math.random()*6) +1; //num2의 주사위의 랜덤 숫자를 뽑아
		System.out.println("(" + num1 + "," + num2 + ")"); // 두 주사위의 랜덤 숫자를 뽑는다.
		sum = num1 + num2; // 그리고 두 숫자를 더해서
		if (sum == 5) { // 합계가 5가 되면 
			break; // 브레이크문을 사용해서 중지
						}
				}
		}
}