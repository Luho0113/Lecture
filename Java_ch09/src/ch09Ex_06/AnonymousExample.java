package ch09Ex_06;

public class AnonymousExample {

	public static void main(String[] args) {
		// 인터페이스의 익명 구현 객체를 필드와 로컬변수의 초기값, 메소드의 매개값으로 대입
		
		Anonymous anony = new Anonymous();
		
		anony.field.run();
		anony.method1();
		anony.method2(new Vehicle() {

			@Override
			public void run() {
				System.out.println("트럭이 달립니다.");

			}
		}); //익명객체의 주소를 method2메소드의 매개변수로 넣어주는 것!

	}

}
