package lambdaEx_02;

public class LambdaExample {

	public static void main(String[] args) {
		
		// 익명형 구현 클래스
		InterfaceA i1 = new InterfaceA() {
			
			@Override
			public void method() {
				System.out.println(3000);
				
			}
		};
		i1.method(); //메소드 호출
		
		
		//람다식 표현
		InterfaceA i2 = () -> {System.out.println(5000);};
		i2.method();
		

	}

}
