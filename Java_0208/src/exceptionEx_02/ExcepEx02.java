package exceptionEx_02;

public class ExcepEx02 {

	public static void main(String[] args) {

		try {
			int[] number = { 10, 20, 30, 40, 50};
			System.out.println(number[5]); //배열인덱스를 벗어난 예외
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
			System.out.println("예외가 발생했습니다.");
		} finally {
			System.out.println("정상 종료");
		}

	}

}
