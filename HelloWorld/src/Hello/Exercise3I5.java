package Hello;

public class Exercise3I5 {
	public static void main(String[] args) {
	int value = 356;
	System.out.println(value - 56); // ---- 산술연산자만 사용하여 벨류값을 300을 도출하기 위해 벨류에 대한 300 나머지 값을 마이너스
	System.out.println(value -= value % 100); // ---- 대입연산자를 사용해서 우측 벨류의 100을 나눈 나머지 값을 뺀 왼쪽 벨류의 값을 구함
}
}
