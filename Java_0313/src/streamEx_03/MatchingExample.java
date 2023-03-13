package streamEx_03;

import java.util.Arrays;

public class MatchingExample {

	public static void main(String[] args) {
		// 학생 점수 판단하기
		
		Student[] studentArr = { 
				new Student("홍길동", 100), 
				new Student("홍길동", 80), 
				new Student("홍길동", 70),
				new Student("홍길동", 60) };

		boolean result = Arrays.stream(studentArr).allMatch(n -> n.getScore() >= 60);
		System.out.println("모두 60점이 넘습니까? : " + result);

		result = Arrays.stream(studentArr).anyMatch(n -> n.getScore() >= 80);
		System.out.println("80점 이상이 있나요? : " + result);

		result = Arrays.stream(studentArr).noneMatch(n -> n.getScore() >= 100);
		System.out.println("모두 100점 이상입니까? : " + result);

	}

}
