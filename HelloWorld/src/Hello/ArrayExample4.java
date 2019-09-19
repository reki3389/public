package Hello;

public class ArrayExample4 {
	public static void main(String[] args) {
		String[] strAry = { "Hello", "world", "Good", "Morning" };
		String[] copyAry = new String[strAry.length];
//		for (int i = 0; i < strAry.length; i++) {
//			copyAry[i] = strAry[i];
//			System.out.println(strAry[i]);
//		}
//		System.out.println();
//
//		for (String str : strAry) {
//			System.out.println(str);
//		}
//		System.out.println();

		System.arraycopy(strAry, 0, copyAry, 0, strAry.length);
		for (String str : copyAry) {
			System.out.println(str);
		}
	}
}
