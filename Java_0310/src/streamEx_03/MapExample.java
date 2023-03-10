package streamEx_03;

import java.util.ArrayList;
import java.util.List;

public class MapExample {

	public static void main(String[] args) {
		// 매핑
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 85));
		studentList.add(new Student("홍길동", 92));
		studentList.add(new Student("홍길동", 87));
		
		//Student를 score 스트림으로 변환하기
		studentList.stream()
		.mapToInt(s->s.getScore())
		.forEach(score->System.out.println(score));
		
		//double 스트림으로 변환하기
		List<Student2> studentList2 = new ArrayList<>();
		studentList2.add(new Student2("홍길동", 2.5));
		studentList2.add(new Student2("홍길동", 1.5));
		studentList2.add(new Student2("홍길동", 0.5));
		studentList2.stream()
		.mapToDouble(s->s.getEye())
		.forEach(eye->System.out.println(eye));
		

	}

}
