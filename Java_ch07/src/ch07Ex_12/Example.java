package ch07Ex_12;

public class Example {
	//action메소드를 호출할 때 매개값이 C객체일 경우에만 method2가 호출되도록 작성
	
	public static void action(A a) {
		a.method1();
		
		if(a instanceof C){
			C c = (C) a; //a의 주소를 다운캐스팅
			c.method2();
		}
	}

	public static void main(String[] args) {
		action(new A());
		action(new B());
		action(new C());
		
		

	}

}
