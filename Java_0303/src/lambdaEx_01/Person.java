package lambdaEx_01;

public class Person {
	//Creatable1,2를 매개변수로 가지는 getMember1,2 메소드
	
	public Member getMember1(Creatable1 creatable) {
		String id = "winter";
		Member member = creatable.create(id);
		return member;
	}
	
	public Member getMember2(Creatable2 creatable) {
		String id = "winter";
		String name = "한겨울";
		Member member = creatable.create(id, name);
		return member;
	}

}
