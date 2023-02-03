package nestedEx_01;

public class OuterA {
	//내부 클래스가 혜택이 더 많음 (내거 내거, 니거 내거 = 객체를 굳이 생성하지 않아도 외부 클래스의 멤버들을 직접 사용할 수 있음)
	
	//OuterA의 필드
	int a = 100;
	
	//OuterA의 메소드
	void aMethod() {
		
		a = a + 200;
		
		// 외부 클래스는 내부 클래스의 필드, 메소드를 내부 클래스처럼 사용할 수 없음!
		// ia = ia + 200;
		// innerAMethod();
		
		//내부 클래스 객체화
		InnerA innerA = new InnerA();
		//객체화된 주소를 통해서 내부 클래스의 필드나 메소드를 사용해야 함
		innerA.ia = innerA.ia + 200;
		innerA.innerAMethod();
		
	}
	
	//OuterA의 생성자
	public OuterA() {
		
	}
	
	//내부 클래스
	class InnerA {
		int ia = 200;
		void innerAMethod() { 
			a = a + 400; //외부클래스의 변수(필드)를 사용할 수 있음
			aMethod(); //외부클래스의 메소드를 호출할 수 있음
		}
		public InnerA() { }
	}

}
