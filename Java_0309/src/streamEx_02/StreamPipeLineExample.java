package streamEx_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {

	public static void main(String[] args) {
		// 배열
		List<Student> list = Arrays.asList(
				new Student("홍길동", 10), 
				new Student("신용권", 20), 
				new Student("유미선", 30)
		);
		
		//방법 1)
		Stream<Student> stream = list.stream();
		//중간처리(학생 객체를 점수로 매핑)
		IntStream scoreStream = stream.mapToInt(student -> student.getScore()); //10,20,30
		//최종처리
		double avg = scoreStream.average().getAsDouble();
		
		
		//방법 2)
		double avg2 = list.stream()
				.mapToInt(student->student.getScore())
				.average()
				.getAsDouble();
		
		System.out.println("평균점수: " + avg + ", " + avg2);
		
		//합계도 구해보기!
		int sum = list.stream().mapToInt(student->student.getScore()).sum();
		System.out.println("합계: " + sum);
		
		//최대 점수도 구해보기!
		int max = list.stream().mapToInt(student->student.getScore()).max().getAsInt();
		System.out.println("최대 점수: " + max);
		 
	}

}
