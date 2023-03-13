package streamEx_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {

	public static void main(String[] args) {
		// 요소 수집하기
		
		List<Student> totalList = new ArrayList<>();
		totalList.add(new Student("김민수", "남", 92));
		totalList.add(new Student("김민지", "여", 87));
		totalList.add(new Student("오수빈", "여", 95));
		totalList.add(new Student("박철수", "남", 93));
		
		List<Student> femaleList = totalList.stream()
		.filter(s -> s.getGender().equals("여"))
		.collect(Collectors.toList());
		
		femaleList.stream().forEach(s -> System.out.println(s.getName()));
		System.out.println();
		
		//학생이름=키, Student객체=값을 가지는 Map 생성
		Map<String, Integer> map = totalList.stream()
		.collect(Collectors.toMap(s -> s.getName(), s -> s.getScore()));
		System.out.println(map);

	}

}
