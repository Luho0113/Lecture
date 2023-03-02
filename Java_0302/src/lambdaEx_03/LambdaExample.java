package lambdaEx_03;

public class LambdaExample {

	public static void main(String[] args) {

		// 익명 구현 객체
		InterfaceB i1 = new InterfaceB() {

			@Override
			public void methodB(int b1, double b2) {
				System.out.println(b1 + " " + b2);
			}
		};
		i1.methodB(1, 1.1);
		
		//람다식 1
		InterfaceB i2 = (int b1, double b2) -> {
			System.out.println(b1 + " " + b2);
		};
		i2.methodB(2, 2.2);
		
		
		//람다식 2
		InterfaceB i3 = (b1, b2) -> System.out.println(b1 + " " + b2);
		i3.methodB(3, 3.3);

	}

}
