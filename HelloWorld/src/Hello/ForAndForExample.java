package Hello;

public class ForAndForExample {
public static void main(String[] args) {
	for(int i=2; i<10; i++) {
		System.out.println("<<"+i+"단>>");
		for(int y=1; y<10; y++) {
			System.out.println(i+"x"+y+"="+i*y);
		}
	}
}
}
