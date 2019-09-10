package Hello;

public class WhiileExample {
	public static void main(String[] args) {
		int i = 1;
		while(true) {
			if (i++ <= 5)
				continue;
			System.out.println(i);
			if (i == 9)
				break;
		}
	}
}
