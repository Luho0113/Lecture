package exceptionEx_05;

public class A {
	
	public void a1() throws ArithmeticException, ArrayIndexOutOfBoundsException, ClassNotFoundException {
		a2();
		
		Class.forName("java.lang.String");
	}
	
	public void a2() throws ArithmeticException, ArrayIndexOutOfBoundsException {
		//, 로 예외 처리 클래스를 구분
		a3();
		int[] number = {1,2,3};
		System.out.println(number[2]);
	}
	public void a3() throws ArithmeticException { //예외 떠넘기기
		//호출하는 곳에다가 예외를 떠넘김
		//int a = 10/0; -> 예외발생
		int a = 10/5;
		
		
	}
}
