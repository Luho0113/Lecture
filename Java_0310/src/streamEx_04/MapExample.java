package streamEx_04;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample {

	public static void main(String[] args) {
		// 매핑
		
		int[] intArray = {1,2,3,4,5};
	
		IntStream intStream = Arrays.stream(intArray); //배열을 스트림으로 생성
		//기본 타입간의 변환 : int -> double 변환
		intStream.asDoubleStream().forEach(i->System.out.print(i + " "));
		System.out.println();
		
		//기본 타입 요소 -> 래퍼 객체 요소 변환
		intStream = Arrays.stream(intArray);
		intStream.boxed().forEach(obj->System.out.println(obj.intValue()));

	}

}
