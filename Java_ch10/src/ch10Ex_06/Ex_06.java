package ch10Ex_06;

public class Ex_06 {

	public static void main(String[] args) {
		//

		String[] strArray = { "10", "2a" };
		
		int value = 0;
		
		for (int i = 0; i <= 2; i++) {
			//i<=2 때문에 0열, 1열, 2열이 돌아가서 인덱스 초과
			
			try {
				//정수형으로 바꿔줌 -> 2a는 변경이 안됨
				value = Integer.parseInt(strArray[i]);
				
			} catch (ArrayIndexOutOfBoundsException e) {
				
				System.out.println("인덱스를 초과했음");
				
			} catch (NumberFormatException e) {
				
				System.out.println("숫자로 변환할 수 없음");
				
			} finally {
				
				System.out.println(value);
			}
		}

	}

}
