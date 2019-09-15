package Hello;

public class sample {
public static void main(String[] args) {
	for (int i = 2; i<10; i++) {
	      System.out.println();
	      for (int y = 1; y<10; y++) {  // 2단 ~ 5단까지
	        System.out.format("%d X %d = %2d   ", i, y, i*y);
	        //System.out.println(i+"x"+y+"="+i*y);
	      }
	    }
}
}