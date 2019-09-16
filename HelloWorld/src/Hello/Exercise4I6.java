package Hello;

public class Exercise4I6 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) { // int i의 값을 1로 주고 5번의 카운팅 동안
			for(int y=1; y<=i; y++) { // int y를 i의 횟수에 맞춰 돌게 셋팅하고
			System.out.print("*"); // y의 표시를 *로 한다.(println을 하게 되면 한개마다 하나씩 엔터가 되는 효과가 있으므로 ln을 빼준다.)
					} System.out.println(); //최종적으로 하나씩 보여주기 위해 println을 통해 엔터 개념을 삽입 한다.
				}
			}	
		}