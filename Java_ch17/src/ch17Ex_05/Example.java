package ch17Ex_05;

import java.util.Arrays;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		// java 라는 단어가 포함된 문자열만 필터링해서 출력하기
		
		List<String> list = Arrays.asList(
				"This is a java book", 
				"Lambda Expressions",
				"Java8 supports lambda expressions");
		
		list.stream()
		.filter(s -> s.toLowerCase().contains("java"))
		.forEach(s -> System.out.println(s));

	}

}
