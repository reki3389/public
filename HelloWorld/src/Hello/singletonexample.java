package Hello;

public class singletonexample {
	public static void main(String[] args) {
		//singleton s1 = new singleton();
		singleton s1 = singleton.getInstance();
		singleton s2 = singleton.getInstance();
		if (s1==s2)
			System.out.println("같은객체");
		else
			System.out.println("다른객체");
	}
}
