package Hello;

public class Exercise3I7 {
	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		
		System.out.println((x>7) && (y<=5));
		// ----(true) x는 7보다 높은경우 그리고 y는 5보다 작거나 같은 경우 논리연산자 &&의 산술에 의해 둘다 같을 경우 참
		System.out.println((x%3 == 2) || (y%2 != 1));
		//----(false) x를 3으로 나눈 나머지 값은 2와 같지않음(비교연산자 ==2 와 같지 않음), y를2로 나눈 값은 1과 같음(하지만 != 달라야 참이므로 틀림) 그리고 ||는 논리연산자 or이므로 둘중에 하나만 같으면 참이지만 둘다 틀려서 false
	}
}
