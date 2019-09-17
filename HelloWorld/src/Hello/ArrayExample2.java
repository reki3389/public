package Hello;

public class ArrayExample2 {
	public static void main(String[] args) {
		int[][] ary = new int[5][5]; 
			int a = 1;
			for(int i = 0; i<ary.length; i++) {
				for(int y = 0; y<ary.length; y++) {
					ary[y][i] = a++;
				System.out.print(ary[y][i]+"|");
			}
			System.out.println();
		}
			for(int i=4; i>=0; i--) {
				for(int y = 0; y<ary.length; y++)
					System.out.print(ary[i][y]+"|");
				System.out.println();
			}
		}
	}