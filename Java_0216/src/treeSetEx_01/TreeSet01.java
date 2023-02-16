package treeSetEx_01;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
		//TreeSet 객체 생성
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(4);
		ts.add(7);
		ts.add(4);
		ts.add(0);
		ts.add(8);
		ts.add(9);
		ts.add(2);
		
		//트리는 중복 노드를 달지 않음
		System.out.println("트리의 노드 개수: " + ts.size()); //6
		
		//모든 노드 출력
		Iterator<Integer> it = ts.iterator();
		System.out.print("iterator() 트리 전체 출력: ");
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println(" ");
		System.out.print("향상된 for문 출력: ");
		for(Integer i : ts) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("---------------------------------");
		
		//TreeSet 메소드
		System.out.println("제일 낮은 객체 출력: " + ts.first()); //0
		System.out.println("제일 높은 객체 출력: " + ts.last()); //9
		System.out.println("주어진 객체(7)의 바로 아래 객체: " + ts.lower(7)); //4
		System.out.println("주어진 객체(7)의 바로 위 객체: " + ts.higher(7)); //8
		
		//동등 객체가 있다면 리턴, 없다면 바로 아래의 객체를 리턴
		System.out.println("4의 동등 객체를 리턴: " + ts.floor(4)); //4
		System.out.println("5의 동등 객체를 리턴(floor): " + ts.floor(5)); //없으니까 4
		
		//동등 객체가 있다면 리턴, 없다면 바로 위의 객체를 리턴
		System.out.println("4의 동등 객체를 리턴: " + ts.ceiling(4)); //4
		System.out.println("5의 동등 객체를 리턴(ceiling): " + ts.ceiling(5)); //7
		
		//꺼내오고 제거하기
		System.out.println("제일 낮은 객체를 꺼내고 제거: " + ts.pollFirst()); //0
		System.out.println("제일 낮은 객체 출력: " + ts.first()); //0->2
		System.err.println("제일 높은 객체를 꺼내고 제거: " + ts.pollLast()); //9
		
		
		
		//정렬
		Iterator<Integer> iterator = ts.descendingIterator();
		System.out.print("Iterator 내림차순 정렬: ");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		System.out.print("NavigableSet 내림차순 정렬: " + ts.descendingSet());
		System.out.println();
		
	

		NavigableSet<Integer> ns = ts.descendingSet();
		System.out.println("정렬된 셋?: " + ns.first());
		
		
		//주어진 객체보다 낮은 객체들을 리턴
		SortedSet<Integer> s1 = ts.headSet(10);
		System.out.println("주어진 객체(10)보다 낮은 객체 리턴: " + s1);
		SortedSet<Integer> s2 = ts.tailSet(0);
		System.out.println("주어진 객체(0)보다 높은 객체 리턴: " + s2);
		
		//사이값 출력
		SortedSet<Integer> s3 = ts.subSet(2, true, 9, true);
		System.out.println("2이상 9이하의 객체 리턴: " + s3);
		

	}

}
