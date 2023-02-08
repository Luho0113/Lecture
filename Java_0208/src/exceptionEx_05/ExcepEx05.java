package exceptionEx_05;

public class ExcepEx05 {

	public static void main(String[] args) {
		
		try {
			A a = new A();
			a.a1();
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | ClassNotFoundException e) {
			
			if( e instanceof ArithmeticException) {
				System.out.println("수학적인 예외가 발생했습니다.");
			} else if ( e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("배열의 인덱스에서 예외가 발생했습니다.");
			} else if (e instanceof ClassNotFoundException ) {
				System.out.println("클래스에서 오류가 발생했습니다.");
			}
			
		} catch ( Exception e ) {
			System.out.println("모든 예외를 처리했습니다.");
		} finally {
			System.out.println("예외와 상관없이 처리해야 하는 코드 부분");
		}
		

	}

}
