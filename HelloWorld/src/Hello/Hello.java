package Hello;

public class Hello {
	public static void main(String[] args) {
		int max = 0;
		for (int i = 1; i < 200; i++) {
			if (i % 3 != 0 && i % 7 != 0) {
				continue;
			}
			max = max < i ? i : max;
		}
		System.out.println(max);

	}
}
