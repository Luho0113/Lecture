package streamEx_06;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {

	public static void main(String[] args) {
		// sum()과 동일한 결과를 산출하는 reduce() 메소드
		
		List<Student> list = Arrays.asList(
				new Student("홍길동", 100), 
				new Student("신용권", 80), 
				new Student("김자바", 70));
		
		//방법 1
		int sum1 = list.stream().mapToInt(Student::getScore).sum();
		
		//방법 2
		int sum2 = list.stream().map(Student::getScore).reduce(0, (a, b) -> a+b);
		
		System.out.println(sum1);
		System.out.println(sum2);
		

	}

}
