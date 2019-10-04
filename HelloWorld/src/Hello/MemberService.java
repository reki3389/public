package Hello;

public class MemberService {
	String id;
	String password;

	public boolean login(String id, String string2) {
		this.id = id;
		this.password = password;
		if (id == "hong" && password == "12345") 
			return true;
		 else 
			return false;
	}
}