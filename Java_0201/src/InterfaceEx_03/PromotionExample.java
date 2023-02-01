package InterfaceEx_03;

public class PromotionExample {

	public static void main(String[] args) {
		// p370
		
		//구현 객체 생성
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//인터페이스 변수 선언
		A a;
		
		//인터페이스 변수에 구현 객체를 대입
		a = b;  //A <- B
		a = c;
		a = d;
		a = e;
		
		
		//다형성(상속)으로 객체 생성해보기 
		//부모타입 변수 = new 자식();
		B b1 = new D();
		C c1 = new E();
		A a1 = new B();
		A a2 = new C();
		A a3 = new D();
		A a4 = new E();
		
		// B b2 = new E();
		// E의 부모는 C, A이기 때문에 오류 발생함
		
		
		//a2이라는 참조변수를 통해 C클래스의 메소드를 호출하기
		C c2 = (C) a2; //다운 캐스팅
		c2.c1();
		
		//a4라는 참조변수를 통해 E클래스의 메소드를 호출하기
		E e4 = (E) a4; 
		e4.printAll();
		
		//오버라이딩으로 메소드 호출하기
		//부모한테 메소드를 만들어두고 재정의 하기 C 또는 A
		c1.printOver();
		

	}

}
