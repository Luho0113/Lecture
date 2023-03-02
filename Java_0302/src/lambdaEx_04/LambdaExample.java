package lambdaEx_04;

public class LambdaExample {

	public static void main(String[] args) {
		
		InterfaceC c1 = new InterfaceC() {
			
			@Override
			public int methodC(int a, int b, boolean c) {
				System.out.println(a + " " + b + " " + c);
				return a+b;
			}
		};
		int result1 = c1.methodC(1, 2, false);
		System.out.println(result1); //3
		System.out.println();
		
		
		InterfaceC c2 = (int a, int b, boolean c)->{
			System.out.println(a + " " + b + " " + c);
			return a+b;
		};
		int result2 = c2.methodC(10, 20, true);
		System.out.println(result2);
		System.out.println();
		
		
		//처리하는 내용이 1개일때만 return 생략 가능
		InterfaceC c3 = (a, b, c)-> a+b;
		int result3 = c3.methodC(100, 200, true);
		System.out.println(result3);
		
		

	}

}
