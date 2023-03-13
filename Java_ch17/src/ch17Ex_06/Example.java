package ch17Ex_06;

import java.util.Arrays;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		// Member의 평균 나이를 출력

		List<Member> list = Arrays.asList(
				new Member("홍길동", 30), 
				new Member("신용권", 40), 
				new Member("감자바", 26));
		
		double avg = list.stream().mapToDouble(Member::getAge).average().getAsDouble();

		System.out.println("평균 나이: " + avg);

	}

}
