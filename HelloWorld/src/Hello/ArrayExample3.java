package Hello;

public class ArrayExample3 {
	public static void main(String[] args) {
	int[][] ary = new int[2][];
	ary[0] = new int[3];
	ary[1] = new int[4];
	int a = 8;
	for(int i=0; i<ary.length; i++) {
		for(int j=0; j<ary[i].length; j++) {
			ary[i][j] = a++;
			}
		}
		int sum = 0;
		for(int i = 0; i<ary.length; i++) {
			for(int j =0; j<ary[i].length; j++) {
				 sum += ary[i][j]; 
			} System.out.println(sum);
			  sum = 0;
		}
	}
}
	
//		int d = ary[0][0];
//		int e = ary[0][1];
//		int f = ary[0][2];
//		int sum = d+e+f;
//		
//		int ab = ary[1][0];
//		int ac = ary[1][1];
//		int ad = ary[1][2];
//		int ae = ary[1][3];
//		int sum1 = ab+ac+ad+ae;
//		
//		{
//			System.out.println(sum);
//			System.out.println(sum1);
//			