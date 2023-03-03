package lambdaEx_01;

public class Member {
	
	private String id;
	private String name;
	
	//id�� ��ü�� �����ϴ� ������
	public Member(String id) {
		this.id = id;
		System.out.println("Member(String id)");
		
	}
	
	//id, name ���� ��ü�� �����ϴ� ������
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
