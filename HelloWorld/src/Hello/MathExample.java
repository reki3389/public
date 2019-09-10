package Hello;

public class MathExample {
	public static void main(String[] args) {
		int a = 75;
		a = (int) (Math.random()*100);
		a = a / 10;
		switch(a){
		case 9:
			System.out.println("A등급" + a);
			break;
		case 8:
			System.out.println("B등급" + a);
			break;
		case 7:
			System.out.println("C등급" + a);
			break;
		case 6:
			System.out.println("D등급" + a);
			break;
		default:
			System.out.println("F등급" + a);
		}
//		//System.out.println(b);
//		if(a >= 90) {
//			System.out.println("A등급" + a);
//		} else if (a>=80) {
//			System.out.println("B등급" + a);
//		} else if (a>=70) {
//			System.out.println("C등급" + a);
//		} else if (a>=60) {
//			System.out.println("D등급" + a);
//		} else {
//			System.out.println("F등급" + a);
//		}
	}
}
