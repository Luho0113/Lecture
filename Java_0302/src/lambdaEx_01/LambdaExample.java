package lambdaEx_01;

public class LambdaExample {

	public static void main(String[] args) {
		//람다식
		
		//방법 1) 구현클래스의 객체를 생성하고 재정의된 메소드를 호출하는 것
		CalculableImpl c1 = new CalculableImpl();
		c1.c();
		
		//방법 2) 인터페이스를 익명형 구현클래스로 만들고 추상 메소드를 재정의해서 사용하는 것
		Calculable c2 = new Calculable() {
			
			@Override
			public void c() {
				System.out.println("익명형 구현 클래스입니다!");
				
			}
		};
		c2.c();
		
		//방법 3) 람다식 표현
		//해당하는 인터페이스의 메소드가 1개 밖에 없는 경우 = 함수적 인터페이스 -> 메소드명을 생략할 수 있음
		Calculable c3 = () -> {System.out.println("람다식 표현입니다!"); };
		c3.c();

	}

}
