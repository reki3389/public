package Hello;

public class singleton {
	private static singleton singleton = new singleton();
	private singleton() {}
	static singleton getInstance() {
		return singleton;
	}
}
