package Hello;

public class Exercise3I3 {
	public static void main(String[] args) {
		int score = 85;
		String result = (!(score>90))? "가":"나";
		System.out.println(result); // ---- !는 보수로 값을 역으로 변화시키고 ? "값1":"값2" 는 삼항 연산자로써 앞의 연산이 참일경우 가, 거짓일 경우 나
	}
}