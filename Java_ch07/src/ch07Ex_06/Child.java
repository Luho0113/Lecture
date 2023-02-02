package ch07Ex_06;

public class Child extends Parent{
	public int studentNo;
	
	//2개의 매개변수를 가지는 생성자
	public Child(String name, int studentNo) {
		
		super(name); //방법 1. 부모의 생성자를 호출
		
		this.studentNo = studentNo;
		
		//super(name), super(name, studentNo)가 자동으로 컴파일되는데 studentNo는 부모클래스에 없으므로 오류발생
		//아예 부모 클래스에 생성자가 없다면, 자바에서 자동으로 기본 생성자를 부모클래스에 생성해줌
		//또는 아예 처음부터 부모 클래스에 기본 생성자를 만들어두고 시작
	}
}
