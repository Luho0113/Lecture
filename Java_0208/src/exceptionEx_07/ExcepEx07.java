package exceptionEx_07;

public class ExcepEx07 {

	public static void main(String[] args) {
		
		try {
			B b = new B();
			b.b1();
		} catch (Exception e) {
			if (e instanceof ArithmeticException) {
				System.out.println("수학적인 예외 발생");
				System.out.println(e.getMessage());
			}else if (e instanceof ClassNotFoundException) {
				System.out.println("클래스 예외 발생");
				System.out.println(e.getMessage());
			}
			
			
		} finally {
			System.out.println("프로그램 종료");
		}
		

	}

}
