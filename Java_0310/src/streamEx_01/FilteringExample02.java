package streamEx_01;

import java.util.stream.IntStream;

public class FilteringExample02 {

	public static void main(String[] args) {
		// 숫자 범위로 스트림 얻기 (오리지날 스트림)
		// 1~100사이에서 짝수만 출력하기
		IntStream.rangeClosed(1, 100).filter(number -> number%2==0).forEach(number->System.out.println(number));

	}

}
