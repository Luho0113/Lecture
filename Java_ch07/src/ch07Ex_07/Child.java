package ch07Ex_07;

public class Child extends Parent{
	public String name;
	
	public Child() {
		this("홍길동"); //문자열을 가질 수 있는 부모의 기본 생성자를 호출
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name call");
	}
}
