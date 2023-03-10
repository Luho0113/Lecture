package streamEx_06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingExample {

	public static void main(String[] args) {
		// 구현 객체의 정렬
		
		//List 컬렉션 생성
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 30),
				new Student("신용권", 10),
				new Student("유미선", 20)
		);
		
		//점수를 기준으로 오름차순 정렬한 새 스트림 얻기
		studentList.stream()
		.sorted()
		.forEach(s->System.out.println(s.getName() + ": " + s.getScore()));
		System.out.println();
		
		//점수를 기준으로 내림차순 정렬한 새 스트림 얻기
		studentList.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(s->System.out.println(s.getName() + ": " + s.getScore()));

	}

}
