package Hello;

public class StringExample {
	public static void main(String[] args) {
		String str1 = "Nice"; // int, short, long과는 다름.
		String str2 = "Nice";
		
		if(str1 == str2) {
			System.out.println("동일한 참조값.");
		}else {
			System.out.println("다른 참조값.");
		}
		String str3 = new String("Nice");
		String str4 = new String("Nice");
		if (str3 == str4) { //주소값으로 비교할때는 (==)
			System.out.println("동일한 참조값."); 
		} else {
			System.out.println("다른 참조값.");
		}
		if(str3.equals(str4)) { //값을 비교할때는 (equals) 
			System.out.println("동일한값.");
		} else {
			System.out.println("다른 값.");
		}
}
}
