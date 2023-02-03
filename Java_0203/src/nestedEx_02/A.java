package nestedEx_02;

public class A {
	
	int a = 10;
	static int sa = 20;
	
	void m1() {
		a = a + 1;
		sa = sa + 1;
	}
	
	static void sm1() {
		// static이 먼저 메모리에 올라가기 때문에 인스턴스 멤버는 사용 불가능함
		// a = a + 2; 
		
		sa = sa + 2;
		
	}
	
	// 생성자는 인스턴스 멤버, 정적 멤버 다 사용할 수 있음
	// 멤버들을 전부 초기화하는 역할이기 때문!
	public A() {
		a = a + 3;
		sa = sa + 3;
		m1();
		sm1();
	}
	
	
	//내부 클래스
	class IA {
	// class IA는 new 연산자를 해야 사용이 가능함 
	//-> 클래스에 static을 붙여야 static이 붙은 멤버들을 사용할 수 있음
		int ia = 20;
		// static int isa = 20;
		
		void iaM() {
		//바깥에 있는 외부 클래스의 멤버들을 다 사용할 수 있음
			a = a + 10;
			sa = sa + 10;
			m1();
			sm1();
		}
		
		// static void isaM() {
			
		// }
		
	}
	
	static class IB {
		a = a + 20; //오류 발생
		//class B가 먼저 static으로 메모리에 올라갔기 때문에 인스턴스 멤버를 사용할 수 없음
		
	}

}
