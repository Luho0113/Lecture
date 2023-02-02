package ch06Ex;

public class Member {
	//13번 클래스 선언하기
	String name;
	String id;
	String password;
	int age;
	
	//14번 생성자 추가 + 외부에서 받은 값으로 초기화하기
	public Member(String name, String id) {
		this.name=name; //name을 받아서 필드의 name에 리턴
		this.id=id;
	}
}
