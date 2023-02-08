package exceptionEx_04;

public class ExcepEx04 {

	public static void main(String[] args) {
		
		int a = 10;
		int k = 0;
		
		try {
			//경우1
			Class.forName("java.lang.String"); 
			//경우2
			a = 10/k; 
			//경우3
			int[] number = {10, 20, 30, 40, 50};
			System.out.println(number[5]);
			
		} catch (ArithmeticException e) {
			
			if (k == 0) {
				k = 5;
				System.out.println(a/k);
			}
			//작은 수준의 예외부터 처리
			System.out.println("수학적으로 발생하는 오류입니다.");
			
		} catch (Exception e) { 
			
			//Exception 이라는 예외 클래스
			System.out.println("모든 예외를 처리합니다.");
			System.out.println(e.getMessage());
			
		} finally {
			System.out.println("종료하기");
		}

	}

}
