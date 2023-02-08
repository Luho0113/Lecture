package exceptionEx_03;

public class ExcepEx03 {

	public static void main(String[] args) {
		
		try {
			//예외1
			Class.forName("java.lang.String"); 
			//예외2
			int a = 10/0; 
			//예외3
			int[] number = {10, 20, 30, 40, 50};
			System.out.println(number[5]);
			
		} catch (ClassNotFoundException e) {
			//예외1이 발생하면 실행됨
			System.out.println("class에 대한 예외입니다.");
			
		} catch(ArithmeticException e){
			//예외2가 발생하면 실행됨
			System.out.println("수학적으로 잘못된 예외입니다.");
			
		} catch(ArrayIndexOutOfBoundsException e){
			//예외3이 발생하면 실행됨
			System.out.println("배열인덱스를 벗어난 예외입니다.");
			
		} finally {
			System.out.println("종료하기");
		}
	}

}
