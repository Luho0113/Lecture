package collectionStreamEx_02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		// 배열로부터 스트림 얻기
		
		String[] strArray = { "홍길동", "신용권", "김미나" };
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(item -> System.out.print(item + ", "));
		//Arrays.stream(strArray).forEach();
		System.out.println();

		int[] intArray = { 1, 2, 3, 4, 5 };
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(item -> System.out.print(item + ", "));
		System.out.println();
		
		//합계 출력하기
		int sum = Arrays.stream(intArray).sum();
		System.out.println(sum);
		
	}

}
