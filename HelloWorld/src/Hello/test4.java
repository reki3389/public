package Hello;

public class test4 {
	public static void main(String[] args) {
		test5 mycom = new test5();
		
		int[] values1 = {1, 2, 3};
		int result1 = mycom.sum1(values1);
		System.out.println(result1);
		
		int result2 = mycom.sum1(new int[] {1,2,3});
		System.out.println(result2);
		
		int result3 = mycom.sum2(1, 2, 3);
		System.out.println(result3);
		
		int result4 = mycom.sum2(1, 2, 3, 4, 5);
		System.out.println(result4);
		
	}
}