package ch17Ex_07;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {

	public static void main(String[] args) {
		// 리스 중에서 직업이 개발자인 Member만 별도의 List에 수집
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"), 
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자"));

		List<Member> developers = list.stream()
		.filter(s -> s.getJob().equals("개발자"))
		.collect(Collectors.toList());

		developers.stream().forEach(m -> System.out.println(m.getName()));
	}

}
