package streamEx_02;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {
		// 나이가 20대 미만인 학생만 출력하기
		List<Student> list = Arrays.asList(
				new Student("학생1", 10),
				new Student("학생2", 15),
				new Student("학생3", 20),
				new Student("학생4", 25),
				new Student("학생5", 30)
		);
		
		list.stream()
		.filter(age-> age.getAge()<20)
		.forEach(student -> System.out.println(student.getName() + " " + student.getAge()));
		System.out.println();
		
		//성이 김, 나이가 20인 학생만 출력하기
		List<Student> list2 = Arrays.asList(
				new Student("김학생", 10),
				new Student("이학생", 15),
				new Student("김학생", 20),
				new Student("박학생", 25),
				new Student("최학생", 30)
		);
		
		list2.stream()
		.distinct()
		.filter(n -> n.getName().startsWith("김") && n.getAge() == 20)
		.forEach(student -> System.out.println(student.getName() + " " + student.getAge()));
	}

}
