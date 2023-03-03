package lambdaEx_01;

public class Member {
	
	private String id;
	private String name;
	
	//id로 객체를 생성하는 생성자
	public Member(String id) {
		this.id = id;
		System.out.println("Member(String id)");
		
	}
	
	//id, name 으로 객체를 생성하는 생성자
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Member(String id, String name)");
	}
	
	
	@Override
	public String toString() {
		String info = "{id:" + id + ", name: " + name + " }";
		return info;
	}
	
	

}
