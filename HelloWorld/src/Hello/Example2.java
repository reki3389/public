package Hello;

public class Example2 {
	public static void main(String[] args) {
		int i=1;
		while(i<10){
			int y = 2;
			while(y<10) {
				System.out.print(y+" x "+i+" = "+ y*i+" ");
				y++;
			} 
			System.out.println();
			i++;
		}
	}
}