package ch07Ex_06;

public class Child2 extends Parent2{
	public int studentNo;
	
	//2개의 매개변수를 가지는 생성자
	public Child2(String name, int studentNo) {
		//부모의 기본 생성자를 객체화하고 자식의 생성자 값이 객체화됨 (...??
		this.name = name;
		this.studentNo = studentNo;
	}
}
