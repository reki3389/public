package Hello;

public class SportsCenterMember {
	int id;
	String name;
	String kind;
	
	public SportsCenterMember (int id, String name, String kind) {
		this.id = id;
		this.name = name;
		this.kind = kind;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
}
