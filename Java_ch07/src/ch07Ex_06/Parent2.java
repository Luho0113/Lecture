package ch07Ex_06;

public class Parent2 {
	public String name;
	
	
	//생성자
	public Parent2(String name) {
		this.name = name;
	}
	
	//기본 생성자
	public Parent2() {}
	
	//부모클래스에 기본 생성자를 미리 만들어놓으면 
	//자식클래스에서 객체를 생성할 때 부모의 기본 생성자와 함께 자동으로 컴파일 됨

}