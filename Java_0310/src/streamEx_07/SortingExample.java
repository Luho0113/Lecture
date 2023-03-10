package streamEx_07;

import java.util.Arrays;
import java.util.List;

public class SortingExample {

	public static void main(String[] args) {
		//Comparator를 이용한 정렬
		
		//List 컬렉션 생성
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 30), 
				new Student("신용권", 10),
				new Student("유미선", 20)
		);
		
		//점수를 기준으로 오름차순으로 정렬
		studentList.stream().sorted((s1, s2)->Integer.compare(s1.getScore(), s2.getScore())).forEach(s->System.out.println(s.getName() + ": " + s.getScore()));
		System.out.println();
		
		//점수를 기준으로 내림차순 정렬
		studentList.stream().sorted((s1, s2)->Integer.compare(s2.getScore(), s1.getScore())).forEach(s->System.out.println(s.getName() + ": " + s.getScore()));
		

	}

}
