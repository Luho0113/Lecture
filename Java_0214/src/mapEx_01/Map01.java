package mapEx_01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map01 {

	public static void main(String[] args) {
		// Map 컬렉션
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//추가
		map.put("사과", 2);
		map.put("키위", 5);
		map.put("딸기", 8);
		map.put("포도", 4);
		
		
		System.out.println("사과의 value: " + map.get("사과")); //2
		System.out.println("딸기의 value: " + map.get("딸기")); //8
		
		
		//자두가 있는지 검색
		if (map.containsKey("자두")) {
			System.out.println("자두가 있습니다!");
		} else {
			System.out.println("자두가 없습니다!");
		}
		System.out.println("----------------------");
		
		
		
		//모든 키를 Set 객체에 담아서 리턴
		//Set 컬렉션 생성
		Set<String> fruit = map.keySet();
		Iterator<String> it = fruit.iterator();
		System.out.print("key만 출력: ");
		
		//전체 출력
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		//개수가 5개 이상인 과일 출력
		it = fruit.iterator();
		while(it.hasNext()) {
			String k = it.next();
			Integer v = map.get(k);
			if(v >= 5) {
				System.out.println("5개 이상인 과일: " + k);
			}
		}
		
		System.out.println("----------------------");
		//개수가 5개인 과일 검색
		System.out.println("5개인 과일 검색: " + map.containsValue(5));
		

	}

}
