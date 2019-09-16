package Hello;

public class Exercise3I8 {
	public static void main(String[] args) {
		double x = 5.0;
		double y = 0.0;
		
		double z = x % y;
		
		if (Double.isNaN(z)) { // NaN 검사 메소드를 통해 값이 NaN이면 true를 표시하고 
			System.out.println("0.0으로 나눌 수 없습니다."); // 그에 따라 출력값은 참의 출력값을 표시 한다.
		} else {
			double result = z + 10;
			System.out.println("결과: " + result);
	}
}
}