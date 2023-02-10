package arrayListEx_01;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		// 숫자 리스트 만들기

		List<Integer> list2 = new ArrayList<Integer>();

		// 1~10까지 항목 추가
		for (int i = 1; i <= 10; i++) {
			list2.add(i);
		}

		System.out.println("1부터 10까지 출력");
		for (int i = 0; i < list2.size(); i++) {
			System.out.print(list2.get(i) + " ");
		}
		System.out.println();

		// 5번 인덱스 위치에 50으로 교체하기
		System.out.println("------------------------");
		System.out.println("5번에 50추가하기");
		list2.set(5, 50);
		for (int i = 0; i < list2.size(); i++) {
			System.out.print(list2.get(i) + " ");
		}

	}

}
