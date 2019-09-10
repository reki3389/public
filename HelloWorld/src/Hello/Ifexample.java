package Hello;

public class Ifexample {
	public static void main(String[] args) {
		int a = 99; {
			if(a>=90)                          // ( || = or), ( && = and)
				if (a >= 95) {
					System.out.println("a+");
				}else {
					System.out.println("a");
			} else if (a>80) {
				System.out.println("b");
			} else if (a>70) {
				System.out.println("c");
			}else {
				System.out.println("f");
			}
		}
		
		}	
	}

