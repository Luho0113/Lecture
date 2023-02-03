package nestedEx_01;

public class A {
	//A클래스가 B클래스를 독점해서 사용하는 것
	
	class B{ 
		public B() {
			System.out.println("B클래스의 기본생성자");
		}
		
		void bMethod() {
			System.out.println("B클래스의 내부 메소드");
		}
	};
	
	// B field = new B();
	
	//A의 기본 생성자 안에 객체 생성
	A() {
		System.out.println("A클래스의 기본생성자");
		B b = new B();
	}
	
	//메소드 안에 선언
	void method() {
		System.out.println("↓↓ 메소드 호출 ↓↓");
		B b = new B();
	}
}
