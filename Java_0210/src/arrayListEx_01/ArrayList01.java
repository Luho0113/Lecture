package arrayListEx_01;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		// 문자열 리스트 만들기

		List<String> list1 = new ArrayList<String>();
		// <String> 타입의 객체만 들어가게 함

		list1.add("홍길동"); // 0번
		list1.add("이순신"); // 1번
		list1.add("유관순"); // 2번

		list1.add(1, "최영"); // 1번 자리에 추가
		// 최영 > 이순신 > 유관순 순으로 순서가 밀려남

		// 해당 인덱스에서 데이터를 꺼내서 출력
		System.out.println(list1.get(0));

		// 반복문으로 돌리기
		System.out.println("--------------------------");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}

		// 항목 검색
		System.out.println("--------------------------");
		System.out.println("홍길동이 있습니까? > " + list1.contains("홍길동"));

		// 최영(1) 삭제하기
		System.out.println("--------------------------");
		System.out.println("<항목 삭제>");
		list1.remove(1); // 인덱스 번호로 삭제하기
		// 또는 list1.remove("최영"); -> 객체를 직접 삭제할 수 있음
		list1.remove(2); // 유관순 삭제

		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}

		// 전부 삭제
		System.out.println("--------------------------");
		list1.clear(); // 모든 객체를 삭제
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		System.err.println("모두 삭제했습니다.");
		System.out.println("리스트가 비어있습니까? > " + list1.isEmpty());

	}

}
