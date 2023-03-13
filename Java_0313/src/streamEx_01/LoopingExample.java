package streamEx_01;

import java.util.Arrays;

public class LoopingExample {

	public static void main(String[] args) {
		// 요소를 하나씩 처리
		// 정수 스트림에서 짝수를 하나씩 처리하기
		int[] intArr = {1,2,3,4,5};
		
		//잘못 작성하는 경우 (최종 처리가 없으므로 동작하지 않음)
		// peek = 중간 스트림
		// Arrays.stream(intArr).filter(a->a%2==0).peek(n->System.out.println(n));
		Arrays.stream(intArr).filter(a -> a % 2 == 0).peek(n -> System.out.println(n)).sum();
		System.out.println();
		
		// 중간처리 메소드 peek()를 이용해서 반복처리
		int total = Arrays.stream(intArr)
		.filter(a -> a % 2 == 0) //짝수만 true
		.peek(n -> System.out.println(n)) //true값을 출력 -> 반복
		.sum(); //집계 함수가 최종 처리
		System.out.println("총합 : " + total + "\n");
		
		//최종 처리 메소드 forEach()를 이용하는 경우
		Arrays.stream(intArr).filter(a->a%2==0).forEach(n->System.out.println(n));

	}

}
