package exceptionEx_01;

public class ExcepEx01 {

	public static void main(String[] args) {
		
		try { //예외가 발생할 수 있는 코드를 작성
			System.out.println(10 / 0);
		} catch (ArithmeticException e) { //예외에 대한 클래스명 + 변수
			// 예외발생하면 처리할 코드를 작성
			System.out.println(e.getMessage());
			System.out.println("예외가 발생했습니다.");
			
		} finally {
			//예외와 상관없이 무조건 처리되는 부분
			System.out.println("데이터베이스 닫기 / 종료하기");
		}
		
	}
}
