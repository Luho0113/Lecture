package streamEx_01;

import java.util.*;
import java.util.stream.Stream;

public class ParalleStremaExample {

	public static void main(String[] args) {
		// 병렬 처리
		
		List<Integer> studentNum = new ArrayList<Integer>();
		studentNum.add(1);
		studentNum.add(2);
		studentNum.add(3);
		studentNum.add(4);
		studentNum.add(1);
		
		//스트림 만들기
		Stream<Integer> stream = studentNum.stream();
		stream.forEach( student -> System.out.print(student + " "));
		
		//IllegalStateException : stream의 forEach로 모든 요소를 꺼내서 처리했기 때문에 발생하는 오류
		stream = studentNum.stream(); //스트림을 한 번 더 생성
		stream.forEach( student -> System.out.print(student + " "));
		System.out.println();
		
		//스레드(병렬 처리) : 순서대로 출력되지 않음 
		Stream<Integer> pStream = studentNum.parallelStream();
		pStream.forEach( pStudent -> System.out.println(pStudent + " / 이름: " + Thread.currentThread().getName()));
		

	}

}
