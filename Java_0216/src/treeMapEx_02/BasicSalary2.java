package treeMapEx_02;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class BasicSalary2 {

	public static void main(String[] args) {
		// TreeMap
		
		//<부서명, 이름>
		TreeMap<String, String> salary = new TreeMap<>();
		
		//엔트리 저장
		salary.put("영업부", "강정호");
		salary.put("홍보부", "김강인");
		salary.put("기획부", "김영자");
		
		//엔트리 출력하기
		System.out.println("전체 목록 출력 > ");
		Set<Entry<String, String>> salarySet = salary.entrySet();
		for(Entry<String, String> e : salarySet) {
			System.out.println(e.getKey() + " - " + e.getValue());
		}
		System.out.println();
		
		
		//내림차순 출력
		System.out.println("내림차순 출력 > ");
		NavigableMap<String, String> decendingSalary = salary.descendingMap();
		Set<Entry<String, String>> decendingSalarySet = decendingSalary.entrySet();
		for(Entry<String, String> e : decendingSalarySet) {
			System.out.println(e.getKey() + " - " + e.getValue());
		}
		System.out.println();
		
		

	}

}
