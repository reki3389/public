package Hello;

public class While2Example {
public static void main(String[] args) {
	int i=2;
	while (i<10) {
		System.out.println("<<"+i+"단>>");
			int y=1;
			while(y<10) {
				System.out.println(i+"x"+y+"="+i*y);
				y++;
						}
		i++;	
		System.out.println();
				 }
	}
}