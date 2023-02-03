package ch08Ex_08;

public class Example {
	

	public static void action (A a) { //매개변수 a의 타입이 인스턴스
		
		//method1() 수행
		a.method1();
		
		if (a instanceof C) { //참조변수가 C클래스 타입인지 판별
			//매개값이 C객체일 경우에만 method2가 호출
			C c = (C) a; //a 주소를 C라는 클래스(객체)로 타운캐스팅
			c.method2();
		}
	}

	public static void main(String[] args) {
		
		action(new B());
		action(new C());

	}
	

}
