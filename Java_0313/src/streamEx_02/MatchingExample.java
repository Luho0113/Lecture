package streamEx_02;

import java.util.Arrays;

public class MatchingExample {

	public static void main(String[] args) {
		// 요소 조건 만족 여부
		
		int[] intArr = {2,4,6};
		
		//모두 2의 배수이면 참을 출력
		boolean result = Arrays.stream(intArr).allMatch(a->a%2==0);
		System.out.println("모두 2의 배수인지 : " + result);
		
		result = Arrays.stream(intArr).anyMatch(a->a%2==0);
		System.out.println("하나라도 2의 배수가 있는지 : " + result);
		
		result = Arrays.stream(intArr).anyMatch(a->a%3==0);
		System.out.println("하나라도 3의 배수가 있는지 : " + result);
		
		result = Arrays.stream(intArr).noneMatch(a->a%3==0);
		System.out.println("3의 배수가 없는지 : " + result);
	}

}
