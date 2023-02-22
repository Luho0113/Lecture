package mathEx_02;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// 선택 번호
		int[] selectNumber = new int[6]; //선택번호 6개를 저장할 배열
		
		//Random 객체 생성
		Random random = new Random(3); //종자값=3
		System.out.print("선택번호: ");
		
		//선택번호 6개를 얻어서 배열에 저장
		for(int i = 0; i<6; i++) {
			selectNumber[i] = random.nextInt(45)+1;
			//ramdom.nextInt : 0<=N<45 -> 0+1<=N<46
			//1~45 범위의 정수 숫자만 선택
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		//당첨 번호
		int[] winNumber = new int[6]; 
		
		random = new Random(5); //종자값=5
		//선택 번호의 종자값과 다르기 때문에 다른 난수를 얻음(같으면 동일한 난수를 얻음)
		
		System.out.print("당첨 번호: ");
		for(int i = 0; i<6; i++) {
			winNumber[i] = random.nextInt(45)+1;
			System.out.print(winNumber[i] + " ");
		}
		System.out.println();
		
		//당첨 여부
		//배열을 정렬
		Arrays.sort(selectNumber);
		Arrays.sort(winNumber);
		
		boolean result = Arrays.equals(selectNumber, winNumber);
		System.out.print("당첨 여부: ");
		if(result) {
			System.out.println("1등에 당첨되셨습니다.");
		} else {
			System.out.println("당첨되지 않았습니다.");
		}
		

	}

}
