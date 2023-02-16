package treeSetEx_02;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class BasicSalary {

	public static void main(String[] args) {
		//트리 생성
		TreeSet<Integer> bs = new TreeSet<>();
		TreeSet<String> rank = new TreeSet<>();
		
		//기본 금액
		bs.add(3500000);
		bs.add(2150000);
		bs.add(2200000);
		bs.add(2700000);
		bs.add(2750000);
		
		//직급 (가다나순으로 정렬됨)
		rank.add("과장"); 
		rank.add("대리"); 
		rank.add("부장"); 
		rank.add("사원"); 
		
		
		
		
		//가장 높은 금액
		System.out.println("가장 높은 금액: " + bs.last());
		
		//가장 낮은 금액
		System.out.println("가장 낮은 금액: " + bs.first());
		
		//기본급 오름차순
		System.out.print("오름차순 정렬: ");
		for(Integer i : bs) {
			System.out.print(i + " ");
		}
		System.out.println();
		// = System.out.println(rank);
		
		
		//기본급 내림차순
		System.out.println("내림차순 정렬 1): " + bs.descendingSet());
		System.out.print("내림차순 정렬 2): ");
		Iterator<Integer> it = bs.descendingIterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		
		//사이값
		NavigableSet<Integer> rangeSet = bs.subSet(2500000, true, 3500000, true);
		System.out.print("250만원 이상 350만원 이하 : ");
		for(Integer s : rangeSet) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		
		System.out.println("--------------------------------");
		//직급의 개수는?
		System.out.println("직급의 개수: " + rank.size());
		
		// 부장 바로 아래
		System.out.println("부장 아래 직급: " + rank.lower("부장")); // 사원

		// 대리 바로 위
		System.out.println("대리 위 직급: " + rank.higher("대리")); // 과장
		
		
		//오름차순 정렬
		System.out.print("오름차순 정렬: ");
		for(String r : rank) {
			System.out.print(r + " ");
		}
		System.out.println();
		
		
		
		//내림차순 정렬
		System.out.println("내림차순 정렬 1): " + rank.descendingSet());
		System.out.print("내림차순 정렬 2): ");
		Iterator<String> rankIt = rank.descendingIterator();
		while(rankIt.hasNext()) {
			System.out.print(rankIt.next() + " ");
		}
		System.out.println();
		
		
		
		

	}

}
