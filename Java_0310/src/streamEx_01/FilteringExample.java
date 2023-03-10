package streamEx_01;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {
		//필터링
		
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("신용권");
		list.add("김자바");
		list.add("신용권");
		list.add("신민철");
		
		//중복 요소 제거하기
		System.out.print("중복 요소 제거 : ");
		list.stream().distinct().forEach(
				n -> System.out.print(n + " ")
		);
		System.out.println();
		
		//신으로 시작하는 요소만 필터링
		//startWith() : 주어진 문자열로 시작하면 true 리턴
		System.out.print("신으로 시작하는 요소 : ");
		list.stream().filter(n->n.startsWith("신")).forEach(n->System.out.print(n + " "));
		System.out.println();
		
		//중복 요소를 먼저 제거하고 신으로 시작하는 요소만 필터링
		System.out.print("중복 제거 + 신으로 시작하는 요소 : ");
		list.stream().distinct().filter(n->n.startsWith("신")).forEach(n->System.out.print(n + " "));

	}

}
